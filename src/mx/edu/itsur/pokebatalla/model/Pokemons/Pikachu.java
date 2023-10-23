
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.Moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.Moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.Moves.Latigo;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;

/**
 *
 * @author Cristian Herrera
 */
public class Pikachu  extends Pokemon{
    

    public enum Movimientos {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        LATIGO
    }


    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }    
    
    //Constructor alterno 1
    public Pikachu(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, Pikachu.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;          
            default:
                throw new AssertionError();
        }

        
        instanciaMovimiento.utilizar(this, oponente);
    }
   
}
