/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;


import Clases.Cliente;
import Clases.Estado;
import Clases.Habitacion;
import Clases.Reservacion;
import EDD.Hashtable;
import EDD.ListaSimple;
import EDD.Nodo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgard Torres
 */
public class Funciones {
    
   
    
    public void cargar_HashTable(ListaSimple list1, Reservacion reserv, Hashtable tabla) {
        Nodo aux = list1.getpFirst();
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            if (aux.getDato().equals(reserv)) {
                encontrado = true;
                break;
            } else {
                aux = aux.getPnext();
            }
        }

        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No hay reservacion.");
            //tabla.insertDocument(document);
            JOptionPane.showMessageDialog(null, "cargado");
        } else {
            //tabla.insertDocument(document);
            JOptionPane.showMessageDialog(null, "cargado");
        }
    }
    
    public String BuscarPorCedula(ListaSimple list, int ci) {
        Nodo aux = list.getpFirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservacion reserva1 = (Reservacion) list.getValor(i);
            Cliente cliente1 = reserva1.getCliente();
            if (cliente1.getCedula() == ci) {
                return reserva1.toString();
            }
            aux.getPnext();
        }
        return null;
    }
    
    public Reservacion Reservacion1(ListaSimple list, int ci) {
        Nodo aux = list.getpFirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservacion reserva1 = (Reservacion) list.getValor(i);
            Cliente cliente1 = reserva1.getCliente();
            if (cliente1.getCedula() == ci) {
                return reserva1;
            }
            aux.getPnext();
        }
        return null;
    }
    
    public int IndexReservacion(ListaSimple list, int ci) {
        Nodo aux = list.getpFirst();
        for (int i = 0; i < list.getSize(); i++) {
            Reservacion reserva1 = (Reservacion) list.getValor(i);
            Cliente cliente1 = reserva1.getCliente();
            if (cliente1.getCedula() == ci) {
                return i;
            }
            aux.getPnext();
        }
        return -1;
    }
    
    public void Empezar_Estadia(ListaSimple reservaciones, int ci, ListaSimple habitaciones, Hashtable table){
        if(BuscarPorCedula(reservaciones, ci) != null){
            int count = 0;
            Reservacion reserva = Reservacion1(reservaciones, ci);
            ListaSimple hab_disp = new ListaSimple();
            table.Disponibles(hab_disp);
            for (int i = 0; i < hab_disp.getSize(); i++) {
                int num_hab = (int) hab_disp.getValor(i);
                Habitacion hab = (Habitacion) habitaciones.getValor(num_hab-1);
                
                if(hab.getTipo_hab().equalsIgnoreCase(reserva.getTipo_hab())){
                    Estado estado = new Estado(hab.getNum_hab(), reserva.getCliente(), reserva.getFecha_llegada());
                    table.insertEstado(estado);
                    reservaciones.EliminarPorPosicion(IndexReservacion(reservaciones, ci));
                    count++;
                    break;
                }
            }
            
            if(count > 0){
                JOptionPane.showMessageDialog(null, "El cliente empezo su estadia.");
            }else{
                JOptionPane.showMessageDialog(null, "No hay habitacion disponible para el cliente.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El cliente no ha reservado, reserve para poder empezar su estadia.");
        }
    }
}
