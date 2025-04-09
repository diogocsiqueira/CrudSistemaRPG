package com.example.SistemaRPG.Character.CharacterModel;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemModel;

import java.util.List;

public class CharacterDTO {
    private int id;
    private String nome;
    private String nomeAventureiro;
    private CharacterClassesEnum classe;
    private int level;
    private List<MagicItemModel> listaItens;
    private int forca;
    private int defesa;

    public CharacterDTO(){}
    public CharacterDTO(CharacterModel characterModel){
        this.nome = characterModel.getNome();
        this.nomeAventureiro = characterModel.getNomeAventureiro();
        this.classe = characterModel.getClasse();
        this.listaItens = characterModel.getListaItens();
        this.forca = characterModel.getForca(); //implementar a saíde de força com itens
        this.defesa = characterModel.getDefesa(); //msm coisa
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAventureiro() {
        return nomeAventureiro;
    }

    public void setNomeAventureiro(String nomeAventureiro) {
        this.nomeAventureiro = nomeAventureiro;
    }

    public CharacterClassesEnum getClasse() {
        return classe;
    }

    public void setClasse(CharacterClassesEnum classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<MagicItemModel> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<MagicItemModel> listaItens) {
        this.listaItens = listaItens;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
