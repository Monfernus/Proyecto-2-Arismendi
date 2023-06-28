/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Moises Loita
 */
public class Estado {
    private int num_hab;
    private Cliente cliente;
    private String llegada;

    public Estado(int num_hab, Cliente cliente, String llegada) {
        this.num_hab = num_hab;
        this.cliente = cliente;
        this.llegada = llegada;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
    
    // Arregla el to String para que imprima bonito
    @Override
    public String toString() {
        return  "num_hab=" + num_hab + ", cliente=" + cliente + ", llegada=" + llegada + '\n';
    } 
    
        /*Compara si dos documentos son iguales*/
    public boolean compareEstado(Estado estado){
        return (estado.getCliente().getTelf() == null ? this.cliente.getTelf() == null : estado.getCliente().getTelf().equals(this.cliente.getTelf())) && estado.getCliente().getNombre().equalsIgnoreCase(this.cliente.getNombre());
    }

}
