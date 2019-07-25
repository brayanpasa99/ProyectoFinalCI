/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;

/**
 *
 * @author mateo
 */
public class Habitabilidad {

    public Habitacion hab1, hab2, hab3, hab4, hab5, hab6, hab7, hab8, hab9;
    public Pared pa12, pa23, pa45, pa56, pa78, pa89, pa14, pa25, pa36,
            pa47, pa58, pa69;

    public float[][] matrizPromedios = new float[3][3];
    public float[][] matrizDestacadas = new float[3][3];
    public float[][] matrizAdyacencia = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public int[][] matrizNumHabitaciones = {{0, 1, 2},
    {3, 4, 5},
    {6, 7, 8}};

    public double rtHab1_2, rtHab1_4, rtHab2_1, rtHab2_5, rtHab1_5,
            rtHab2, rtHab3, rtHab4, rtHab5, rtHab6, rtHab7, rtHab8, rtHab9;
    public double tlHab1, tlHab2, tlHab3, tlHab4, tlHab5, tlHab6, tlHab7, tlHab8, tlHab9;

    public Habitabilidad(Habitacion hab1, Habitacion hab2, Habitacion hab3, Habitacion hab4, Habitacion hab5, Habitacion hab6, Habitacion hab7, Habitacion hab8, Habitacion hab9, Pared pa12, Pared pa23, Pared pa45, Pared pa56, Pared pa78, Pared pa89, Pared pa14, Pared pa25, Pared pa36, Pared pa47, Pared pa58, Pared pa69) {
        this.hab1 = hab1;
        this.hab2 = hab2;
        this.hab3 = hab3;
        this.hab4 = hab4;
        this.hab5 = hab5;
        this.hab6 = hab6;
        this.hab7 = hab7;
        this.hab8 = hab8;
        this.hab9 = hab9;

        this.pa12 = pa12;
        this.pa23 = pa23;
        this.pa45 = pa45;
        this.pa56 = pa56;
        this.pa78 = pa78;
        this.pa89 = pa89;
        this.pa14 = pa14;
        this.pa25 = pa25;
        this.pa36 = pa36;
        this.pa47 = pa47;
        this.pa58 = pa58;
        this.pa69 = pa69;
    }

    public void destacarOrigen() {
        matrizPromedios[0][0] = hab1.getPromedioOrigen();
        matrizPromedios[0][1] = hab2.getPromedioOrigen();
        matrizPromedios[0][2] = hab3.getPromedioOrigen();
        matrizPromedios[1][0] = hab4.getPromedioOrigen();
        matrizPromedios[1][1] = hab5.getPromedioOrigen();
        matrizPromedios[1][2] = hab6.getPromedioOrigen();
        matrizPromedios[2][0] = hab7.getPromedioOrigen();
        matrizPromedios[2][1] = hab8.getPromedioOrigen();
        matrizPromedios[2][2] = hab9.getPromedioOrigen();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizPromedios[i][j] != 0) {
                    matrizDestacadas[i][j] = 1;
                } else {
                    matrizDestacadas[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizDestacadas[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                verificaAdyacencia(i, j);
            }
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizAdyacencia[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public void calcularRuidoTransmitido() {

    }

    public double ruidoTransmitido(double TL, double ruidoOrigen) {
        double W = ((ruidoOrigen) / Math.pow(10, (TL / 10)));
        return W;
    }

    public double perdidaTransmision(float m, float hz) {
        double TL = (20 * Math.log10(m * hz) - 43);
        return TL;
    }

    public void verificaAdyacencia(int coorI, int coorJ) {

        int numHabitacionCentro = matrizNumHabitaciones[coorI][coorJ];

        if (coorJ - 1 != -1) {
            int numHabitacionIzquierda = matrizNumHabitaciones[coorI][coorJ - 1];
            if (matrizDestacadas[coorI][coorJ - 1] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionIzquierda] = 1;
            }
        }
        if (coorJ + 1 != 3) {
            int numHabitacionDerecha = matrizNumHabitaciones[coorI][coorJ + 1];
            if (matrizDestacadas[coorI][coorJ + 1] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionDerecha] = 1;
            }
        }
        if (coorI - 1 != -1) {
            int numHabitacionArriba = matrizNumHabitaciones[coorI - 1][coorJ];
            if (matrizDestacadas[coorI - 1][coorJ] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionArriba] = 1;
            }
        }
        if (coorI + 1 != 3) {
            int numHabitacionAbajo = matrizNumHabitaciones[coorI + 1][coorJ];
            if (matrizDestacadas[coorI + 1][coorJ] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionAbajo] = 1;
            }
        }
    }

}
