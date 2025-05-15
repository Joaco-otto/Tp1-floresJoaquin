package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.entidades.AutoClasico;
import ar.org.centro8.curso.java.entidades.AutoNuevo;
import ar.org.centro8.curso.java.entidades.Colectivo;
import ar.org.centro8.curso.java.entidades.Radio;


public class TestTp1 {
    public static void main(String[] args) {

                 System.out.println(" TEST RADIO ");
        
        Radio radio1 = new Radio("Sony", 100);
        Radio radio2 = new Radio("Pioneer", 80);
        Radio radio3 = new Radio("JVC", 95); 
        Radio radio4 = new Radio("JBL", 120);
        Radio radio5 = new Radio("Alpine", 110);
        Radio radio6 = new Radio("Xiaomi",123);
        System.out.println(radio1);
        System.out.println(radio2);
        System.out.println(radio3);
        System.out.println(radio4);
        System.out.println(radio5);
        System.out.println(radio6);

                   System.out.println(" TEST AUTO CLASICO ");
        AutoClasico autoClasico1 = new AutoClasico("Dodge", "Charger", "negro", null);
        AutoClasico autoClasico2 = new AutoClasico("Nissan", "Sky-Line GTR", "Blanco", null);
        AutoClasico autoClasico3 = new AutoClasico("DMC", "DeLorean", "Gris", 18900.0);
        System.out.println(autoClasico2);
        System.out.println(autoClasico1);
        
                  System.out.println(" TEST AUTO NUEVO ");

        AutoNuevo auto3 = AutoNuevo.crearAutoNuevo("Toyota", "Corolla", "Bordo", radio6, 30000.0);
        AutoNuevo auto4 = AutoNuevo.crearAutoNuevo("Renault", "Kardian", "Azul", radio5, 25000.0);
        System.out.println(auto3);
        System.out.println(auto4);

                    System.out.println("TEST DE COLECTIVO ");
        Colectivo colectivo1 = new Colectivo("mercedez", "benz", "amarillo", 0);
        Colectivo colectivo2 = new Colectivo("Plymouth", "Reliant", "Amarillo", 120000.0);
        System.out.println(colectivo1);
        System.out.println(colectivo2);
        
        System.out.println("** PRUEBAS CON CONECTAR.RADIO ** ");
        colectivo1.conectarRadio(radio6);// radio 6 pertenece a autonuevo
        System.out.println(colectivo1.getRadio());
        autoClasico2.conectarRadio(radio2);
        AutoNuevo auto2 = AutoNuevo.crearAutoNuevo("chevrolet", "onix", "azul", radio2, null);
        // "auto2"  no se crea por q "radio2" ya esta en "autoclasico2"


        
    }

    }


