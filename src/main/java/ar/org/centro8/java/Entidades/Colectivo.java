package ar.org.centro8.java.Entidades;

public final class Colectivo extends Vehiculo {

    public Colectivo(String marca,String modelo,String color){

        super(marca, modelo,color);
    }

     @Override
     public String tipo() {
        return "Colectivo";

    }
}