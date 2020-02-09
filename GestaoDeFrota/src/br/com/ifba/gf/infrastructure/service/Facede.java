/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.infrastructure.service;

import br.com.ifba.gf.motorista.model.Motorista;
import br.com.ifba.gf.motorista.service.IServiceMotorista;
import br.com.ifba.gf.motorista.service.ServiceMotorista;
import br.com.ifba.gf.veiculo.model.Veiculo;
import br.com.ifba.gf.veiculo.service.IServiceVeiculo;
import br.com.ifba.gf.veiculo.service.ServiceVeiculo;

/**
 *
 * @author lucio
 */
public class Facede implements IFacede {
    
    //-------------MOTORISTA-------------
    
    private final IServiceMotorista serviceMotorista = new ServiceMotorista();
    
    public Motorista saveMotorista(Motorista motorista){
        return this.serviceMotorista.saveMotorista(motorista);
    }
    

    
    
    //-------------VEICULO-------------
    
    private final IServiceVeiculo serviceVeiculo = new ServiceVeiculo();
    
    public Veiculo saveVeiculo(Veiculo veiculo){
        return this.serviceVeiculo.saveVeiculo(veiculo);
    }
}
