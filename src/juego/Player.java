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
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
        p.hit(this.attackPoints);
        if (p.life > 0){
            this.hit(p.attackPoints);            
        }
        System.out.println("Atacante: "+ this.toString());
        System.out.println("Defensor: "+ p.toString());
    }
        
    protected void hit(int attackPoints){
           System.out.print(this.name + " es golpeado con " + attackPoints + " puntos i se defiende con " + this.defensePoints + ". Vidas: "+ this.life + " - " + (attackPoints - this.defensePoints));
           this.life = this.life - (attackPoints-this.defensePoints);
           if (this.life < 0){
           this.life = 0;
           }
           System.out.println(" = " + this.life);
       }
    
    
    
    
   
}
