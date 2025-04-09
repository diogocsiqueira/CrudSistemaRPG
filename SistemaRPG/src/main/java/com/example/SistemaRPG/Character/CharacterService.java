package com.example.SistemaRPG.Character;

import com.example.SistemaRPG.Character.CharacterModel.CharacterDTO;
import com.example.SistemaRPG.Character.CharacterModel.CharacterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository characterRepository;

    public CharacterDTO cadastrarPersonagem(CharacterDTO characterDTO){

        if (characterDTO.getForcaBase() + characterDTO.getDefesaBase() > 10) {
            throw new IllegalArgumentException("A soma de Força Base e Defesa Base não pode exceder 10");
        }
        CharacterModel characterModel = new CharacterModel();
        characterModel.setNome(characterDTO.getNome());
        characterModel.setNomeAventureiro(characterDTO.getNomeAventureiro());
        characterModel.setLevel(characterDTO.getLevel());
        characterModel.setClasses(characterDTO.getClasse());
        characterModel.setListaItens(characterDTO.getItensMagicos());
        characterModel.setForcaBase(characterDTO.getForcaBase());
        characterModel.setDefesaBase(characterDTO.getDefesaBase());
        characterModel = characterRepository.save(characterModel);

        return new CharacterDTO(characterModel);
    }
}
