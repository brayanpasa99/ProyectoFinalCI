/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.Hashtable;

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
    public double[][] matrizAdyacencia = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public double[][] matrizDecibeles = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public double[] arrayDbHabitaciones = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public double[] arrayPromedioHabitaciones = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public double[] arrayMaximoHabitaciones = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public String[] arrayVeredicto = {"", "", "", "", "", "", "", "", ""};

    public int[][] matrizNumHabitaciones
            = {{0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}};

    public int[][] matrizNumHabitaciones2
            = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

    public String[][] arrayParedes = new String[10][10];

    public double rtHab1_2, rtHab1_4, rtHab2_1, rtHab2_5, rtHab1_5,
            rtHab2, rtHab3, rtHab4, rtHab5, rtHab6, rtHab7, rtHab8, rtHab9;
    public double tlHab1, tlHab2, tlHab3, tlHab4, tlHab5, tlHab6, tlHab7, tlHab8, tlHab9;

    //Medido en kg/m2
    Hashtable<String, Integer> masas = new Hashtable<>();
    Hashtable<String, String> paredes = new Hashtable<>();
    public double hz = 500;
    public double p0 = 2E-5;

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

        this.arrayPromedioHabitaciones[0] = hab1.getPromedioOrigen();
        this.arrayPromedioHabitaciones[1] = hab2.getPromedioOrigen();
        this.arrayPromedioHabitaciones[2] = hab3.getPromedioOrigen();
        this.arrayPromedioHabitaciones[3] = hab4.getPromedioOrigen();
        this.arrayPromedioHabitaciones[4] = hab5.getPromedioOrigen();
        this.arrayPromedioHabitaciones[5] = hab6.getPromedioOrigen();
        this.arrayPromedioHabitaciones[6] = hab7.getPromedioOrigen();
        this.arrayPromedioHabitaciones[7] = hab8.getPromedioOrigen();
        this.arrayPromedioHabitaciones[8] = hab9.getPromedioOrigen();

        this.arrayMaximoHabitaciones[0] = hab1.getRuidoMax();
        this.arrayMaximoHabitaciones[1] = hab2.getRuidoMax();
        this.arrayMaximoHabitaciones[2] = hab3.getRuidoMax();
        this.arrayMaximoHabitaciones[3] = hab4.getRuidoMax();
        this.arrayMaximoHabitaciones[4] = hab5.getRuidoMax();
        this.arrayMaximoHabitaciones[5] = hab6.getRuidoMax();
        this.arrayMaximoHabitaciones[6] = hab7.getRuidoMax();
        this.arrayMaximoHabitaciones[7] = hab8.getRuidoMax();
        this.arrayMaximoHabitaciones[8] = hab9.getRuidoMax();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.arrayParedes[i][j] = "";
            }
        }

        paredes.put("pa12", pa12.getMaterial());
        paredes.put("pa14", pa14.getMaterial());
        paredes.put("pa23", pa23.getMaterial());
        paredes.put("pa45", pa45.getMaterial());
        paredes.put("pa56", pa56.getMaterial());
        paredes.put("pa78", pa78.getMaterial());
        paredes.put("pa89", pa89.getMaterial());
        paredes.put("pa25", pa25.getMaterial());
        paredes.put("pa36", pa36.getMaterial());
        paredes.put("pa47", pa47.getMaterial());
        paredes.put("pa58", pa58.getMaterial());
        paredes.put("pa69", pa69.getMaterial());

        /*this.arrayParedes[1][2] = pa12.getMaterial();
        this.arrayParedes[2][3] = pa23.getMaterial();
        this.arrayParedes[4][5] = pa45.getMaterial();
        this.arrayParedes[5][6] = pa56.getMaterial();
        this.arrayParedes[7][8] = pa78.getMaterial();
        this.arrayParedes[8][9] = pa89.getMaterial();
        this.arrayParedes[1][4] = pa14.getMaterial();
        this.arrayParedes[2][5] = pa25.getMaterial();
        this.arrayParedes[3][6] = pa36.getMaterial();
        this.arrayParedes[4][7] = pa47.getMaterial();
        this.arrayParedes[5][8] = pa58.getMaterial();
        this.arrayParedes[6][9] = pa69.getMaterial();*/
        masas.put("Hormigon", 250);
        masas.put("Madera", 18);
        masas.put("Ladrillo", 300);
        masas.put("", 0);

        pa58.getMaterial();
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
                if (matrizDestacadas[i][j] == 1) {
                    verificaAdyacencia(i, j);
                }

            }
        }

        System.out.println("Matriz de adyacencia");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println("");
        }

        sumarDecibeles();
        compararHabitabilidad();
    }

    public double[] getArrayMaximoHabitaciones() {
        return arrayMaximoHabitaciones;
    }

    public String[] getArrayVeredicto() {
        return arrayVeredicto;
    }

    public double[] getArrayFinal() {
        return arrayFinal;
    }

    public double energiaTransmitida(double TL, double ruidoOrigen) {

        if (TL == 0) {
            return 0;
        }

        double W = ((ruidoOrigen) / Math.pow(10, (TL / 10)));
        return W;
    }

    public double perdidaTransmision(double m, double hz) {

        if (m == 0) {
            return 0;
        }

        double TL = (20 * Math.log10(m * hz) - 48);
        return TL;
    }

    public double sonidoTransmitido(double p) {
        double L = (20 * Math.log10(p / p0));
        return L;
    }

    public void verificaAdyacencia(int coorI, int coorJ) {

        int numHabitacionCentro = matrizNumHabitaciones[coorI][coorJ];
        System.out.println("Coordenadas: " + coorI + " " + coorJ);
        //System.out.println("ArrayParedes12: " + arrayParedes[1][2]);

        if (coorJ - 1 != -1) {
            String s = ("pa" + matrizNumHabitaciones2[coorI][coorJ - 1] + "" + matrizNumHabitaciones2[coorI][coorJ]);
            System.out.println(s);
            String x = paredes.get(s);
            System.out.println("Izquieda: " + paredes.get(s));
            int numHabitacionIzquierda = matrizNumHabitaciones[coorI][coorJ - 1];
            if (matrizDestacadas[coorI][coorJ - 1] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionIzquierda] = matrizAdyacencia[numHabitacionCentro][numHabitacionIzquierda] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            } else if (matrizDestacadas[coorI][coorJ - 1] == 0.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionIzquierda] = matrizAdyacencia[numHabitacionCentro][numHabitacionIzquierda] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            }
        }
        if (coorJ + 1 != 3) {
            String s = ("pa" + matrizNumHabitaciones2[coorI][coorJ] + "" + matrizNumHabitaciones2[coorI][coorJ + 1]);
            System.out.println(s);
            String x = paredes.get(s);
            System.out.println("Derecha: " + paredes.get(s));
            int numHabitacionDerecha = matrizNumHabitaciones[coorI][coorJ + 1];
            if (matrizDestacadas[coorI][coorJ + 1] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionDerecha] = matrizAdyacencia[numHabitacionCentro][numHabitacionDerecha] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            } else if (matrizDestacadas[coorI][coorJ + 1] == 0.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionDerecha] = matrizAdyacencia[numHabitacionCentro][numHabitacionDerecha] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            }
        }
        if (coorI - 1 != -1) {
            String s = ("pa" + matrizNumHabitaciones2[coorI - 1][coorJ] + "" + matrizNumHabitaciones2[coorI][coorJ]);
            System.out.println(s);
            String x = paredes.get(s);
            System.out.println("Arriba: " + paredes.get(s));
            int numHabitacionArriba = matrizNumHabitaciones[coorI - 1][coorJ];
            if (matrizDestacadas[coorI - 1][coorJ] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionArriba] = matrizAdyacencia[numHabitacionCentro][numHabitacionArriba] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            } else if (matrizDestacadas[coorI - 1][coorJ] == 0.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionArriba] = matrizAdyacencia[numHabitacionCentro][numHabitacionArriba] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            }
        }
        if (coorI + 1 != 3) {
            String s = ("pa" + matrizNumHabitaciones2[coorI][coorJ] + "" + matrizNumHabitaciones2[coorI + 1][coorJ]);
            System.out.println(s);
            String x = paredes.get(s);
            System.out.println("Abajo: " + paredes.get(s));
            int numHabitacionAbajo = matrizNumHabitaciones[coorI + 1][coorJ];
            if (matrizDestacadas[coorI + 1][coorJ] == 1.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionAbajo] = matrizAdyacencia[numHabitacionCentro][numHabitacionAbajo] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            } else if (matrizDestacadas[coorI + 1][coorJ] == 0.0) {
                matrizAdyacencia[numHabitacionCentro][numHabitacionAbajo] = matrizAdyacencia[numHabitacionCentro][numHabitacionAbajo] + sonidoTransmitido(energiaTransmitida(perdidaTransmision(masas.get(x), hz), matrizPromedios[coorI][coorJ]));
            }
        }
    }

    public double intensidadSonora(double db) {
        double I = Math.pow(10, (0.1 * db - 12));
        return I;
    }

    //Ejemplo para habitacion 5 como fuente
    /*Arriba izquieda derecha abajo*/
    //hab1 hab2              hab3 hab4              hab5 hab6              hab7 hab8              hab9
    /*0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab1
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab2
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab3
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab4
      0.0  15.64542466079137 0.0  15.64542466079137 0.0  15.64542466079137 0.0  15.64542466079137 0.0  //Hab5
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab6
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab7
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab8
      0.0  0.0               0.0  0.0               0.0  0.0               0.0  0.0               0.0  //Hab9 */
    public double[][] matrizIntensidadSonora = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public double[] arrayIntensidadPromedios = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public double[] arraySumaPromedioFuentes = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public double[] arrayFinal = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public void sumarDecibeles() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrizAdyacencia[i][j] != 0.0) {
                    matrizIntensidadSonora[i][j] = intensidadSonora(matrizAdyacencia[i][j]);
                }
            }
        }

        System.out.println("Matriz de intensidad");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizIntensidadSonora[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 9; i++) {
            if (arrayPromedioHabitaciones[i] != 0.0) {
                arrayIntensidadPromedios[i] = intensidadSonora(arrayPromedioHabitaciones[i]);
            }
        }

        System.out.println("Intensidad de Promedios");
        for (int i = 0; i < 9; i++) {
            System.out.print(arrayIntensidadPromedios[i] + " ");
        }

        System.out.println("");

        double aux = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                aux = aux + matrizIntensidadSonora[i][j];
            }
            arraySumaPromedioFuentes[i] = arrayIntensidadPromedios[i] + aux;
            aux = 0;
        }
        System.out.println("");

        System.out.println("Suma de intensidad de promedios mas Intensidades de fuentes");
        for (int i = 0; i < 9; i++) {
            System.out.print(arraySumaPromedioFuentes[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < 9; i++) {
            if (arraySumaPromedioFuentes[i] != 0) {
                arrayFinal[i] = 10 * Math.log10(arraySumaPromedioFuentes[i] / (Math.pow(10, -12)));
            }
        }

        System.out.println("Arreglo final:");
        for (int i = 0; i < 9; i++) {
            System.out.print(arrayFinal[i] + " ");
        }

    }

    public void compararHabitabilidad() {
        for (int i = 0; i < 9; i++) {

            if (arrayFinal[i] < arrayMaximoHabitaciones[i]) {
                arrayVeredicto[i] = "Es habitable";
            } else {
                arrayVeredicto[i] = "NO es habitable";
            }
        }

        System.out.println("Veredicto de Habitabilidad");
        for (int i = 0; i < 9; i++) {
            System.out.print(arrayVeredicto[i] + " ");
        }
        System.out.println("");
    }
}
