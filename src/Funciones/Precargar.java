/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Clases.Cliente;
import Clases.Estado;
import EDD.Hashtable;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Precargar {
    
    private helpers help = new helpers();
    
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
}
