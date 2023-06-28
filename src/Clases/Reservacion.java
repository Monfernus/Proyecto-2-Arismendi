/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Moises Loita
 */
public class Reservacion {
    private Cliente cliente;
    private String tipo_hab;
    private String fecha_llegada;
    private String facha_salida;

    public Reservacion(Cliente cliente, String tipo_hab, String fecha_llegada, String facha_salida) {
        this.cliente = cliente;
        this.tipo_hab = tipo_hab;
        this.fecha_llegada = fecha_llegada;
        this.facha_salida = facha_salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo_hab() {
        return tipo_hab;
    }

    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getFacha_salida() {
        return facha_salida;
    }

    public void setFacha_salida(String facha_salida) {
        this.facha_salida = facha_salida;
    }

    @Override
    public String toString() {
        return "cliente:" + cliente.getNombre() + "Cedula cliente:" + cliente.getCedula()+ "\ntipo_hab:" + tipo_hab + "\nfecha_llegada:" + fecha_llegada + "\nfacha_salida:" + facha_salida + '\n';
    }
    
    
}
