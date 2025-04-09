package com.example.SistemaRPG.Character;

import com.example.SistemaRPG.Character.CharacterModel.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterModel, Integer> {
}
