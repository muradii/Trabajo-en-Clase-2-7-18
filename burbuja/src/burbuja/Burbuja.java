/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author ulacit
 */
public class Burbuja {

    public static void main(String[] args) {
        
        String s = "Costa Rica Campeon del Mundo";
        String [] words = s.split(" ");
        for (int i = words.length; i>0 ; i--){
            String w = words[i-1];
            System.out.print("" + w);
        }
    }
       
}
    

