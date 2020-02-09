/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.veiculo.model;

import br.com.ifba.gf.infrastructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author iagow
 */
@Entity
public class Veiculo extends AbstractEntity implements Serializable {
    
    private String tipoVeiculo;
    private String modeloVeiculo;
    private String placaVeiculo;
    private int numeroChassi;
    private String estadoVeiculo;
    private String veiculoApto;

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public int getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(int numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public void setEstadoVeiculo(String estadoVeiculo) {
        this.estadoVeiculo = estadoVeiculo;
    }

    public String getVeiculoApto() {
        return veiculoApto;
    }

    public void setVeiculoApto(String veiculoApto) {
        this.veiculoApto = veiculoApto;
    }
    
}
