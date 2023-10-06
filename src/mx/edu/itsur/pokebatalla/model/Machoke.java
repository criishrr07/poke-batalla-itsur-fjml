/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;

//@Author s22120225 Cristian Herrera Gonzalez

public class Machoke extends Pokemon {
 public Machoke() {
        tipo = "LUCHA";
        hp = 80;
        ataque = 100;
        defensa = 70;
        nivel = 1;
        precision = 3;
    }
    //Constructor alterno 1
    public Machoke (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("PUÑO CERTERO")){
            //Logica del daño por PC
            System.out.println(this.nombre + " Realizando PUÑO CERTERO");  
            System.out.println("");
        }else if(habilidad.equals("TERREMOTO")){
            //Logica del daño por Terremoto
            System.out.println(this.nombre + " Realizando TERREMOTO");        
        }
      
    }
    
    
    
    
}
