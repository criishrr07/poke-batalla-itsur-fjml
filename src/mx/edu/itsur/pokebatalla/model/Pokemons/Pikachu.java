
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.Moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.Moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.Moves.Latigo;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;

/**
 *
 * @author Cristian Herrera
 */
public abstract class Pikachu  extends Pokemon{
    

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
     @Override
        public Enum[] getMovimientos() {
            return Pikachu.Movimientos.values();
        }

        @Override
        public void atacar(Pokemon oponente, int ordinalMovimiento) {

            Movimiento instanciaMovimiento;
            Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];

            if (this.hp <= 0) {
                System.out.println("Pikachu esta agotado y no puede realizar mas movimientos.");
                return;
            }
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