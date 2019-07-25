package Vista;

import javax.swing.JFrame;
import Controlador.*;
import Modelo.*;

public class Principal {
    //Se define un JFrame global
    public static JFrame ventana;
    
    //Clase principal del sistema.
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion("1");
        
        ventana = new JFrame(" ");
        
        
        
        //Se añaden los elementos guardados en el Frame a la ventana
        ventana.add(h1.getBoton());
        
        
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
