/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;
import java.util.Hashtable;

/**
 *
 * @author Luis Gustavo
 */
public class Hash {
    
    String [] theArray;
    int arraySize;
    int itemsInArray = 0;
    
    Hash(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }
    
    public void hashFunct(String [] stringsForArray, String[] theArray){
        for (int i = 0; i < stringsForArray.length; i++) {
            String newElementVal = stringsForArray[i];
            int arrayIndex = Integer.parseInt(newElementVal)%29;
            System.out.println("Modulus Index= "+ arrayIndex + "for value: "+ newElementVal);
            
            while(theArray[arrayIndex]!= "-1"){
                ++arrayIndex;
                System.out.println("Collision try "+ arrayIndex+" Instead");
                arrayIndex %= arraySize;
            }
            
            theArray[arrayIndex] = newElementVal;
            
        }
        
    }
    
}
