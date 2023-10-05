/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Machoke;
import mx.edu.itsur.pokebatalla.model.Mewtwo;
import mx.edu.itsur.pokebatalla.model.Squirtle;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Squirtle sqt = new Squirtle();
        Machoke MCK = new Machoke();
        Mewtwo MWT = new Mewtwo();
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("--=== Pikachu ===---");        
        Pikachu miPikachu = pikachuSalvaje;
        Machoke miMacho = MCK;
        Squirtle miSqt = sqt;
        Mewtwo miMewtwo = MWT;
        
        miPikachu.atacar(charmanderSalvaje);
        
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        //squirtle
        sqt.setNombre("--=== Squirtle ===--");
        miSqt.atacar(charmanderSalvaje);
        sqt.atacar(charmanderSalvaje, "SORPRESA");
        
        //Machoke
        MCK.setNombre("--=== Machoke ===---");
        miMacho.atacar(sqt);
        miMacho.atacar(sqt, "TERREMOTO");
        
        //Mewtwo
        MWT.setNombre("--=== Mewtwo ===--");
        miMewtwo.atacar(miMacho);
        miMewtwo.atacar(MCK, "Megapuño");
       
        
        
        
            
        
        
        
    }
    
}
