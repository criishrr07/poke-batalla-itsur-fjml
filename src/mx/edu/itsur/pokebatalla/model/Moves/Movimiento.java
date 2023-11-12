
package mx.edu.itsur.pokebatalla.model.Moves;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;


/**
 * Esta clase representa nn movimiento o ataque 
 * (Move en inglés; わざ Movimiento en japonés) 
 * es una técnica que los Pokémon son capaces de aprender 
 * y que usan en los combates con el fin de debilitar a sus oponentes.
 * https://www.wikidex.net/wiki/Movimiento
 * 
 * @author Cristian Herrera s22120225
 */
public class Movimiento {

    enum TiposDeMovimiento {

        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
     
    }


    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;


    public void utilizar(Pokemon usuario, Pokemon objetivo) {

        int nivelAtacante = usuario.getNivel();
        int ataqueAtacante = usuario.getAtaque();
        int poderMovimiento = this.puntosPoder; 
        int defensaObjetivo = objetivo.getDefensa();
        
        
        double modificador = 1.0; 
         
        
        int danio = (int) (((
                ((2 * nivelAtacante / 5 + 2) 
                        * ataqueAtacante 
                        * poderMovimiento / defensaObjetivo) 
                  / 50) + 2) * modificador);
        
        objetivo.recibirDanio(danio); 

        //Imprimir efecto del movimiento en consola
        System.out.println(
                         usuario.getClass().getSimpleName() + " aplica " + 
                         this.getClass().getSimpleName() + " a " +  
                         objetivo.getClass().getSimpleName() + " y causa danio de " +
                         danio);
        System.out.println("El objetivo quedo asi: " + objetivo);
        
    }    
}