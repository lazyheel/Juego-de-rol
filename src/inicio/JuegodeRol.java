/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import io.ManejoDatos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import juego.*;





/**
 *
 * @author usuario
 */
public class JuegodeRol {
    public static void main(String[] args) throws IOException{
    // new ManejoDatos().s.nextInt() solicitar Int
    //new ManejoDatos().in.readLine() solicitar String
    
    
    pruebaFase();
    
    }
    
    public static void pruebaFase() throws IOException{
        System.out.println("Se está creando un Alien");
        Alien a1 = new Alien("Sultan",10,5,60);
        System.out.println("Se está creando un Humano");
        Humano h1 = new Humano("Jose",6,3,90);
        System.out.println("Se está creando un Warrior");
        Warrior w1 = new Warrior("Popeye",12,4,70);
        
        
        int a1vida = a1.getLife();
        int h1vida = h1.getLife();
        int w1vida = w1.getLife();
        
        
        
        
        
        w1.attack(a1);
        w1.attack(h1);
        a1.attack(w1);
        a1.attack(h1);
        h1.attack(w1);
        h1.attack(a1);
        a1.attack(w1);
        w1.attack(a1);
        a1.attack(h1);
        h1.attack(a1);
        a1.attack(w1);
        if(w1.getLife() < 0){System.out.println("Error en los puntos de vida del Warrior ");}
        if(a1.getLife() < 0){System.out.println("Error en los puntos de vida del alien ");}
        if(h1.getLife() < 0){System.out.println("Error en los puntos de vida del humano ");}
    
        
    }

    

   
}
