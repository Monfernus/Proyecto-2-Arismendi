/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author Edgar Torres
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
    //Escribir un validar nombre y validar sexo ya que tienen algunos simbolos y daba error
    public String ValidarLetras(String letras){
        if (validarletras(letras) == true) {
            return letras;
        } else {
            return null;
        }
    }
    
    public int ValidarCedula(String ci){
        String replaceAll = ci.replace(".", "");
        if(validarnumeros(replaceAll)== true){
            if(replaceAll.length() >= 7 && replaceAll.length()<= 9){
                int num = Integer.parseInt(replaceAll);
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
        String cell = telf.replaceAll(" ", "");
        if (cell.charAt(0) == '(') {
            if (cell.charAt(4) == ')') {
                String cell_uno = cell.replace('(', '0');
                String cell_dos = cell_uno.replace(')', '0');
                if (validarnumeros(cell_dos) == true) {
                    return telf;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    
    public String ValidarEmail(String email){
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                count++;
            }
        }
        if(count == 1){
            return email;
        }else{
            return null;
        }
    }
    
    public String Validar_TipoHab(String tipo_hab){
        if(tipo_hab.equalsIgnoreCase("simple") || tipo_hab.equalsIgnoreCase("doble") || tipo_hab.equalsIgnoreCase("triple") || tipo_hab.equalsIgnoreCase("suite")){
            return tipo_hab;
        }else{
              return null;
        }
    }
}
