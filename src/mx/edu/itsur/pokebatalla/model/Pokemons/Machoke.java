package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.Moves.ContraAtaque;
import mx.edu.itsur.pokebatalla.model.Moves.Lanzallamas;
import mx.edu.itsur.pokebatalla.model.Moves.Descanso;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
/**
 *
 * @Author s22120225 Cristian Herrera Gonzalez
 */

public  class Machoke extends Pokemon {    

    public ContraAtaque instanciaMovimiento;
     public  enum Movimientos{
         CONTRAATAQUE,
         LANZALLAMAS,
         DESCANSO,
         
    }
 public Machoke() {
        tipo = "LUCHA";
        hp = 80;
        ataque = 100;
        defensa = 70;
        nivel = 1;
        precision = 3;
    }
    
    public Machoke (String nombre){
        this(); 
        this.nombre = nombre;
    }
@Override
    public Enum[] getMovimientos() {
        return Machoke.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Machoke. esta muriendo y no puede atacar mas.");
            return;
        }
        Machoke.Movimientos movimientoAUtilizar = Machoke.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            case CONTRAATAQUE:            
            instanciaMovimiento = new ContraAtaque ();
                break;
            case LANZALLAMAS:            
            instanciaMovimiento = new Lanzallamas();
                break;
            case DESCANSO:
             instanciaMovimiento = new Descanso();
                  break;
             
            /* case Psicorrayo:
                instanciaMovimiento = new Psicorrayo();
                break;
         case Teletransporte:
               instanciaMovimiento = new Teletransporte ();
               break;
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
        //instanciaMovimiento.utilizar(this, oponente);
    }
    
}
