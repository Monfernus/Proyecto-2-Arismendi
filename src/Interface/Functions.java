/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Clases.Cliente;
import Clases.Estado;
import Clases.Reservacion;
import EDD.Hashtable;
import EDD.ListaSimple;
import EDD.Nodo;
import EDD.helpers;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Gustavo
 */
public class Functions {
    Welcome welcome = new Welcome();
    Menu menu = new Menu();
    Busqueda_reser busq = new Busqueda_reser();
    CheckIn ckI = new CheckIn();
    Check_Out ckO = new Check_Out();
    Historial hist = new Historial();
    Registro_clientes regist = new Registro_clientes();
    private helpers help = new helpers();

    
    public void Welcome(){
        welcome.setVisible(true); 
    }
    
    public void Menu(){
        menu.setVisible(true);
    }
    
    public void Menu2(){
        menu.setVisible(true);
    }
    
    public void BusquedaReservacion(){
        busq.setVisible(true);
    }
    
    public void CheckIn(){
        ckI.setVisible(true);
    }
    
    public void CheckOut(){
        ckO.setVisible(true);
    }
    
    public void HistorialHabitacion(){
        hist.setVisible(true);
    }
    
    public void RegistroClientes(){
        regist.setVisible(true);
    }
    
    public void Volver(){
        busq.setVisible(false);
        ckI.setVisible(false);
        ckO.setVisible(false);
        hist.setVisible(false);
        regist.setVisible(false);
    }
    
    //funcion para buscar a la persona en el registro del hotel
    private void Busca_Hospedado(){
        
    }
    
    //funcion para buscar el numero de reservacion del cliente 
    public void Buscar_Reservacion(){
        
    }
    
    //funcion que dado un numero de habitacion nos buscara en el arbol binario el historial de la habitacion
    public void Historial_Habitacion(){
        
    }
    
    //funcion para registrar el huesped
    public void Check_in(){
            
    }
    //funcion para sacar hacer check out del huesped
    public void Check_Out(){
        
    }
        
    //funcion para leer archivo TXT
    public void Leer_reservas(){  
    }
    public void Leer_habitaciones(){  
    }
    
    public void Leer_historico(){  
    }
    
    public void Leer_Estado(Hashtable table){
        String line;
        String expresion_txt = "";
        String path = "test\\estado.csv";
        File file = new File(path);
        try{
            if(!file.exists()){
               file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if(!line.isEmpty()){
                        expresion_txt += line + "\n";
                    }
                }
                if (!"".equals(expresion_txt)){
                    String[] expresion_split = expresion_txt.split("\n");
                    for(int i =0;i < expresion_split.length-1;i++){
                        String[] info = expresion_split[i].split(",");
                        if(!info[0].equalsIgnoreCase("")){
                            if(help.ValidarNumeros(info[0]) != -1){
                                int num_hab = help.ValidarNumeros(info[0]);
                                
                                String nombre = help.ValidarLetras(info[1]);
                                String apellido = help.ValidarLetras(info[2]);
                                String email = info[3];
                                String sexo = help.ValidarLetras(info[4]);
                                String telf = info[5];
                                Cliente cliente = new Cliente(nombre,apellido,email,sexo,telf);
                                
                                String fecha_llegada = info[6];
                                
                                Estado estado = new Estado(num_hab, cliente,fecha_llegada);
                                
                                table.insertEstado(estado);  
                           }else{
                              JOptionPane.showMessageDialog(null, "El numero de habitacion tiene un error");
                           }
                        }    
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }  
        } catch (HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Error al leer la expresion");
        }
    }
    
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

    

    public static class Precargar {

        public Precargar() {
        }
    }

    public static class Funciones {

        public Funciones() {
        }
    }
}
