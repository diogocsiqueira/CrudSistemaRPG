package com.example.SistemaRPG.Character.CharacterModel;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemDTO;
import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemModel;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterDTO {
    private int id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    private String nomeAventureiro;

    @NotNull(message = "Classe é obrigatória")
    private CharacterClassesEnum classe;

    @Min(value = 1, message = "Level deve ser pelo menos 1")
    private int level;

    private List<MagicItemModel> itensMagicos;

    @Min(value = 0, message = "Força base não pode ser negativa")
    @Max(value = 10, message = "Força base não pode exceder 10")
    private int forcaBase;

    @Min(value = 0, message = "Defesa base não pode ser negativa")
    @Max(value = 10, message = "Defesa base não pode exceder 10")
    private int defesaBase;

    private int forcaTotal;
    private int defesaTotal;

    public CharacterDTO() {}

    public CharacterDTO(CharacterModel characterModel) {
        this.id = characterModel.getId();
        this.nome = characterModel.getNome();
        this.nomeAventureiro = characterModel.getNomeAventureiro();
        this.classe = characterModel.getClasse();
        this.level = characterModel.getLevel();
        this.forcaBase = characterModel.getForcaBase();
        this.defesaBase = characterModel.getDefesaBase();
        this.itensMagicos = characterModel.getListaItens().stream()
                .map(MagicItemModel::new)
                .collect(Collectors.toList());
        calcularAtributosTotais();
    }

    private void calcularAtributosTotais() {
        this.forcaTotal = this.forcaBase;
        this.defesaTotal = this.defesaBase;

        if (this.itensMagicos != null) {
            for (MagicItemModel item : this.itensMagicos) {
                this.forcaTotal += item.getForca();
                this.defesaTotal += item.getDefesa();
            }
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNomeAventureiro() { return nomeAventureiro; }
    public void setNomeAventureiro(String nomeAventureiro) { this.nomeAventureiro = nomeAventureiro; }
    public CharacterClassesEnum getClasse() { return classe; }
    public void setClasse(CharacterClassesEnum classe) { this.classe = classe; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public List<MagicItemModel> getItensMagicos() { return itensMagicos; }
    public void setItensMagicos(List<MagicItemModel> itensMagicos) {
        this.itensMagicos = itensMagicos;
        calcularAtributosTotais(); // Recalcula ao setar itens
    }
    public int getForcaBase() { return forcaBase; }
    public void setForcaBase(int forcaBase) { this.forcaBase = forcaBase; }
    public int getDefesaBase() { return defesaBase; }
    public void setDefesaBase(int defesaBase) { this.defesaBase = defesaBase; }
    public int getForcaTotal() { return forcaTotal; }
    public int getDefesaTotal() { return defesaTotal; }
}