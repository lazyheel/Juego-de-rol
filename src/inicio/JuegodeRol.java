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
        
        Alien a1 = new Alien("Sultan",10,7,60);
        System.out.println(a1.toString());
        Alien a2 = new Alien("Obelio",12,5,65);
        System.out.println(a2.toString());
        Alien a3 = new Alien("Sinfano",9,9,55);
        System.out.println(a3.toString());
        Humano h1 = new Humano("Jose",6,3,120);
        System.out.println(h1.toString());
        Humano h2 = new Humano("Miguel",8,6,98);
        System.out.println(h2.toString());
        Humano h3 = new Humano("Jose",10,5,90);
        System.out.println(h3.toString());
        System.out.println("Se está creando un Warrior");
        Warrior w1 = new Warrior("Popeye",12,12,90);
        System.out.println(w1.toString());
        Warrior w2 = new Warrior("Brutus",12,9,110);
        System.out.println(w2.toString());
        Warrior w3 = new Warrior("Sandocan",12,10,100);
        System.out.println(w3.toString());
        
        
        
        
        
        
        
        
        w1.attack(a1);
        w3.attack(h1);
        a3.attack(w2);
        a1.attack(h2);
        h2.attack(w1);
        h2.attack(a1);
        a1.attack(w1);
        w2.attack(a3);
        a2.attack(h3);
        h1.attack(a1);
        a1.attack(w1);
        if(w1.getLife() < 0){System.out.println("Error en los puntos de vida del Warrior ");}
        if(a1.getLife() < 0){System.out.println("Error en los puntos de vida del alien ");}
        if(h1.getLife() < 0){System.out.println("Error en los puntos de vida del humano ");}
    
        
    }

    

   
}
