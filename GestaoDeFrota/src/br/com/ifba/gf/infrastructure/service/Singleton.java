/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.gf.infrastructure.service;

/**
 *
 * @author lucio
 */
public class Singleton extends Facede {
    
    /**
     * Represents the singleton instance of the class.
     */
    private static Singleton instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public Singleton() {
        super();
    }
    
    /**
     * Return a new instance of Fachada if there's not.
     * @return 
     */
    public static Singleton getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    
}

