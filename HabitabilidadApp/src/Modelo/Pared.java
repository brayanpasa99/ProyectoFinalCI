/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JButton;

/**
 *
 * @author mateo
 */
public class Pared {
    public int habitacion1, habitacion2;
    public String material = "";
    public JButton boton;

    public Pared(int hab1, int hab2) {
        this.boton = new JButton("P");
        this.habitacion1 = hab1;
        this.habitacion2 = hab2;
    }

    public int getHabitacion1() {
        return habitacion1;
    }

    public void setHabitacion1(int habitacion1) {
        this.habitacion1 = habitacion1;
    }

    public int getHabitacion2() {
        return habitacion2;
    }

    public void setHabitacion2(int habitacion2) {
        this.habitacion2 = habitacion2;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
    
    
    
    
}
