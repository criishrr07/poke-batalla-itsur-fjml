package mx.edu.itsur.pokebatalla.model.ControlArchivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.model.Battles.Batalla;

/**
 *
 * @author s22120225 Cristian Herrera 
 */

public class FileManager {

    public static final String NOMBRE_PARTIDA = "ptd.pkm";

    public static void guardarPartida(Batalla x) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream( NOMBRE_PARTIDA))) {
            escritorDeObjetos.writeObject(x);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla cargarPartida() {
        Batalla x = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(NOMBRE_PARTIDA))) {
            x = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public static void eliminarPartida() {
    File file = new File(NOMBRE_PARTIDA);
    if (file.exists()) {
        file.delete();
        System.out.println("La partida ha sido eliminada");
    }
}
}