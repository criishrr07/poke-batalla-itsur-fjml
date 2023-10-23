/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.Moves.Cascada;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.Moves.Refugio;
import mx.edu.itsur.pokebatalla.model.Moves.PulsoDragon;
/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Squirtle extends Pokemon {
     public  enum Movimientos{
         Cascada,
         Refugio,
         PulsoDragon,
    }
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
    
    public  void atacar (Pokemon oponente,  Squirtle.Movimientos  movimientoAUtilizar)
    {
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case Cascada: 
                instanciaMovimiento = new Cascada();
                break;
                case Refugio: 
                instanciaMovimiento = new Refugio();
                break;
                case PulsoDragon: 
                instanciaMovimiento = new PulsoDragon();
                break;
                /**
            case Psicorrayo:
                instanciaMovimiento = new Psicorrayo();
                break;
            case Teletransporte:
                instanciaMovimiento = new Teletransporte ();
                break;
                */ 
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
