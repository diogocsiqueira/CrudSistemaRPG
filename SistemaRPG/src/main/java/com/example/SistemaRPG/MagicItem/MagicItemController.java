package com.example.SistemaRPG.MagicItem;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class MagicItemController {

    @Autowired
    MagicItemService magicItemService;

    @PostMapping
    public ResponseEntity<MagicItemDTO> cadastrarItem(@RequestBody MagicItemDTO magicItemDTO){
        MagicItemDTO criado = magicItemService.cadastrarItem(magicItemDTO);
        return ResponseEntity.ok(criado);
    }
}
