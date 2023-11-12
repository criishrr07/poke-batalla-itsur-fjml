package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Cristian Herrera Gonzalez s22120225
 */
public class CampoPsiquico extends MovimientoEstado{
    public CampoPsiquico  ()
    {
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 65;
        this.tipo = Movimiento.TiposDeMovimiento.PSIQUICO;
    }
    
}
