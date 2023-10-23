package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemons.Machoke;
import mx.edu.itsur.pokebatalla.model.Pokemons.Mewtwo;
import mx.edu.itsur.pokebatalla.model.Pokemons.Squirtle;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Squirtle a = new Squirtle ("Squirtle");
        Mewtwo b = new Mewtwo("Mewtwo");
        Machoke c = new Machoke ("Machoke");
        
        
        //Squirtle
        
        a.atacar(c, Squirtle.Movimientos.Cascada);
        a.atacar(c, Squirtle.Movimientos.PulsoDragon);
        a.atacar(b, Squirtle.Movimientos.Refugio);
        
        //Mewtwo
        b.atacar(a, Mewtwo.Movimientos.PSICORRAYO);
        b.atacar(c, Mewtwo.Movimientos.TELETRANSPORTE);
        b.atacar(c, Mewtwo.Movimientos.CAMPOPSIQUICO);
        
        //Machoke
        c.atacar(b, Machoke.Movimientos.CONTRAATAQUE);
        c.atacar(a, Machoke.Movimientos.LANZALLAMAS);
        c.atacar(c, Machoke.Movimientos.DESCANSO);
        
        
        
        
        
        
        /**
         * 
         * 
         *         System.out.println("Hello PokeBatalla!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Squirtle sqt = new Squirtle();
        Machoke MCK = new Machoke();
        Mewtwo MWT = new Mewtwo();
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("--=== Pikachu ===---");        
        Pikachu miPikachu = pikachuSalvaje;
        Machoke miMacho = MCK;
        Squirtle miSqt = sqt;
        Mewtwo miMewtwo = MWT;
        
        
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
                
        
         System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO);
        
        System.out.println("->Charmander se molesta y responde ");
        charm.atacar(pika, Charmander.Movimientos.ATAQUE_RAPIDO);
     
        System.out.println("->Bullbasaur se enoja porque atacaron a su amigo Pikachu y...");
        bullb.atacar(charm, Bullbasaur.Movimientos.LATIGO);
        
        miPikachu.atacar(charmanderSalvaje);
        
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        //squirtle
        sqt.setNombre("--=== Squirtle ===--");
        miSqt.atacar(charmanderSalvaje);
        sqt.atacar(charmanderSalvaje, "SORPRESA");
        
        //Machoke
        MCK.setNombre("--=== Machoke ===---");
        miMacho.atacar(sqt);
        miMacho.atacar(sqt, "TERREMOTO");
        
        //Mewtwo
        MWT.setNombre("--=== Mewtwo ===--");
        miMewtwo.atacar(miMacho);
        miMewtwo.atacar(MCK, "Megapuño");
        * */
        
    }
    
}
