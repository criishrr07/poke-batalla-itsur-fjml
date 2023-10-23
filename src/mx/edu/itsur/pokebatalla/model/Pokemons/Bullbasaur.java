
package mx.edu.itsur.pokebatalla.model.Pokemons;


import mx.edu.itsur.pokebatalla.model.Moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.Moves.Latigo;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Bullbasaur extends Pokemon {
    public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); 
        this.nombre = nombre;
    }
    
        public void atacar(Pokemon oponente, Bullbasaur.Movimientos movimientoAUtilizar) {

        
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
    
}
