/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author Alfredo Venzor
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
       int valor = 5;
        System.out.println("Factorial de 5=" + calcularFactorial(valor));
      
    }
    public static int calcularFactorial(int valor){
    int guardar = 1;
        for (int i = 1; i <= valor; i++) {
           guardar*= i; 
        }
        return guardar;
    }
    
}
