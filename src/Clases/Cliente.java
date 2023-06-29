/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author gabri
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String segundo_nombre;
    private String email;
    private String genero;
    private String cedula;
    private String telf;
    private String entrada;
    private String salida;

    public Cliente(String cedula, String nombre, String segundo_nombre, String email, String genero, String telf, String entrada, String salida) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.email = email;
        this.genero = genero;
        this.telf = telf;
        this.entrada = entrada;
        this.salida = salida;
    }
    
    public Cliente(String nombre, String segundo_nombre, String email, String genero, String telf) {
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.email = email;
        this.genero = genero;
        this.cedula = null;
        this.telf = telf;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    /*@Override
    public String toString() {
        return "nombre:" + nombre + "\nsegundo_nombre:" + segundo_nombre + "\nemail:" + email + "\ngenero:" + genero + "\ncedula:" + cedula + "\ntelf:" + telf + '\n';
    }*/
    
    
}
