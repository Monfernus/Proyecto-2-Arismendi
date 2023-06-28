/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
    private NodoAB nodoRaiz;
    
    //Constructor
    public ArbolBinario() {
        this.nodoRaiz = null;
    }
    
    //Setter and Getter
    public NodoAB getNodoRaiz() {
        return nodoRaiz;
    }

    public void setNodoRaiz(NodoAB nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    //Primitivas 
    
    //Vacio 
    public boolean esVacio() {
        return this.getNodoRaiz() == null;
    }
    
    public void vaciar() {
        this.setNodoRaiz(null);
    }
    
    public void insertNodo(NodoAB raiz, int element) {
        NodoAB node = new NodoAB(element);
        if (esVacio()) {
            setNodoRaiz(node);
        } else {
            if (element <= (int) raiz.getDato()) {
                if (raiz.getHijoIzq() == null) {
                    raiz.setHijoIzq(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getHijoIzq(), element);
                }
            } else {
                if (raiz.getHijoDer() == null) {
                    raiz.setHijoDer(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getHijoDer(), element);
                }
            }
        }
    }
        
    public void deleteNodo(NodoAB raiz, int element) {
        if (!esVacio()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (element == (int)raiz.getDato()) {
                    if (raiz.getHijoIzq() == null && raiz.getHijoDer() == null) {
                        // Es una Hoja
                        if (element < (int)raiz.getFather().getDato()) {
                            raiz.getFather().setHijoIzq(null);
                        } else {
                            raiz.getFather().setHijoDer(null);
                        }
                        raiz.setFather(null);
                    } else if(raiz.getHijoIzq() == null) {
                        // Tiene solo hijo derecho
                        if (element < (int)raiz.getFather().getDato()) {
                            raiz.getFather().setHijoIzq(raiz.getHijoDer());
                        } else {
                            raiz.getFather().setHijoDer(raiz.getHijoDer());
                        }
                        raiz.getHijoDer().setFather(raiz.getFather());
                        raiz.setHijoDer(null);
                        raiz.setFather(null);
                    } else if(raiz.getHijoDer() == null) {
                        // Tiene solo hijo izquierdo
                        if (element < (int)raiz.getFather().getDato()) {
                            raiz.getFather().setHijoIzq(raiz.getHijoIzq());
                        } else {
                            raiz.getFather().setHijoDer(raiz.getHijoIzq());
                        }
                        raiz.getHijoIzq().setFather(raiz.getFather());
                        raiz.setHijoIzq(null);
                        raiz.setFather(null);
                    }
                } else if(element < (int)raiz.getDato()){
                    deleteNodo(raiz.getHijoIzq(), element);
                } else {
                    deleteNodo(raiz.getHijoDer(), element);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }
    
    public void preOrden(NodoAB root) {
        if (root != null) {
            System.out.println("{ "+root.getDato()+" }");
            preOrden(root.getHijoIzq());
            preOrden(root.getHijoDer());
        }
    }
    
    public void inOrden(NodoAB root) {
        if (root != null) {
            preOrden(root.getHijoIzq());
            System.out.println("{ "+root.getDato()+" }");
            preOrden(root.getHijoDer());
        }
    }
    
    public void postOrden(NodoAB root) {
        if (root != null) {
            preOrden(root.getHijoIzq());
            preOrden(root.getHijoDer());
            System.out.println("{ "+root.getDato()+" }");
        }
    }
    
    // Devolver los recorridos en cadenas
        public String Preorden(NodoAB raiz,String cadena){
        if(raiz!=null){
            cadena=cadena+raiz.getDato()+", ";
            cadena=Preorden(raiz.getHijoIzq(),cadena);
            cadena=Preorden(raiz.getHijoDer(),cadena);
        }
        return cadena;
    }

    public String Posorden(NodoAB raiz,String cadena){
        if(raiz!=null){
            cadena=Posorden(raiz.getHijoIzq(),cadena);
            cadena=Posorden(raiz.getHijoDer(),cadena);
            cadena=cadena+raiz.getDato()+", ";
               
        }
        return cadena;
    }

    public String Inorden(NodoAB root, String cadena){
        if(root!=null){
            cadena= Inorden(root.getHijoIzq(),cadena);
            cadena=cadena+root.getDato()+" ";
            cadena=Inorden(root.getHijoDer(),cadena);
        }
        return cadena;
    }
    
    public void Lista(NodoAB root, ListaSimple list) {
        list.insertarAlFinal(root.getDato());
        
        if(root.getHijoIzq() != null){
            Lista(root.getHijoIzq(), list);
        }
        if(root.getHijoDer() != null){
            Lista(root.getHijoDer(), list);
        }   
    }
}
