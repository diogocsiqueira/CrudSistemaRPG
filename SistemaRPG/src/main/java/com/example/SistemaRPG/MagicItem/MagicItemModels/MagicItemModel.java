package com.example.SistemaRPG.MagicItem.MagicItemModels;

import jakarta.persistence.*;

@Entity
@Table(name = "itens_magicos")
public class MagicItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private MagicItemTypeEnum tipo;

    private int forca;
    private int defesa;

    public MagicItemModel(){}

    public MagicItemModel(MagicItemModel item){
        this.id = item.getId();
        this.nome = item.getNome();
        this.tipo = item.getTipo();
        this.forca = item.getForca();
        this.defesa = item.getDefesa();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MagicItemTypeEnum getTipo() {
        return tipo;
    }

    public void setTipo(MagicItemTypeEnum tipo) {
        this.tipo = tipo;
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
