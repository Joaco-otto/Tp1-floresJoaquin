package ar.org.centro8.java.Test;

import ar.org.centro8.java.Entidades.AutoClasico;
import ar.org.centro8.java.Entidades.AutoNuevo;
import ar.org.centro8.java.Entidades.Colectivo;
import ar.org.centro8.java.Entidades.Radio;


public class TestTp1 {
    public static void main(String[] args) {

                 System.out.println(" TEST RADIO ");
        
        Radio radio1 = new Radio("Sony", 100);
        Radio radio2 = new Radio("Pioneer", 80);
        Radio radio3 = new Radio("JVC", 95); 
        Radio radio4 = new Radio("JBL", 120);
        Radio radio5 = new Radio("Alpine", 110);

        System.out.println(radio1);
        System.out.println(radio2);
        System.out.println(radio3);
        System.out.println(radio4);
        System.out.println(radio5);

                   System.out.println(" TEST AUTO CLASICO ");
        AutoClasico autocClasico1 = new AutoClasico("Dodge", "Charger", "Negro");
        AutoClasico autoClasico2 = new AutoClasico("Nissan", "Skyline GT-R","Gris");
        AutoClasico autoClasico3 = new AutoClasico("DMC", "DeLorean", "Gris");
      
        System.out.println(autocClasico1);
        System.out.println(autoClasico2);
        System.out.println(autoClasico3);
        System.out.println(autocClasico1.getMarca() + " es un " + autocClasico1.tipo());
        System.out.println(autoClasico2.getMarca() + " es un " +  autoClasico2.tipo());

        
                  System.out.println(" TEST AUTO NUEVO ");
        AutoNuevo auto1 = new AutoNuevo("Toyota", "Corolla","bordo", radio1);
        AutoNuevo auto2 = new AutoNuevo("Renault", "Kardian", "azul", radio2);
        System.out.println(auto1.getMarca() + " es un " + auto1.tipo());
        System.out.println(auto2.getMarca() + " es un " + auto2.tipo());
        System.out.println(auto1);
        System.out.println(auto2);

                    System.out.println("TEST DE COLECTIVO ");
        Colectivo colectivo1 = new Colectivo("Mercedes", "Benz","Amarillo");
        Colectivo colectivo2 = new Colectivo("Plymouth", "Reliant", "Amarillo");
        System.out.println(colectivo1);
        System.out.println(colectivo2);
        System.out.println(colectivo1.getMarca() + " es un " + colectivo1.tipo() + " como el que me rompio el auto ");
        System.out.println(colectivo2.getMarca() + " es un " + colectivo2.tipo() + " como el de los simpsons");


        System.out.println("** PRUEBAS CON AGREGAR.RADIO ** ");

          autocClasico1.agregarRadio(radio3);
          System.out.println(" La radio del "+ autocClasico1.getMarca() + autocClasico1.getModelo() + " es un " + autocClasico1.getRadio().getMarca());
          System.out.println(" El vehiculo de la radio es " + radio3.getVehiculo().getMarca() + autocClasico1.getModelo() + " que es un " + autocClasico1.tipo());
          autocClasico1.agregarRadio(radio4);// No deberia agregar por que "autoClasico1" ya tiene una asignada 
          System.out.println("la radio del " + autocClasico1.getRadio().getMarca());

        System.out.println("** PRUEBAS CON CAMBIAR.RADIO ** ");
        
          autocClasico1.cambiarRadio(radio2);// radio2 ya esta en otro vehiculo, por lo tanto "autoClasico1" no cambia de radio
          System.out.println("La radio del " + autocClasico1.getMarca() + autocClasico1.getModelo() + "es un " + autocClasico1.getRadio().getMarca());
        
          // usamos una radio que no este asignada
          autocClasico1.cambiarRadio(radio4);
          System.out.println("La radio del " + autocClasico1.getMarca() + autocClasico1.getModelo() + "es un " + autocClasico1.getRadio().getMarca());

           auto1.cambiarRadio(radio4);   
           System.out.println("la radio de " + auto1.getMarca() + " es " + auto1.getRadio().getMarca());
    
          System.out.println(radio3.getVehiculo());
          auto1.cambiarRadio(radio3);
          System.out.println(" La radio de auto1 es  " + auto1.getRadio().getMarca());

          colectivo1.agregarRadio(radio4);
          System.out.println(" La radio de " + colectivo1.getMarca() + " es un " + radio4.getMarca());
          System.out.println(colectivo1);
          System.out.println(radio1.getVehiculo());//Esta radio esta disponible
          System.out.println(radio2.getVehiculo().getMarca());
          System.out.println(radio3.getVehiculo().getMarca());
          System.out.println(radio4.getVehiculo().getMarca());
          System.out.println(radio5.getVehiculo());// Esta radio esta disponible
          AutoNuevo auto3 = new AutoNuevo("Ford", "Fiesta", "azul", null);
          System.out.println(auto3);// se debe asignar una de las radios disponibles
          
    }

    }


