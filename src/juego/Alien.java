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
public class Alien extends Player{
    
    public Alien(String name, int attackPoints, int defensePoints, int life){
        super(name, attackPoints, defensePoints, life);
        
        System.out.println("Se ha creado un Alien");
    }
    
    @Override
    public void attack(Player p){
        System.out.println("-------------------------INICIO ATAQUE------------------------------");
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
        if(getLife() > 20){
            setAttackPoints(getAttackPoints()+3);
            setDefensePoints(getDefensePoints()-3);
                if(getDefensePoints() < 0){
                    setDefensePoints(0);
                }
        }
        p.hit(getAttackPoints());
        
        if (p.getLife() > 0){
            this.hit(p.getAttackPoints());            
        }
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
        System.out.println("--------------------------FIN ATAQUE-------------------------------\n");
    }


}