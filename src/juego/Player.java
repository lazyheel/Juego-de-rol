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
abstract public class Player {
   
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;
    
    //CONSTRUCTOR
    public Player(String name, int attackPoints, int defensePoints, int life){
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life=life;    
    
    }
    //CONSTRUCTOR HUMANO
    
       
    
    public void setAttackPoints(int points){
    this.attackPoints = points;
    }
    public void setDefensePoints(int points){
    this.defensePoints = points;
    }
    public void setName(String name){
    this.name = name;
    }
    public void setLife(int life){
    this.life = life;
    }
    
    
        
    public String getName(){
        return this.name;
    }
    
    public int getAttackPoints(){
       return this.attackPoints;
    }
    
    public int getDefensePoints(){
        return this.defensePoints;
    }
    
    public int getLife(){
        return this.life;
    }
    
    
    @Override
    public String toString(){
        return this.name + " PA:" + this.attackPoints + " / PD:" + this.defensePoints + " / PV:" + this.life;
    }
   
    public void attack(Player p){
        System.out.println("-------------------------INICIO ATAQUE------------------------------");
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
        p.hit(this.attackPoints);
        if (p.life > 0){
            this.hit(p.attackPoints);            
        }
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
        System.out.println("--------------------------FIN ATAQUE-------------------------------\n");
    }
        
    protected void hit(int attackPoints){
           int dañocausado = attackPoints-this.defensePoints;
           if (dañocausado < 0){
           dañocausado = 0;
           }
           
           System.out.print(this.name + " es golpeado con " + attackPoints + " puntos i se defiende con " + this.defensePoints + ". Vidas: "+ this.life + " - " + dañocausado);
           
           this.life = this.life - dañocausado;                   
           if (this.life < 0){
           this.life = 0;
           }
           System.out.println(" = " + this.life);
           
       }
    
    
    
    
   
}
