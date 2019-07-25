package Modelo;


import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Habitacion {

    private String uso;
    private boolean activa;
    private float promedioOrigen;
    private float ruidoMax;
    private JButton boton;

    public Habitacion(String n) {
        JButton boton = new JButton("Habitacion" + n);
        boton.setBounds(300, 250, 100, 30);
    }

    public JButton getBoton() {
        return boton;
    }
    
    

    public void establecerUso(String s) {
        this.uso = s;
    }

    public void establecerActiva(boolean b) {
        this.activa = b;
    }

    public void establecerPromedio() {
        if (this.activa) {
            String op = this.uso;
            switch (op) {
                //Residencial
                case "Biblioteca":
                    this.promedioOrigen = 30;
                    break;
                case "Dormitorio":
                    this.promedioOrigen = 35;
                    break;
                case "Cocina":
                    this.promedioOrigen = 35;
                    break;
                case "Baño":
                    this.promedioOrigen = 35;
                    break;
                case "Sala":
                    this.promedioOrigen = 40;
                    break;
                
                //Empresarial y de Ocio
                case "Oficina":
                    this.promedioOrigen = 40;
                    break;
                case "Salon de eventos":
                    this.promedioOrigen = 100;
                    break;
                case "Oficina de negocios":
                    this.promedioOrigen = 70;
                    break;
            }
        }
    }
    
    public void establecerMaximo(){
        String op = this.uso;
        switch (op) {
            //Residencial
            case "Biblioteca":
                this.ruidoMax = 30;
                break;
            case "Dormitorio":
                this.ruidoMax = 35;
                break;
            case "Cocina":
                this.ruidoMax = 35;
                break;
            case "Baño":
                this.ruidoMax = 35;
                break;
            case "Sala":
                this.ruidoMax = 40;
                break;

            //Empresarial y de Ocio
            case "Oficina":
                this.ruidoMax = 40;
                break;
            case "Salon de eventos":
                this.ruidoMax = 100;
                break;
            case "Oficina de negocios":
                this.ruidoMax = 70;
                break;
        }
    }

}
