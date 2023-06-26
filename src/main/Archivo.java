/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Luis Gustavo
 */
public class Archivo {
    

    public void Reservas() {
        try {
            //Abrimos el XSSFWorkbook
            FileInputStream f = new FileInputStream("Booking_hotel.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //Seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(0);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;
            //Recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                //Recorremos todas las celdas
                while (celdas.hasNext()) {

                    //Cogemos la siguiente fila
                    celda = celdas.next();

                    //Segun el tipo de celda, usaremos uno u otra funcion
                    switch (celda.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC -> {
                            double x = celda.getNumericCellValue();
                            if (x < 100000){
                                Date javaDate= DateUtil.getJavaDate((double) x);
                                System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(javaDate));
                                
                            } else {
                                System.out.println(String.format("%.0f", (double)celda.getNumericCellValue()));

                            }
                            
                        }
                        case Cell.CELL_TYPE_STRING -> System.out.println(celda.getStringCellValue());
                    }

                }
            }

            //cerramos el libro
            f.close();
            libro.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Habitaciones() {
        try {
            //Abrimos el XSSFWorkbook
            FileInputStream f = new FileInputStream("Booking_hotel.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //Seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(1);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;
            //Recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                //Recorremos todas las celdas
                while (celdas.hasNext()) {

                    //Cogemos la siguiente fila
                    celda = celdas.next();

                    //Segun el tipo de celda, usaremos uno u otra funcion
                    switch (celda.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC -> System.out.println(String.format("%.0f", (double)celda.getNumericCellValue()));
                        case Cell.CELL_TYPE_STRING -> System.out.println(celda.getStringCellValue());
                    }

                }
            }

            //cerramos el libro
            f.close();
            libro.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Estado() {
        try {
            //Abrimos el XSSFWorkbook
            FileInputStream f = new FileInputStream("Booking_hotel.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //Seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(2);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;
            //Recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                //Recorremos todas las celdas
                while (celdas.hasNext()) {

                    //Cogemos la siguiente fila
                    celda = celdas.next();

                    //Segun el tipo de celda, usaremos uno u otra funcion
                    switch (celda.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC -> System.out.println(String.format("%.0f", (double)celda.getNumericCellValue()));
                        case Cell.CELL_TYPE_STRING -> System.out.println(celda.getStringCellValue());
                        
                    }

                }
            }

            //cerramos el libro
            f.close();
            libro.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void Historico() {
        try {
            //Abrimos el XSSFWorkbook
            FileInputStream f = new FileInputStream("Booking_hotel.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(f);

            //Seleccionamos la primera hoja
            XSSFSheet hoja = libro.getSheetAt(3);

            //Cogemos todas las filas de esa hoja
            Iterator<Row> filas = hoja.iterator();
            Iterator<Cell> celdas;

            Row fila;
            Cell celda;
            //Recorremos las filas
            while (filas.hasNext()) {

                //Cogemos la siguiente fila
                fila = filas.next();

                //Cogemos todas las celdas de esa fila
                celdas = fila.cellIterator();

                //Recorremos todas las celdas
                while (celdas.hasNext()) {

                    //Cogemos la siguiente fila
                    celda = celdas.next();

                    //Segun el tipo de celda, usaremos uno u otra funcion
                    switch (celda.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC -> System.out.println(String.format("%.0f", (double)celda.getNumericCellValue()));
                        case Cell.CELL_TYPE_STRING -> System.out.println(celda.getStringCellValue());
                    }

                }
            }

            //cerramos el libro
            f.close();
            libro.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
