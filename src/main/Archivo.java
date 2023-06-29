/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;


/**
 *
 * @author Luis Gustavo
 */
public class Archivo {
    

    public void Reservas() {
        String file = "src//reservas.csv";
        BufferedReader reader = null;
        String line = "";

        try {
         reader = new BufferedReader(new FileReader(file));
         while((line = reader.readLine()) != null) {

          String[] row = line.split(",");
          //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
      //use this if your values already contain commas
          for(String index : row) {
           System.out.printf("%-10s", index);
          }
          System.out.println();
         }
        }
        catch(IOException e) {
         e.printStackTrace();
        }
        finally {
            try {
                    reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public void Habitaciones() {
        String file = "src//reservas.csv";
        BufferedReader reader = null;
        String line = "";

        try {
         reader = new BufferedReader(new FileReader(file));
         while((line = reader.readLine()) != null) {

          String[] row = line.split(","+",");
          //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
      //use this if your values already contain commas
          for(String index : row) {
           System.out.printf("%-10s", index);
          }
          System.out.println();
         }
        }
        catch(Exception e) {
         e.printStackTrace();
        }
        finally {
         try {
          reader.close();
         } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
         }
        }
    }
    
    public void Estado() {
         String file = "src//reservas.csv";
        BufferedReader reader = null;
        String line = "";

        try {
         reader = new BufferedReader(new FileReader(file));
         while((line = reader.readLine()) != null) {

          String[] row = line.split(","+",");
          //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
      //use this if your values already contain commas
          for(String index : row) {
           System.out.printf("%-10s", index);
          }
          System.out.println();
         }
        }
        catch(Exception e) {
         e.printStackTrace();
        }
        finally {
         try {
          reader.close();
         } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
         }
        }
    }
    
    public void Historico() {
        String file = "src//reservas.csv";
        BufferedReader reader = null;
        String line = "";

        try {
         reader = new BufferedReader(new FileReader(file));
         while((line = reader.readLine()) != null) {

          String[] row = line.split(","+",");
          //String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
      //use this if your values already contain commas
          for(String index : row) {
           System.out.printf("%-10s", index);
          }
          System.out.println();
         }
        }
        catch(Exception e) {
         e.printStackTrace();
        }
        finally {
         try {
          reader.close();
         } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
         }
        }
    }
    
}
