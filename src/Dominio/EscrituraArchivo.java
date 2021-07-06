package Dominio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EscrituraArchivo {

    private ObjectOutputStream salida; // envial los datos  a un archivo

    public void abrirArchivo() {
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream("Nombre.ser"));
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo");
        }
    }

    public void agregarRegistros() {
        RegistroDatosSerializable re;
        String nombre;
        int edad;
        double altura;
        Scanner entrada = new Scanner(System.in);
            try {
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                System.out.print("Estatura: ");
                altura = entrada.nextDouble();
                re = new RegistroDatosSerializable(nombre, edad, altura);
                salida.writeObject(re);
            } catch (IOException ioException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida . Intente de nuevo");
                entrada.nextLine();
            }
        
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo");
            System.exit(1);
        }
    }
}
