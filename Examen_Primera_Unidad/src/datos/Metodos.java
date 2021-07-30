package datos;

import Entidades.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Metodos {

    private final File fichero = new File("consumos.dat");
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public Metodos() {
        crearFichero();
    }

    public void crearFichero() {
        try {
            if (getFichero().exists()) {
                System.out.println("Fichero existente");
            } else {
                if (getFichero().createNewFile()) {
                    System.out.println("Se ha creado el fichero correctamente");
                } else {
                    System.err.println("Ha ocurrido un error al crear el fichero");
                }
            }
        } catch (IOException e) {
            System.err.println("Ocurrio un error");
        }
    }

    public void cerrarFichero() {
        try {
            if (!(ois == null)) {
                ois.close();
            }
            if (!(oos == null)) {
                oos.close();
            }
        } catch (IOException ex) {
            System.err.println("No se pudo cerrar el archivo");
        }
    }

    public void escribirFichero(ConsumoCliente consumo_c) {
        try {
            if (getFichero().exists()) {

                if (getFichero().length() == 0) {
                    oos = new ObjectOutputStream(new FileOutputStream(getFichero()));
                } else {
                    //el true es importante para seguir añadiento
                    oos = new ObjectOutputStream(new FileOutputStream(getFichero(), true));
                }

                oos.writeObject(consumo_c);
                oos.flush();
                oos.close();

            }
        } catch (InputMismatchException e) {

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            cerrarFichero();
        }
    }

    public ArrayList<ConsumoCliente> leerFichero() throws ClassNotFoundException {
        ArrayList<ConsumoCliente> consumos = new ArrayList<>();
        ConsumoCliente p;

        try {
            ois = new ObjectInputStream(new FileInputStream("consumos.dat"));
            try {
                while (true) {
                    p = (ConsumoCliente) ois.readObject();
                    consumos.add(p);
                }
            } catch (EOFException ex) {
                cerrarFichero();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("\nArchivo no encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("\nProblema de E/S: " + ex.getMessage());
        } finally {
            cerrarFichero();
        }
        return consumos;
    }


    public File getFichero() {
        return fichero;
    }

}
