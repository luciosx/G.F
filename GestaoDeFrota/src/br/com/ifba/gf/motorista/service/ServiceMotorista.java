/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.motorista.service;

import br.com.ifba.gf.infrastructure.exception.BusinessException;
import br.com.ifba.gf.motorista.dao.IMotoristaDAO;
import br.com.ifba.gf.motorista.dao.MotoristaDAO;
import br.com.ifba.gf.motorista.model.Motorista;
import java.util.List;

/**
 *
 * @author iagow
 */
public class ServiceMotorista implements IServiceMotorista{
    
    //Representa mensagem de erro se o motorista for null
    public final static String MOTORISTA_NULL = "Motorista null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IMotoristaDAO motoristaDAO = new MotoristaDAO();
    
    //Salva o produto
    @Override
    public Motorista saveMotorista(Motorista motorista) {
        
        if(motorista == null){
            //Tratamento de exceção
            throw new BusinessException(MOTORISTA_NULL);
        }
        
        return this.motoristaDAO.save(motorista);
    }
    
    @Override
    public List <Motorista> findByCPF(String cpf){
        return this.motoristaDAO.findByCPF(cpf);
    }
    
}
