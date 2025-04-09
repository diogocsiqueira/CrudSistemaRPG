package com.example.SistemaRPG.MagicItem.MagicItemModels;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MagicItemDTO {
    private int id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Tipo é obrigatório")
    private MagicItemTypeEnum tipo;

    @Min(value = 0, message = "Força não pode ser negativa")
    @Max(value = 10, message = "Força não pode exceder 10")
    private int forca;

    @Min(value = 0, message = "Defesa não pode ser negativa")
    @Max(value = 10, message = "Defesa não pode exceder 10")
    private int defesa;


    public MagicItemDTO() {}

    public MagicItemDTO(MagicItemModel item) {
        this.id = item.getId();
        this.nome = item.getNome();
        this.tipo = item.getTipo();
        this.forca = item.getForca();
        this.defesa = item.getDefesa();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public MagicItemTypeEnum getTipo() { return tipo; }
    public void setTipo(MagicItemTypeEnum tipo) { this.tipo = tipo; }
    public int getForca() { return forca; }
    public void setForca(int forca) { this.forca = forca; }
    public int getDefesa() { return defesa; }
    public void setDefesa(int defesa) { this.defesa = defesa; }
}
