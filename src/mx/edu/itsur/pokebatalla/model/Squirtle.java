/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Squirtle extends Pokemon {
 public Squirtle() {
        tipo = "AGUA";
        hp = 44;
        ataque = 48;
        defensa = 65;
        nivel = 1;
        precision = 4;
    }
    //Constructor alterno 1
    public Squirtle (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("SORPRESA")){
            //Logica del daño por SORPRESA
            System.out.println(this.nombre + " Realizando SORPRESA");  
            System.out.println("");
        }else if(habilidad.equals("AZOTE")){
            //Logica del daño por AZOTE
            System.out.println(this.nombre + " Realizando AZOTE");            
        }
        
    }
    
    
    
    
}
