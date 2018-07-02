/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Random;

public class Arreglos {

    public static void main(String[] args) {
       
        /*int [] a = new int [5];
        a [0] = 10;
        a [1] = 15;
        a [4] = 25;
        System.out.print("Pos 4 " + a[4]);
        */
        Random r = new Random();
        int [] arreglo1 = new int [3];
        int [] arreglo2 = new int [3];
        int [] arreglo3 = new int[3];
        for (int i = 0; i < arreglo1.length; i++){
            int number = r.nextInt(10);
            arreglo1[i] = number;
            System.out.println(arreglo1[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < arreglo2.length; i++){
            int number = r.nextInt(10);
            arreglo2[i] = number;
            System.out.println(arreglo2[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < arreglo1.length; i++ ){
            for (int j = 0; j < arreglo2.length; j++){
                arreglo3[i] += arreglo1[i] * arreglo2[j];
            }
            System.out.println("Los resultados son [" + i + "]" + arreglo3[i]);
        }
            
        
    }
    
}
