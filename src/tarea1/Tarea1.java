package tarea1;

import java.util.Scanner;

public class Tarea1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la cantidad de m³ de agua que ha consumido por mes: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.print("Escriba el precio por cada m³: ");
        int precio = sc.nextInt();
        sc.nextLine();
        if (cantidad > 500){
            double precioTotal = (500*precio) + ((cantidad-500) * precio * 0.05);
            System.out.print("Precio a pagar: " + precioTotal);
            sc.close();
        } else{             
            double precioTotal = cantidad * precio;
            System.out.print("Precio a pagar: " + precioTotal);
            sc.close();
        }
            
        
    }
    
}