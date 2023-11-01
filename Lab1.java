/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author andresgbe
 */
public class Lab1 {
    public static void main(String[] args) {
        int op = 0, op2 = 0 , op3 = 0, op4 = 0;
        
        Scanner datos = new Scanner(System.in);

        int fecha = 0;
        fecha = 1010;
        
        Medicamento obj1 = new Medicamento();
        
     /*   String cadena_x = datos.nextLine();
        boolean v = obj1.validar(cadena_x);
        if(v != false){
            System.out.println("Correcto es num decimal");
        } else {
            System.out.println("Error");
        }
        
        */
        
        
        
        
        Medicamento farmaco = new Medicamento();
        
    /*    int test = 0, number = 123;
        
        test = number % 10;
        
        System.out.print("El numero es " + test); */
 
        
     //   Medicamento farmaco = new Medicamento(codigo, name,  costo, ventas, stock, caducidad, lote, vigencia);
     
     
    /* int x = 50234;
     int y = 0;
     
     y = farmaco.count_digits(x);
     
     
     System.out.println("el valor de y es "+y);*/
    
     
     farmaco.leerDatos();
     
    // while(op4 != 2){ CICLO INFINITO
         System.out.println("************************************************************");
         System.out.println("Bienvenido, para continuar, por favor: ");
         System.out.println();
         System.out.println("Ingrese la fecha de hoy");
         System.out.println("La fecha debera estar en un formato de 6 digitos. Donde:");
         System.out.println("Los dos primeros representan el mes y los ultimos 4 el ano");
         System.out.println("*************************************************************");
   //  } 
         farmaco.fecha();
     
    
     
     while(op2 != 2){
         System.out.println("*****************************************************************");
         System.out.println("Deseas agregar manualmente los valores del medicamento?");
         System.out.println();
         System.out.println("1. Si");
         System.out.println("2. No");
         System.out.println("***************************************************************** ");
         System.out.println();
         op2 = datos.nextInt();
       switch(op2){
         case 1: 
                 farmaco.leerDatos();
                 op2 = 2;
                 break;
                 
         
        }
     }
     
      while(op != 6) {
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("1. Mostrar Informacion del producto");
        System.out.println("2. Determinar si el producto esta vencido");
        System.out.println("3. Retirar lote");
        System.out.println("4. Colocar Oferta");
        System.out.println("5. Reponer Inventario");
        System.out.println("6. Salir");
        System.out.println("*****************************");
        System.out.println("Ingrese la opcion deseada");
        op = datos.nextInt();
     
         switch(op) {
                case 1 : 
                    while(op3 != 2){
                    System.out.println("*****************************");
                    System.out.println("Deseas ver la informacion de algun articulo en particular?"); //HACERLO FUNCION
                    
                    
                    farmaco.mostrarInformacion();
                   
                    }
                    break;
                

                case 2:
               //     System.out.println("Ingrese la fecha de hoy");
               //     int fecha = datos.nextInt();
                    
                    farmaco.determinarVencido(fecha);
                    break;
                    
                    
                
                
                case 3:
                    farmaco.retirarLote();
                    break;
                    
                
                case 4:
                    System.out.println("Ingrese la fecha de hoy");
                    System.out.println("Escribiendo los ultimos dos digitos del año seguidos del numero del mes siendo un total de 4 digitos");
                    System.out.println("Ejemplo: 2301 refiriendose a Enero del 2023");
                    int dia = datos.nextInt();
                    
                    farmaco.colocarOferta(dia);
                    break;
                   
                
               
                case 5: 
                    farmaco.reponerInventario();
                    break;
                    
                
                default: 
                    System.out.println("");
                    System.out.println("Selecciona una opcion valida");
                    System.out.println("");
                
            }
        }
        
    }
    
   
    
    
     }
