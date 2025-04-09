package com.example.SistemaRPG.Character.CharacterModel;

import com.example.SistemaRPG.MagicItem.MagicItemModels.MagicItemDTO;
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

    @OneToMany
    private List<MagicItemModel> listaItens;

    private int forcaBase;
    private int defesaBase;

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

    public int getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(int forca) {
        this.forcaBase = forca;
    }

    public int getDefesaBase() {
        return defesaBase;
    }

    public void setDefesaBase(int defesa) {
        this.defesaBase = defesa;
    }
}
