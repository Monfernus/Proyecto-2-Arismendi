/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Archivo;
/**
 *
 * @author Luis Gustavo
 */
public class Functions {
    Welcome welcome = new Welcome();
    Menu menu = new Menu();
    BusquedaReservacion busq = new BusquedaReservacion();
    CheckIn ckI = new CheckIn();
    CheckOut ckO = new CheckOut();
    HistorialHabitacion hist = new HistorialHabitacion();
    RegistroClientes regist = new RegistroClientes();
    
    public void Welcome(){
        welcome.setVisible(true); 
    }
    
    public void Menu(){
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
}
