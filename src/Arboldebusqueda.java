/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import clases.Cliente.Cliente;
/**
 *
 * @author Edgar Torres
 */




public class Arboldebusqueda {
    
    public  arboldebusqueda {
        this.root = null;
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    
    public void insertar() {
        NodoArbol node = new NodoArbol();
        if (isEmpty()) {
            setRoot(node);
        } else {
            int day= Integer.parseInt(Cliente.getentrada().substring(0, 0)); 
            int mounth = Integer.parseInt(Cliente.getLlegada().substring(0, 0));
            int year = Integer.parseInt(clientes.getLlegada().substring(0, 0));
            int dayRoot = Integer.parseInt(root.getCliente().getEntrada().substring(0, 0));
            int mounthRoot = Integer.parseInt(root.getCliente().getEntrada().substring(0, 0));
            int yearRoot = Integer.parseInt(root.getCliente().getEntrada().substring(0, 0));
            if (year < yearRoot
                    || (year == yearRoot && mounth < mounthRoot)
                    || (year == yearRoot && mounth == mounthRoot && day < dayRoot)) {
                if (root.getLeftSon() == null) {
                      root.setLeftSon(node);
                } else {
                    insertar(Cliente, root.getLeftSon());
                }
            } else {
                if (root.getRightSon() == null) {
                    root.setRightSon(node);
                } else {
                    insertar(Cliente, root.getRightSon());
                }
            }
        }
    }
   
    public String inOrden(NodoArbol root) {
        return inOrdenRecursivo(root, "");
    }
    
    private String inOrdenRecursivo(NodoArbol root, String resultado) {
        if (root != null) {
            resultado = inOrdenRecursivo(root.getLeftSon(), resultado);
            resultado += root.getClientes().getcedula() + ", " + root.getClientes().getnombre() + ", " + root.getClientes().getapellido() + ", " + root.getClientes().getcorreo() + ", " + root.getClientes().getgenero() + ", " + root.getClientes().getentrada();
            resultado = inOrdenRecursivo(root.getRightSon(), resultado);
        }
        return resultado;
    }

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot() {
        this.root = root;
    }

    private static class clientes {

        private static Object getLlegada() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public clientes() {
        }
    }
   
}
