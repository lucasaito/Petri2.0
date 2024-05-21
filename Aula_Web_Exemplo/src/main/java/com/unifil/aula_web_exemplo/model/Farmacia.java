package com.unifil.aula_web_exemplo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "farmacia")
public class Farmacia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFarmacia;

    @Column(name = "CNPJ_FARMACIA")
    private int cnpj;

    @Column(name = "SENHA_FARMACIA")
    private int senhaFarmacia;

    public long getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(long idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getSenhaFarmacia() {
        return senhaFarmacia;
    }

    public void setSenhaFarmacia(int senhaFarmacia) {
        this.senhaFarmacia = senhaFarmacia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmacia farmacia = (Farmacia) o;
        return idFarmacia == farmacia.idFarmacia && Objects.equals(cnpj, farmacia.cnpj) && Objects.equals(senhaFarmacia, farmacia.senhaFarmacia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFarmacia, cnpj, senhaFarmacia);
    }
}
