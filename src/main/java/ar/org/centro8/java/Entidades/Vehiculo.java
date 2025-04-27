package ar.org.centro8.java.Entidades;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

/*
 * Clase "abstracta" llamada vehiculo que nos servira de base para
 * crear otros tipos de vehiculos(AutoNuevo,AutoClasico y Colectivo).
 * No se puede crear un objeto de tipo Vehiculo directamente.
 */
public abstract class Vehiculo {


    
    private String marca;
    private String modelo;
    private String color;
    private Radio radio;

    /*
     * Se define el constructor 
     * Se omite Radio por que se puede agregar o cambiar con metodos
     */
    public Vehiculo(String marca, String modelo, String color){
        this.marca= marca;
        this.modelo=modelo;
        this.color=color;
    }
     // Metodo abstracto, cada tipo de vehiculo tendra su propia version del metodo
    public abstract String tipo();

    //  ** Metodos con Radio **

    public void agregarRadio(Radio nuevaRadio) {
        if (this.radio == null && nuevaRadio.getVehiculo() == null){
            this.radio = nuevaRadio;
            nuevaRadio.setVehiculo(this);
        } else{
            System.out.println("No se puede agregar la radio. Ya hay una asignada.");
        }
    }
    public void cambiarRadio(Radio nuevaRadio) {
        if (nuevaRadio.getVehiculo() == null) {
            if (this.radio != null) {
                this.radio.setVehiculo(null);
            }
            nuevaRadio.setVehiculo(this);
            this.radio = nuevaRadio;
        } else {
            System.out.println("La radio ya está en otro vehículo.");
        } 

    }
        /**
         * Se sobreescribe toString() para que las clases hijas
         * hereden el comportamiento sin necesidad de escribirlo
         */
           @Override
           public String toString() {
           return " -TipoVehiculo:   " + tipo() +
                "   - Marca:  " + marca  +
                ",  - Modelo: " + modelo +
                ",  - Color:  " + color  +
                ",  - Radio:  " + (radio != null ? radio.getMarca() + " (" + radio.getPotencia() + "W)" : "Sin radio");
       
    }
}

    

