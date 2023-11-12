
package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.Moves.AtaqueRapido;
import  mx.edu.itsur.pokebatalla.model.Moves.Movimiento;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public  class Charmander extends Pokemon {
    
      public enum Movimientos {
        ATAQUE_RAPIDO,

    }
    
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }
    
    //Constructor alterno 1
    public Charmander(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander esta muriendo y no puede atacar mas.");
            return;
        }
        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            default:
                throw new AssertionError();
        }
        
        instanciaMovimiento.utilizar(this, oponente);

    }
    
}
