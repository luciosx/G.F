/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.veiculo.service;

import br.com.ifba.gf.infrastructure.exception.BusinessException;
import br.com.ifba.gf.veiculo.dao.IVeiculoDAO;
import br.com.ifba.gf.veiculo.dao.VeiculoDAO;
import br.com.ifba.gf.veiculo.model.Veiculo;

/**
 *
 * @author iagow
 */
public class ServiceVeiculo implements IServiceVeiculo {
    
    //Representa mensagem de erro se o motorista for null
    public final static String VEICULO_NULL = "Veiculo null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IVeiculoDAO veiculoDAO = new VeiculoDAO();
    
    //Salva o produto
    @Override
    public Veiculo saveVeiculo(Veiculo veiculo) {
        
        if(veiculo == null){
            //Tratamento de exceção
            throw new BusinessException(VEICULO_NULL);
        }
        
        return this.veiculoDAO.save(veiculo);
    }
    
}
