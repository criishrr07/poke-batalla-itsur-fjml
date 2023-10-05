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
public class Mewtwo extends Pokemon {
 public Mewtwo() {
        tipo = "PSIQUICO";
        hp = 106;
        ataque = 110;
        defensa = 90;
        nivel = 1;
        precision = 5;
    }
    //Constructor alterno 1
    public Mewtwo (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ContraAtaque")){
            //Logica del daño por PC
            System.out.println(this.nombre + " Realizando ContraAtaque");  
            System.out.println("");
        }else if(habilidad.equals("Megapuño")){
            //Logica del daño por Terremoto
            System.out.println(this.nombre + " Realizando Megapuño");        
        }
        
    }
    
    
    
    
}
