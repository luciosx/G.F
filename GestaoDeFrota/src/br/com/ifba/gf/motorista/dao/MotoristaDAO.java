/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.motorista.dao;

import br.com.ifba.gf.infrastructure.dao.GenericDAO;
import br.com.ifba.gf.motorista.model.Motorista;
import java.util.List;

/**
 *
 * @author iagow
 */
public class MotoristaDAO extends GenericDAO<Motorista> implements IMotoristaDAO {
    
    @Override
    public List <Motorista> findByCPF(String cpf){
        
        String query = "select m from Motorista m where upper(m.cpf) like upper ('"+ cpf +"%')";
        
        return GenericDAO.entityManager.createQuery(query).getResultList();
    }
    
    
}
