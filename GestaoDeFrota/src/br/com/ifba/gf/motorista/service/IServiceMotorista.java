/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.motorista.service;

import br.com.ifba.gf.motorista.model.Motorista;
import java.util.List;

/**
 *
 * @author iagow
 */
public interface IServiceMotorista {
    
    public abstract Motorista saveMotorista(Motorista motorista);
    
    public abstract List <Motorista> findByCPF(String cpf);
}
