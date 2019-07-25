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
    
    
    public boolean activa;
    public float promedioOrigen;
    public float ruidoMax;
    
    public String uso;
    public JButton boton;
    public String stNombreHabitacion;

    public Habitacion(String numero) {
        this.activa = true;
        this.boton = new JButton("Habitacion: " + numero);
        this.stNombreHabitacion = "Habitacion " + numero;
        this.uso = "Sin uso";
        this.promedioOrigen = 0;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void setPromedioOrigen(float promedioOrigen) {
        this.promedioOrigen = promedioOrigen;
    }

    public void setRuidoMax(float ruidoMax) {
        this.ruidoMax = ruidoMax;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public void setStNombreHabitacion(String stNombreHabitacion) {
        this.stNombreHabitacion = stNombreHabitacion;
    }
    
    public void setUso(String uso) {
        this.uso = uso;
    }

    public boolean isActiva() {
        return activa;
    }

    public float getPromedioOrigen() {
        return promedioOrigen;
    }

    public float getRuidoMax() {
        return ruidoMax;
    }
    
    
    
    public JButton getBoton() {
        return boton;
    }

    public String getStNombreHabitacion() {
        return stNombreHabitacion;
    }

    public String getUso() {
        return uso;
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
                case "Sin uso":
                    this.promedioOrigen = 0;
                    break;
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