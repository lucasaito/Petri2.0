package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "medicamento")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedicamento;

    @Column(name = "NOME_MEDICAMENTO")
    private String nomeMedicamento;

    @Column(name = "DOSAGEM_MEDICAMENTO")
    private int dosagemMedicamento;

    @Column(name = "QUANTIDADE_MEDICAMENTO")
    private int quantidadeMedicamento;

    @Column(name = "VIA_MEDICAMENTO")
    private String viaMedicamento;

    @Column(name = "OBSERVACOES")
    private String observacoes;

    public long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getViaMedicamento() {
        return viaMedicamento;
    }

    public void setViaMedicamento(String viaMedicamento) {
        this.viaMedicamento = viaMedicamento;
    }

    public int getDosagemMedicamento() {
        return dosagemMedicamento;
    }

    public void setDosagemMedicamento(int dosagemMedicamento) {
        this.dosagemMedicamento = dosagemMedicamento;
    }

    public int getQuantidadeMedicamento() {
        return quantidadeMedicamento;
    }

    public void setQuantidadeMedicamento(int quantidadeMedicamento) {
        this.quantidadeMedicamento = quantidadeMedicamento;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento medicamento = (Medicamento) o;
        return idMedicamento == medicamento.idMedicamento && Objects.equals(nomeMedicamento, medicamento.nomeMedicamento) && Objects.equals(crmMedico, medico.crmMedico) && Objects.equals(assinatura, medico.assinatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMedico, nomeMedico, crmMedico, assinatura);
    }
}
