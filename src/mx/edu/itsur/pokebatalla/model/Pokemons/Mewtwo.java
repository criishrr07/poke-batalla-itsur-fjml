package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.Moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.Moves.Psicorrayo;
import mx.edu.itsur.pokebatalla.model.Moves.Teletransporte;
import mx.edu.itsur.pokebatalla.model.Moves.CampoPsiquico;
/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Mewtwo extends Pokemon {

    
    
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
    
     public  void atacar (Pokemon oponente,  Mewtwo.Movimientos  movimientoAUtilizar)
    {
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