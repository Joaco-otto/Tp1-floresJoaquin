package ar.org.centro8.java.Entidades;



/*
 * Esta clase AutoNuevo hereda de la clase Vehiculo.
 * utiliza una estructura condicional if-else 
 * para hacer una validacion de  radio 
 * que no sea nula o no este asignado a otro vehiculo
 */
 
public class AutoNuevo extends Vehiculo {
    public AutoNuevo(String marca, String modelo,String color ,Radio radio) {
        super(marca, modelo,color);
        // se hace una validacion de radio,se asegura que se pase una radio y que no este asignada a otro vehiculo
        if (radio != null && radio.getVehiculo() == null) {
            this.agregarRadio(radio);
        } else {
            System.out.println(" ERROR , AutoNuevo requiere una radio disponible");
        } 
    }

    @Override
    public String tipo() {
        return "Auto Nuevo";
    }
}


