package com.example.SistemaRPG.Character;

import com.example.SistemaRPG.Character.CharacterModel.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personagem")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping
    public ResponseEntity<CharacterDTO> cadastrarPersonagem(@RequestBody CharacterDTO characterDTO){
        CharacterDTO criado = characterService.cadastrarPersonagem(characterDTO);
        return ResponseEntity.ok(criado);
    }

}
