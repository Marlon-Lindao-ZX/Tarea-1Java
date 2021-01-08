/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short x = (short) (100*Math.random()+1);
        int n = 101;
        int i = 1;
        while (i < 6 && n != x ){
            System.out.print("Intento " + i + ": ");
            n = sc.nextInt();
            sc.nextLine();
            if (n == x)
                System.out.println("¡Felicidades, acertaste!");
            else if (n > x){
                System.out.println("Has fallado :c");
                System.out.println("El numero que escribiste es mayor que el premiado");
            }
            else if (n < x){
                System.out.println("Has fallado :c");
                System.out.println("El numero que escribiste es menor que el premiado");
            }
            
            System.out.println("Intentos restantes: " + (5 - i));
            i++;
        }
        sc.close();
    }
    
}
