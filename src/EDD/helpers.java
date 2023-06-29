/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Moises Loita
 */
public class helpers {
    
    public boolean validarletras(String letra){
        return letra.matches("[a-zA-Zñ]*");
    }
    
    private boolean validarnumeros(String num){
        return num.matches("[0-9]*");
    }
    
    
    public int ValidarNumeros(String numero){
        if(validarnumeros(numero)== true){
            int num = Integer.parseInt(numero);
            return num;
        }else{
            return -1;
        }
    }
    
    public String ValidarLetras(String letras){
        if(validarletras(letras)== true){
            return letras;
        }else{
            return null;
        }
    }
    
    public int ValidarCedula(String ci){
        if(validarnumeros(ci)== true){
            if(ci.length() >= 7 && ci.length()<= 9){
                int num = Integer.parseInt(ci);
                return num;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    
    public String ValidarFecha(String fecha){
            return null;
    }
    
    public String Validartelf(String telf){
            return null;
    }
    
    public String ValidarEmail(){
        return null;
    }
}
