package Dominio;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerArchivo {

    private ObjectInputStream entrada;

    public void abrirArchivo() {
        try {
            entrada = new ObjectInputStream(
                    new FileInputStream("Nombre.ser"));
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo");
        }
    }

    public void leerRegistros() {
        String nombre;
        int edad;
        double altura;
        RegistroDatosSerializable reg;
        try {
            while (true) {
                reg = (RegistroDatosSerializable) entrada.readObject();
                nombre = reg.obtenerNombre();
                edad = reg.obtenerEdad();
                altura = reg.obtenerAltura();
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Estatura: " + altura);
            }
        } catch (EOFException endOfFileException) {
            return;
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("No se pudo crear el objeto.");
        } catch (IOException ioException) {
            System.err.println("Error al leer el archivo.");
        }
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
