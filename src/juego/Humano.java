/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import io.ManejoDatos;


/**
 *
 * @author usuario
 */
public class Humano extends Player{
    //CONSTRUCTOR
    
    public Humano(String name, int attackPoints, int defensePoints, int life){
        super(name, attackPoints, defensePoints, life);
       System.out.println("Se ha creado un Humano");
       if (life > 100){
       setLife(100);}
    }
    
    
    
   
}
