package com.example.SistemaRPG.MagicItem;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemDTO;
import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemModel;
import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagicItemService {

    @Autowired
    MagicItemRepository magicItemRepository;

    public MagicItemDTO cadastrarItem(MagicItemDTO magicItemDTO){

        if (magicItemDTO.getTipo() == null) {
            throw new IllegalArgumentException("Tipo de item mágico é obrigatório. Tipos permitidos: ARMA, ARMADURA, AMULETO");
        }

        if (magicItemDTO.getTipo() == MagicItemTypeEnum.ARMA && magicItemDTO.getDefesa() != 0) {
            throw new IllegalArgumentException("Itens do tipo ARMA devem ter defesa igual a zero");
        }
        if (magicItemDTO.getTipo() == MagicItemTypeEnum.ARMADURA && magicItemDTO.getForca() != 0) {
            throw new IllegalArgumentException("Itens do tipo ARMADURA devem ter força igual a zero");
        }

        if (magicItemDTO.getForca() > 10 || magicItemDTO.getDefesa() > 10) {
            throw new IllegalArgumentException("Força e Defesa não podem exceder 10");
        }

        if (magicItemDTO.getForca() == 0 && magicItemDTO.getDefesa() == 0) {
            throw new IllegalArgumentException("Itens mágicos não podem ter força e defesa iguais a zero");
        }

        MagicItemModel item = new MagicItemModel();
        item.setNome(magicItemDTO.getNome());
        item.setTipo(magicItemDTO.getTipo());
        item.setForca(magicItemDTO.getForca());
        item.setDefesa(magicItemDTO.getDefesa());

        MagicItemModel savedItem = magicItemRepository.save(item);

        return new MagicItemDTO(savedItem);
    }
}
