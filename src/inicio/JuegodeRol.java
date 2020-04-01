/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import juego.*;
import io.ManejoDatos;





/**
 *
 * @author usuario
 */
public class JuegodeRol {
    public static void main(String[] args){
         
        pruebaFase();
        System.out.println("inserta algo!");
        
    
    
    }
    
    public static void pruebaFase(){
        System.out.println("Se está creando un Alien");
        Player a1 = new Alien();
        System.out.println("Se está creando un Humano");
        Player h1 = new Humano();
        System.out.println("Se está creando un Warrior");
        Player w1 = new Warrior();
        
        
    }

    

   
}
