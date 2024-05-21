package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMedico;

    @Column(name = "NOME_MEDICO")
    private String nomeMedico;

    @Column(name = "CRM_MEDICO")
    private int crmMedico;

    @Column(name = "ASSINATURA")
    private String assinatura;

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public int getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(int crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return idMedico == medico.idMedico && Objects.equals(nomeMedico, medico.nomeMedico) && Objects.equals(crmMedico, medico.crmMedico) && Objects.equals(assinatura, medico.assinatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMedico, nomeMedico, crmMedico, assinatura);
    }

}
