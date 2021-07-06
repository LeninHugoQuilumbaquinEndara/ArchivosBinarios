
package Test;

import Dominio.EscrituraArchivo;

public class PruebaArchivo {
    public static void main(String[] args) {
        EscrituraArchivo aplicacion = new  EscrituraArchivo();
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();
    }
}
