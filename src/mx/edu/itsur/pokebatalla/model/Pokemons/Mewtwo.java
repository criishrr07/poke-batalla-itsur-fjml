package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.Moves.Psicorrayo;
import mx.edu.itsur.pokebatalla.model.Moves.Teletransporte;
import mx.edu.itsur.pokebatalla.model.Moves.CampoPsiquico;
/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Mewtwo extends Pokemon implements Serializable{

    
    
    public  enum Movimientos{
        PSICORRAYO,
        TELETRANSPORTE,
        CAMPOPSIQUICO,

    }
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
    @Override
    public Enum[] getMovimientos() {
        return Mewtwo.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Mewtwo esta muriendo y no puede atacar mas.");
            return;
        }
        Mewtwo.Movimientos movimientoAUtilizar = Mewtwo.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar){
            
            case PSICORRAYO: 
                instanciaMovimiento = new Psicorrayo();
                break;
                
            case TELETRANSPORTE:
                instanciaMovimiento = new Teletransporte();
                break;
                case CAMPOPSIQUICO:
                instanciaMovimiento = new CampoPsiquico();
                break;    
                
            
                                      /**
                                      case Psicorrayo:
                                        instanciaMovimiento = new Psicorrayo();
                                           break;
                                        case Teletransporte:
                                        instanciaMovimiento = new Teletransporte ();
                                          break;
                                          * case CampoPsiquico:
                                        instanciaMovimiento = new CampoPsiquico ();
                                          break;
                                      */ 
             default:
               throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
    
}
