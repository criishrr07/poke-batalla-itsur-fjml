package mx.edu.itsur.pokebatalla.model.Pokemons;
import java.io.IOException;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.ControlArchivos.FileManager;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;
import mx.edu.itsur.pokebatalla.model.Battles.Entrenador;
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
public class Main implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Unidades 4 y 5 
        Batalla k = FileManager.cargarPartida();
        
        if (k == null) {
        Squirtle a = new Squirtle ("Squirtle");
        Mewtwo b = new Mewtwo("Mewtwo");
        Machoke c = new Machoke ("Machoke");
        Charmander e = new Charmander("Dragon rojo");
       

        Entrenador en1 = new Entrenador("Cristian");
        en1.capturarPokemon(a);
        en1.capturarPokemon(e);

        Entrenador en2 = new Entrenador("Milan");
        en2.capturarPokemon(b);
        en2.capturarPokemon(c);

        k = new Batalla(en1, en2);
        }
        k.desarrollarBatalla();
        
        
        if (k.pkmnGanador()) {
            System.out.println("Quieres iniciar otra partida ? (S/N)");

            char respuesta = 'N';
            try {
                respuesta = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                System.out.println("Error. Vuelve a intentarlo");
                ex.printStackTrace();
            }

            if (respuesta == 'S' || respuesta == 's') {
                // Borra el archivo de la partida guardada
                FileManager.eliminarPartida();
                //Pokemons 
                Squirtle a = new Squirtle ("Squirtle");
                Mewtwo b = new Mewtwo("Mewtwo");
                Machoke c = new Machoke ("Machoke");
                Charmander e = new Charmander("Dragon rojo");
                
                Entrenador newEntrenador1 = new Entrenador("Milan");
                newEntrenador1.capturarPokemon(a);
                newEntrenador1.capturarPokemon(e);
                
                Entrenador newEntrenador2 = new Entrenador("Cristian");
                newEntrenador2.capturarPokemon(b);
                newEntrenador2.capturarPokemon(c);
                

                Batalla nuevaBatalla = new Batalla(newEntrenador1, newEntrenador2);
                nuevaBatalla.desarrollarBatalla();
            }
        }
    }
}
        
        
            
        
        /* UNIDAD 3
        Squirtle a = new Squirtle ("Squirtle") {};
        Mewtwo b = new Mewtwo("Mewtwo") {};
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
        
    
    

