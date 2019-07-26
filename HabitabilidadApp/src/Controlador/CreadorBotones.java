/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class CreadorBotones implements ActionListener{
    
    JButton btHabitacion1, btHabitacion2, btHabitacion3, btHabitacion4, btHabitacion5, btHabitacion6, btHabitacion7, btHabitacion8, btHabitacion9;
    JButton btAplicarUso, btAplicarPared, btEnviarHabitabilidad;
    JComboBox tipoEspacio, tipoPared;
    JLabel lbHab, lbPar, lbTitulo, lbTituloTabla;
    
    DefaultTableModel model;
    JTable tbHabitacionesUsos;
    
    Habitacion hab1, hab2, hab3, hab4, hab5, hab6, hab7, hab8, hab9;
    
    Pared pa12, pa23, pa45, pa56, pa78, pa89, pa14, pa25, pa36,
            pa47,pa58,pa69;
    
    JButton btPa12, btPa23, btPa45, btPa56, btPa78, btPa89,
            btPa14, btPa25, btPa36, btPa47, btPa58, btPa69;
    
    String stHabSelecc = "";
    String stParSelecc = "";
    int iHabSelecc;
    int iParSelecc;
    
    double[] maximoHabitaciones = {0,0,0,0,0,0,0,0,0};
    double[] nivelEstimado = {0,0,0,0,0,0,0,0,0};
    String[] veredicto = {"","","","","","","","",""};
    
    public JPanel Habitaciones(){
        
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(40, 40, 650, 400);
        
        lbTitulo = new JLabel();
        lbTitulo.setText("Habitabilidad App: Acústica");
        lbTitulo.setBounds(250,0,200,20);
        lbTitulo.setVisible(true);
        Panel.add(lbTitulo);
        
        hab1 = new Habitacion("1");
        hab2 = new Habitacion("2");
        hab3 = new Habitacion("3");
        hab4 = new Habitacion("4");
        hab5 = new Habitacion("5");
        hab6 = new Habitacion("6");
        hab7 = new Habitacion("7");
        hab8 = new Habitacion("8");
        hab9 = new Habitacion("9");
        
        pa12 = new Pared(1,2);
        btPa12 = pa12.getBoton();
        btPa12.setBounds(200,20,45,100);
        btPa12.setVisible(true);
        btPa12.addActionListener(this);
        Panel.add(btPa12);
        
        System.out.println(pa12.getMaterial());
        
        pa23 = new Pared(2,3);
        btPa23 = pa23.getBoton();
        btPa23.setBounds(425,20,45,100);
        btPa23.setVisible(true);
        btPa23.addActionListener(this);
        Panel.add(btPa23);
        
        pa45 = new Pared(4,5);
        btPa45 = pa45.getBoton();
        btPa45.setBounds(200,155,45,100);
        btPa45.setVisible(true);
        btPa45.addActionListener(this);
        Panel.add(btPa45);
        
        pa56 = new Pared(5,6);
        btPa56 = pa56.getBoton();
        btPa56.setBounds(425,155,45,100);
        btPa56.setVisible(true);
        btPa56.addActionListener(this);
        Panel.add(btPa56);
        
        pa78 = new Pared(7,8);
        btPa78 = pa78.getBoton();
        btPa78.setBounds(200,290,45,100);
        btPa78.setVisible(true);
        btPa78.addActionListener(this);
        Panel.add(btPa78);
        
        pa89 = new Pared(8,9);
        btPa89 = pa89.getBoton();
        btPa89.setBounds(425,290,45,100);
        btPa89.setVisible(true);
        btPa89.addActionListener(this);
        Panel.add(btPa89);
        
        pa14 = new Pared(1,4);
        btPa14 = pa14.getBoton();
        btPa14.setBounds(25,125,170,25);
        btPa14.setVisible(true);
        btPa14.addActionListener(this);
        Panel.add(btPa14);
        
        pa25 = new Pared(2,5);
        btPa25 = pa25.getBoton();
        btPa25.setBounds(250,125,170,25);
        btPa25.setVisible(true);
        btPa25.addActionListener(this);
        Panel.add(btPa25);
        
        pa36 = new Pared(3,6);
        btPa36 = pa36.getBoton();
        btPa36.setBounds(475,125,170,25);
        btPa36.setVisible(true);
        btPa36.addActionListener(this);
        Panel.add(btPa36);
        
        pa47 = new Pared(4,7);
        btPa47 = pa47.getBoton();
        btPa47.setBounds(25,260,170,25);
        btPa47.setVisible(true);
        btPa47.addActionListener(this);
        Panel.add(btPa47);
        
        pa58 = new Pared(5,8);
        btPa58 = pa58.getBoton();
        btPa58.setBounds(250,260,170,25);
        btPa58.setVisible(true);
        btPa58.addActionListener(this);
        Panel.add(btPa58);
        
        pa69 = new Pared(6,9);
        btPa69 = pa69.getBoton();
        btPa69.setBounds(475,260,170,25);
        btPa69.setVisible(true);
        btPa69.addActionListener(this);
        Panel.add(btPa69);
        
        btHabitacion1 = hab1.getBoton();
        btHabitacion1.setBounds(25, 20, 170, 100);
        btHabitacion1.setVisible(true);
        btHabitacion1.addActionListener(this);
        Panel.add(btHabitacion1);
        
        btHabitacion2 = hab2.getBoton();
        btHabitacion2.setBounds(250, 20, 170, 100);
        btHabitacion2.setVisible(true);
        btHabitacion2.addActionListener(this);
        Panel.add(btHabitacion2);
        
        btHabitacion3 = hab3.getBoton();
        btHabitacion3.setBounds(475, 20, 170, 100);
        btHabitacion3.setVisible(true);
        btHabitacion3.addActionListener(this);
        Panel.add(btHabitacion3);
        
        btHabitacion4 = hab4.getBoton();
        btHabitacion4.setBounds(25, 155, 170, 100);
        btHabitacion4.setVisible(true);
        btHabitacion4.addActionListener(this);
        Panel.add(btHabitacion4);
        
        btHabitacion5 = hab5.getBoton();
        btHabitacion5.setBounds(250, 155, 170, 100);
        btHabitacion5.setVisible(true);
        btHabitacion5.addActionListener(this);
        Panel.add(btHabitacion5);
        
        btHabitacion6 = hab6.getBoton();
        btHabitacion6.setBounds(475, 155, 170, 100);
        btHabitacion6.setVisible(true);
        btHabitacion6.addActionListener(this);
        Panel.add(btHabitacion6);
        
        btHabitacion7 = hab7.getBoton();
        btHabitacion7.setBounds(25, 290, 170, 100);
        btHabitacion7.setVisible(true);
        btHabitacion7.addActionListener(this);
        Panel.add(btHabitacion7);
        
        btHabitacion8 = hab8.getBoton();
        btHabitacion8.setBounds(250, 290, 170, 100);
        btHabitacion8.setVisible(true);
        btHabitacion8.addActionListener(this);
        Panel.add(btHabitacion8);
        
        btHabitacion9 = hab9.getBoton();
        btHabitacion9.setBounds(475, 290, 170, 100);
        btHabitacion9.setVisible(true);
        btHabitacion9.addActionListener(this);
        Panel.add(btHabitacion9);

        return Panel;
    }
    
    public JPanel Usos(){
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(700, 40, 650, 100);
        
        lbHab = new JLabel();
        lbHab.setText("Habitacion seleccionada: ");
        lbHab.setBounds(25,0,200,10);
        lbHab.setVisible(true);
        Panel.add(lbHab);
        
        tipoEspacio = new JComboBox();
        tipoEspacio.setBounds(25, 20, 200, 20);
        tipoEspacio.addItem("Sin uso");
        tipoEspacio.addItem("Biblioteca");
        tipoEspacio.addItem("Dormitorio");
        tipoEspacio.addItem("Cocina");
        tipoEspacio.addItem("Baño");
        tipoEspacio.addItem("Sala");
        tipoEspacio.addItem("Oficina");
        tipoEspacio.addItem("Salon de eventos");
        tipoEspacio.addItem("Oficina de negocios");
        tipoEspacio.setVisible(true);
        Panel.add(tipoEspacio);
        
        btAplicarUso = new JButton("Aplicar");
        btAplicarUso.setBounds(75, 50, 100, 50);
        btAplicarUso.setVisible(true);
        btAplicarUso.addActionListener(this);
        Panel.add(btAplicarUso);

        return Panel;
    }
    
    public JPanel UsosParedes(){
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(700, 150, 650, 150);
        
        lbPar = new JLabel();
        lbPar.setText("Pared seleccionada: ");
        lbPar.setBounds(25,20,200,15);
        lbPar.setVisible(true);
        Panel.add(lbPar);
        
        tipoPared = new JComboBox();
        tipoPared.setBounds(25, 40, 200, 20);
        tipoPared.addItem("Hormigon");
        tipoPared.addItem("Madera");
        tipoPared.addItem("Ladrillo");
        tipoPared.setVisible(true);
        Panel.add(tipoPared);
        
        btAplicarPared = new JButton("Aplicar");
        btAplicarPared.setBounds(75, 70, 100, 50);
        btAplicarPared.setVisible(true);
        btAplicarPared.addActionListener(this);
        Panel.add(btAplicarPared);
        
        return Panel;
    }
    
    public JPanel TablaUsos(){
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(40, 450, 700, 340);
        
        lbTituloTabla = new JLabel();
        lbTituloTabla.setText("Informacion por habitacion");
        lbTituloTabla.setBounds(150,0,200,20);
        lbTituloTabla.setVisible(true);
        Panel.add(lbTituloTabla);
        
        model = new DefaultTableModel();
        tbHabitacionesUsos = new JTable();
        tbHabitacionesUsos.setModel(model);
        model.addColumn("Habitaciones");
        model.addColumn("Usos");
        model.addColumn("db Promedio");
        model.addColumn("Maximo");
        model.addColumn("Nivel estimado");
        model.addRow(new Object[]{"Habitaciones", "Usos", "Promedio de db", "Maximo de db", "Nivel estimado"});
        model.addRow(new Object[]{hab1.getStNombreHabitacion(), hab1.getUso(), hab1.getPromedioOrigen(), maximoHabitaciones[0], nivelEstimado[0]});
        model.addRow(new Object[]{hab2.getStNombreHabitacion(), hab2.getUso(), hab2.getPromedioOrigen(), maximoHabitaciones[1], nivelEstimado[1]});
        model.addRow(new Object[]{hab3.getStNombreHabitacion(), hab3.getUso(), hab3.getPromedioOrigen(), maximoHabitaciones[2], nivelEstimado[2]});
        model.addRow(new Object[]{hab4.getStNombreHabitacion(), hab4.getUso(), hab4.getPromedioOrigen(), maximoHabitaciones[3], nivelEstimado[3]});
        model.addRow(new Object[]{hab5.getStNombreHabitacion(), hab5.getUso(), hab5.getPromedioOrigen(), maximoHabitaciones[4], nivelEstimado[4]});
        model.addRow(new Object[]{hab6.getStNombreHabitacion(), hab6.getUso(), hab6.getPromedioOrigen(), maximoHabitaciones[5], nivelEstimado[5]});
        model.addRow(new Object[]{hab7.getStNombreHabitacion(), hab7.getUso(), hab7.getPromedioOrigen(), maximoHabitaciones[6], nivelEstimado[6]});
        model.addRow(new Object[]{hab8.getStNombreHabitacion(), hab8.getUso(), hab8.getPromedioOrigen(), maximoHabitaciones[7], nivelEstimado[7]});
        model.addRow(new Object[]{hab9.getStNombreHabitacion(), hab9.getUso(), hab9.getPromedioOrigen(), maximoHabitaciones[8], nivelEstimado[8]});
        
        tbHabitacionesUsos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbHabitacionesUsos.getTableHeader().setReorderingAllowed(false);
        
        tbHabitacionesUsos.setBounds(25, 25, 620, 160);
        tbHabitacionesUsos.setVisible(true);
        Panel.add(tbHabitacionesUsos);
        
        return Panel;
    }
    
    public JPanel Habitabilidad(){
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(700, 350, 350, 150);
        
        btEnviarHabitabilidad = new JButton("Calcular habitabilidad");
        
        btEnviarHabitabilidad.setBounds(25, 0, 200, 50);
        btEnviarHabitabilidad.setVisible(true);
        btEnviarHabitabilidad.addActionListener(this);
        Panel.add(btEnviarHabitabilidad);
        
        return Panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int op;
        if(e.getSource()==btHabitacion1){
            stHabSelecc = "1";
            iHabSelecc = 1;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion2){
            stHabSelecc = "2";
            iHabSelecc = 2;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion3){
            stHabSelecc = "3";
            iHabSelecc = 3;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion4){
            stHabSelecc = "4";
            iHabSelecc = 4;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion5){
            stHabSelecc = "5";
            iHabSelecc = 5;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion6){
            stHabSelecc = "6";
            iHabSelecc = 6;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion7){
            stHabSelecc = "7";
            iHabSelecc = 7;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion8){
            stHabSelecc = "8";
            iHabSelecc = 8;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if(e.getSource()==btHabitacion9){
            stHabSelecc = "9";
            iHabSelecc = 9;
            lbHab.setText("Uso de habitacion " + stHabSelecc);
        }
        
        if (e.getSource()==btAplicarUso){
            System.out.println("Boton aplicar presionado, opcion: " + iHabSelecc);
            op = iHabSelecc;
            switch(op){
                case 1:
                    hab1.setUso(tipoEspacio.getSelectedItem().toString());
                    hab1.establecerPromedio();
                    hab1.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab1.getUso(), 1, 1);
                    tbHabitacionesUsos.setValueAt(hab1.getPromedioOrigen(), 1, 2);
                    tbHabitacionesUsos.setValueAt(hab1.getRuidoMax(), 1, 3);
                    System.out.println("Uso de la habitacion 1: " + hab1.getUso());
                    break;
                case 2:
                    hab2.setUso(tipoEspacio.getSelectedItem().toString());
                    hab2.establecerPromedio();
                    hab2.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab2.getUso(), 2, 1);
                    tbHabitacionesUsos.setValueAt(hab2.getPromedioOrigen(), 2, 2);
                    tbHabitacionesUsos.setValueAt(hab2.getRuidoMax(), 2, 3);
                    System.out.println("Uso de la habitacion 2: " + hab2.getUso());
                    break;
                case 3:
                    hab3.setUso(tipoEspacio.getSelectedItem().toString());
                    hab3.establecerPromedio();
                    hab3.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab3.getPromedioOrigen(), 3, 2);
                    tbHabitacionesUsos.setValueAt(hab3.getUso(), 3, 1);
                    tbHabitacionesUsos.setValueAt(hab3.getRuidoMax(), 3, 3);
                    System.out.println("Uso de la habitacion 3: " + hab3.getUso());
                    break;
                case 4:
                    hab4.setUso(tipoEspacio.getSelectedItem().toString());
                    hab4.establecerPromedio();
                    hab4.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab4.getPromedioOrigen(), 4, 2);
                    tbHabitacionesUsos.setValueAt(hab4.getUso(), 4, 1);
                    tbHabitacionesUsos.setValueAt(hab4.getRuidoMax(), 4, 3);
                    System.out.println("Uso de la habitacion 4: " + hab4.getUso());
                    break;
                case 5:
                    hab5.setUso(tipoEspacio.getSelectedItem().toString());
                    hab5.establecerPromedio();
                    hab5.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab5.getPromedioOrigen(), 5, 2);
                    tbHabitacionesUsos.setValueAt(hab5.getUso(), 5, 1);
                    tbHabitacionesUsos.setValueAt(hab5.getRuidoMax(), 5, 3);
                    System.out.println("Uso de la habitacion 5: " + hab5.getUso());
                    break;
                case 6:
                    hab6.setUso(tipoEspacio.getSelectedItem().toString());
                    hab6.establecerPromedio();
                    hab6.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab6.getPromedioOrigen(), 6, 2);
                    tbHabitacionesUsos.setValueAt(hab6.getUso(), 6, 1);
                    tbHabitacionesUsos.setValueAt(hab6.getRuidoMax(), 6, 3);
                    System.out.println("Uso de la habitacion 6: " + hab6.getUso());
                    break;
                case 7:
                    hab7.setUso(tipoEspacio.getSelectedItem().toString());
                    hab7.establecerPromedio();
                    hab7.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab7.getPromedioOrigen(), 7, 2);
                    tbHabitacionesUsos.setValueAt(hab7.getUso(), 7, 1);
                    tbHabitacionesUsos.setValueAt(hab7.getRuidoMax(), 7, 3);
                    System.out.println("Uso de la habitacion 7: " + hab7.getUso());
                    break;
                case 8:
                    hab8.setUso(tipoEspacio.getSelectedItem().toString());
                    hab8.establecerPromedio();
                    hab8.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab8.getPromedioOrigen(), 8, 2);
                    tbHabitacionesUsos.setValueAt(hab8.getUso(), 8, 1);
                    tbHabitacionesUsos.setValueAt(hab8.getRuidoMax(), 8, 3);
                    System.out.println("Uso de la habitacion 8: " + hab8.getUso());
                    break;
                case 9:
                    hab9.setUso(tipoEspacio.getSelectedItem().toString());
                    hab9.establecerPromedio();
                    hab9.establecerMaximo();
                    tbHabitacionesUsos.setValueAt(hab9.getPromedioOrigen(), 9, 2);
                    tbHabitacionesUsos.setValueAt(hab9.getUso(), 9, 1);
                    tbHabitacionesUsos.setValueAt(hab9.getRuidoMax(), 9, 3);
                    System.out.println("Uso de la habitacion 9: " + hab9.getUso());
                    break;
            }
        }
        
        if(e.getSource()==btPa12){
            stHabSelecc = "1-2";
            iParSelecc = 12;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa14){
            stHabSelecc = "1-4";
            iParSelecc = 14;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa23){
            stHabSelecc = "2-3";
            iParSelecc = 23;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa25){
            stHabSelecc = "2-5";
            iParSelecc = 25;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa36){
            stHabSelecc = "3-6";
            iParSelecc = 36;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa45){
            stHabSelecc = "4-5";
            iParSelecc = 45;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa47){
            stHabSelecc = "4-7";
            iParSelecc = 47;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa56){
            stHabSelecc = "5-6";
            iParSelecc = 56;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa58){
            stHabSelecc = "5-8";
            iParSelecc = 58;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa69){
            stHabSelecc = "6-9";
            iParSelecc = 69;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa78){
            stHabSelecc = "7-8";
            iParSelecc = 78;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if(e.getSource()==btPa89){
            stHabSelecc = "8-9";
            iParSelecc = 89;
            lbPar.setText("Material de la pared: " + stHabSelecc);
        }
        
        if (e.getSource()==btAplicarPared){
            System.out.println("Boton aplicar a la pared presionado, opcion: " + iParSelecc);
            String materialSeleccionado = tipoPared.getSelectedItem().toString();
            Color c = Color.white;
            switch(materialSeleccionado){
                case "Hormigon":
                    c = new Color(104, 108, 94);
                    break;
                case "Madera":
                    c = new Color(223, 154, 79);
                    break;
                case "Ladrillo":
                    c = new Color(197, 66, 36);
                    break;
            }
            
            op = iParSelecc;
            switch(op){
                case 12:
                    pa12.setMaterial(materialSeleccionado);
                    btPa12.setBackground(c);
                    System.out.println("Material de la pared: " + pa12.getMaterial());
                    break;
                case 14:
                    pa14.setMaterial(materialSeleccionado);
                    btPa14.setBackground(c);
                    System.out.println("Material de la pared: " + pa14.getMaterial());
                    break;
                case 23:
                    pa23.setMaterial(materialSeleccionado);
                    btPa23.setBackground(c);
                    System.out.println("Material de la pared: " + pa23.getMaterial());
                    break;
                case 25:
                    pa25.setMaterial(materialSeleccionado);
                    btPa25.setBackground(c);
                    System.out.println("Material de la pared: " + pa25.getMaterial());
                    break;
                case 36:
                    pa36.setMaterial(materialSeleccionado);
                    btPa36.setBackground(c);
                    System.out.println("Material de la pared: " + pa36.getMaterial());
                    break;
                case 45:
                    pa45.setMaterial(materialSeleccionado);
                    btPa45.setBackground(c);
                    System.out.println("Material de la pared: " + pa45.getMaterial());
                    break;
                case 47:
                    pa47.setMaterial(materialSeleccionado);
                    btPa47.setBackground(c);
                    System.out.println("Material de la pared: " + pa47.getMaterial());
                    break;
                case 56:
                    pa56.setMaterial(materialSeleccionado);
                    btPa56.setBackground(c);
                    System.out.println("Material de la pared: " + pa56.getMaterial());
                    break;
                case 58:
                    pa58.setMaterial(materialSeleccionado);
                    btPa58.setBackground(c);
                    System.out.println("Material de la pared: " + pa58.getMaterial());
                    break;
                case 69:
                    pa69.setMaterial(materialSeleccionado);
                    btPa69.setBackground(c);
                    System.out.println("Material de la pared: " + pa69.getMaterial());
                    break;
                case 78:
                    pa78.setMaterial(materialSeleccionado);
                    btPa78.setBackground(c);
                    System.out.println("Material de la pared: " + pa78.getMaterial());
                    break;
                case 89:
                    pa89.setMaterial(materialSeleccionado);
                    btPa89.setBackground(c);
                    System.out.println("Material de la pared: " + pa89.getMaterial());
                    break;
            }
        }
        
        if (e.getSource()==btEnviarHabitabilidad){
            Habitabilidad evHab = new Habitabilidad(hab1, hab2, hab3, hab4, hab5, hab6, hab7, hab8, hab9, pa12, pa23, pa45, pa56, pa78, pa89, pa14, pa25, pa36, pa47, pa58, pa69);
            evHab.destacarOrigen();
            
            nivelEstimado = evHab.getArrayFinal();
            veredicto = evHab.getArrayVeredicto();
            
            pintarHabitables();
            mostrarEstimado();
            
        }   
    }
    
    public void pintarHabitables(){
        
        if (veredicto[0].equals("Es habitable")){
            btHabitacion1.setBackground(Color.GREEN);
        } else {
            btHabitacion1.setBackground(Color.red);
        }
        
        if (veredicto[1].equals("Es habitable")){
            btHabitacion2.setBackground(Color.GREEN);
        } else {
            btHabitacion2.setBackground(Color.red);
        }
        
        if (veredicto[2].equals("Es habitable")){
            btHabitacion3.setBackground(Color.GREEN);
        } else {
            btHabitacion3.setBackground(Color.red);
        }
        
        if (veredicto[3].equals("Es habitable")){
            btHabitacion4.setBackground(Color.GREEN);
        } else {
            btHabitacion4.setBackground(Color.red);
        }
        
        if (veredicto[4].equals("Es habitable")){
            btHabitacion5.setBackground(Color.GREEN);
        } else {
            btHabitacion5.setBackground(Color.red);
        }
        
        if (veredicto[5].equals("Es habitable")){
            btHabitacion6.setBackground(Color.GREEN);
        } else {
            btHabitacion6.setBackground(Color.red);
        }
        
        if (veredicto[6].equals("Es habitable")){
            btHabitacion7.setBackground(Color.GREEN);
        } else {
            btHabitacion7.setBackground(Color.red);
        }
        
        if (veredicto[7].equals("Es habitable")){
            btHabitacion8.setBackground(Color.GREEN);
        } else {
            btHabitacion8.setBackground(Color.red);
        }
        
        if (veredicto[8].equals("Es habitable")){
            btHabitacion9.setBackground(Color.GREEN);
        } else {
            btHabitacion9.setBackground(Color.red);
        }
    }
    
    public void mostrarEstimado(){
        
        for (int i=0;i<9;i++){
            tbHabitacionesUsos.setValueAt(nivelEstimado[i], i+1, 4);
        }
        
        
    }
}
