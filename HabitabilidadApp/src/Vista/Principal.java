package Vista;

import javax.swing.JFrame;
import Controlador.*;
import Modelo.*;
import javax.swing.*;

public class Principal {
    //Se define un JFrame global
    public static JFrame ventana;
    
    //Clase principal del sistema.
    public static void main(String[] args) {
        CreadorBotones creadorBotones = new CreadorBotones();
        JPanel PaHabitaciones = creadorBotones.Habitaciones();
        JPanel PaUsos = creadorBotones.Usos();
        JPanel PaUsosParedes = creadorBotones.UsosParedes();
        JPanel PaTabla = creadorBotones.TablaUsos();
        JPanel PaHabitabilidad = creadorBotones.Habitabilidad();
        
        ventana = new JFrame("");

        //Se añaden los elementos guardados en el Frame a la ventana
        ventana.add(PaHabitaciones);
        ventana.add(PaUsos);
        ventana.add(PaUsosParedes);
        ventana.add(PaTabla);
        ventana.add(PaHabitabilidad);
        
        //Se definen las propiedades de la ventana
        ventana.setSize(1000,750);
        ventana.setTitle("Habitabilidad App");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        
        //Se muestra la ventana
        ventana.setVisible(true);
        
    }
}

