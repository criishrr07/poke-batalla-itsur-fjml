/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Cristian Herrera
 */
public class Descanso extends MovimientoEstado {
    public Descanso  ()
    {
        this.puntosPoder = 10;
        this.precision = 0;
        this.potencia = 0;
        this.tipo = Movimiento.TiposDeMovimiento.PSIQUICO;
    }
}
