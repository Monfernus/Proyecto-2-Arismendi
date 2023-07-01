/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author gabri
 */
public class NodoAB {
     private int num_hab;
    private ListaSimple clientes;
    private NodoAB HijoIzq;
    private NodoAB HijoDer;
    private NodoAB father;

    public NodoAB(int num_hab, ListaSimple cliente) {
        this.num_hab = num_hab;
        this.clientes = cliente;
        this.HijoDer = this.HijoIzq = this.father = null;
    }

    public NodoAB getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(NodoAB HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public NodoAB getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(NodoAB HijoDer) {
        this.HijoDer = HijoDer;
    }

    public NodoAB getFather() {
        return father;
    }

    public void setFather(NodoAB father) {
        this.father = father;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public ListaSimple getClientes() {
        return clientes;
    }

    public void setClientes(ListaSimple Clientes) {
        this.clientes = Clientes;
    }
    
}
