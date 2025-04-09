package com.example.SistemaRPG.MagicItem;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface magicItemRepository extends JpaRepository<MagicItemModel, Integer> {
}
