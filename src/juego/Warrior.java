/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;


/**
 *
 * @author usuario
 */
public class Warrior extends Humano{
    
    public Warrior(String name, int attackPoints, int defensePoints, int life){
        super(name, attackPoints, defensePoints, life);
        
        System.out.println("Se ha creado un Warrior");
    }
    
    @Override
    protected void hit(int attackPoints){
           int dañocausado = attackPoints-getDefensePoints();
           if (dañocausado < 5){
           dañocausado = 0;
           }
           
           
           System.out.print(getName() + " es golpeado con " + attackPoints + " puntos i se defiende con " + getDefensePoints() + ". Vidas: "+ getLife() + " - " + dañocausado);
           
           setLife(getLife() - dañocausado);                   
           if (getLife() < 0){
           setLife(0);
           }
           System.out.println(" = " + getLife());
           
       }
}
