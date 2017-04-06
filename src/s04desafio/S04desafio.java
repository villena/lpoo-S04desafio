/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04desafio;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class S04desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Bienvenido a la Aplicacion Total Factura");
       System.out.println();
       Scanner sc=new Scanner(System.in);
       System.out.print("Ingrese producto :   ");
       String producto1 =sc.next();
       System.out.print("Ingrese cantidad  :   ");
       int cantidad1 =sc.nextInt();
       System.out.print("Ingrese precio  :   ");
       int precio1 =sc.nextInt();
       System.out.print("Ingrese producto :   ");
       String producto2 =sc.next();
       System.out.print("Ingrese cantidad  :   ");
       int cantidad2 =sc.nextInt();
       System.out.print("Ingrese precio  :   ");
       int precio2 =sc.nextInt();
       System.out.print("Ingrese producto :   ");
       String producto3 =sc.next();
       System.out.print("Ingrese cantidad  :   ");
       int cantidad3 =sc.nextInt();
       System.out.print("Ingrese precio  :   ");
       int precio3 =sc.nextInt();
       double subtotal1 =cantidad1*precio1;
       double subtotal2 =cantidad2*precio2;
       double subtotal3 =cantidad3*precio3;
       double subtotal =subtotal1+subtotal2+subtotal3;
       double impuesto =subtotal *0.18;
       double total =subtotal +impuesto;
       String mensaje ="Total Factura:    "+total +"\n";System.out.println(mensaje);
    }
    
}
