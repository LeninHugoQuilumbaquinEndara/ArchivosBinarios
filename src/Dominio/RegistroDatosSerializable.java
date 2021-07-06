
package Dominio;

import java.io.Serializable;

public class RegistroDatosSerializable implements Serializable{
    private String nombre;
    private int edad;
    private double altura;

    public RegistroDatosSerializable() {
    }
    public RegistroDatosSerializable(String nomb,int ed,double alt) {
    establecerNombre(nomb);
    establecerEdad(ed);
    establecerAltura(alt);
    }
    public void establecerNombre(String nomb){
        nombre=nomb;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerEdad(int ed){
        edad=ed;
    }
    public int obtenerEdad(){
        return edad;
    }
    public void establecerAltura(double alt){
        altura=alt;
    }
    public double obtenerAltura(){
        return altura;
    }
}
