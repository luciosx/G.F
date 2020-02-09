/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.infrastructure.service;

import br.com.ifba.gf.motorista.model.Motorista;
import br.com.ifba.gf.motorista.service.IServiceMotorista;
import br.com.ifba.gf.motorista.service.ServiceMotorista;

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
    

}
