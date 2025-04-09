package com.example.SistemaRPG.Character.CharacterModel;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personagens")
public class CharacterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String nomeAventureiro;

    @Enumerated(EnumType.STRING)
    private CharacterClassesEnum classe;

    private int level;
    private List<MagicItemModel> listaItens;
    private int forca;
    private int defesa;

    public int getId() {
        return id;
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

    public void setClasses(CharacterClassesEnum classes) {
        this.classe = classes;
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
