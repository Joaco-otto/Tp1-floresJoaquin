package ar.org.centro8.java.Entidades;


  public class AutoClasico extends Vehiculo {

     public AutoClasico(String marca, String modelo,String Color) {
    
    super(marca, modelo,Color);
    }
         
        @Override
        public String tipo() {
            return "AutoClasico";
        }
    }





