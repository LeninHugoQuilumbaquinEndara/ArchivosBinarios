
package Test;

import Dominio.LeerArchivo;

public class PruebaLeerArchivo {
        public static void main(String[] args) {
        LeerArchivo aplicacion = new  LeerArchivo();
        aplicacion.abrirArchivo();
        aplicacion.leerRegistros();
        aplicacion.cerrarArchivo();
    }
}
