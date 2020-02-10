/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.motorista.dao;

import br.com.ifba.gf.infrastructure.dao.IGenericDAO;
import br.com.ifba.gf.motorista.model.Motorista;
import java.util.List;

/**
 *
 * @author iagow
 */
public interface IMotoristaDAO extends IGenericDAO<Motorista> {
    
    public abstract List <Motorista> findByCPF(String cpf);
    
}
