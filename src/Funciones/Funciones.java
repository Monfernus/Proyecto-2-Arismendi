/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;


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
 * @author Moises Loita
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
}
