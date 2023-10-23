package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Psicorrayo extends MovimientoEspecial{
    public Psicorrayo  ()
    {
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 65;
        this.tipo = TiposDeMovimiento.PSIQUICO;
    }
    
}
