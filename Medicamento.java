/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author Andres Gil and Diego Leon
 */
public final class Medicamento {
    Scanner datos = new Scanner(System.in);
    
    // ATRIBUTOS DE LOS MEDICAMENTOS   
    //////////////////////////////////
    
    private int codigo;
    private String name;
    private int costo;
    private double precio;
    private int ventas;
    private int stock;
    private String caducidad;
    private int lote;
    private int vigencia;
    private int fecha_actual = 0;
    //////////////////////////////////
    
    
    
    
    
    
    // VALORES DEFAULT DE LOS ATRIBUTOS
    //////////////////////////////////
    public Medicamento(){
        codigo = 1;
        name = "";
        costo = 1;
        precio = 1;
        ventas = 1;
        stock = 1;
        caducidad = "102023";
        lote = 1;
        vigencia = 1;
    }
    ////////////////////////
    
    public Medicamento(int codigo, String name, int costo, int ventas, int stock, String caducidad, int lote, int vigencia){
        
        this.codigo = codigo;
        this.name = name;
        this.costo = costo;
        
        double price;
  //      price = precioApagar(costo);
    //    this.precio = price;
        
        this.ventas = ventas;
        this.stock = stock;
        this.caducidad = caducidad;
        this.lote = lote;
        this.vigencia = vigencia;
    }
    
    
    // GETTERS AND SETTERS
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getCosto(){
        return costo;
    }
    public void setCosto(int costo){
        this.costo = costo;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public int getVentas(){
        return ventas;
    }
    public void setVentas(int ventas){
        this.ventas = ventas;
    }
    
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public String getCaducidad(){
        return caducidad;
    }
    public void setCaducidad(String caducidad){
        this.caducidad = caducidad;
    }
    
    public int getLote(){
        return lote;
    }
    public void setLote(int lote){
        this.lote = lote;
    }
    
    public int getVigencia(){
        return vigencia;
    }
    public void setVigencia(int vigencia){
        this.vigencia = vigencia;
    }
    
    public int getFecha_actual(){
        return fecha_actual;
    }
    public void setFecha_actual(int fecha_actual){
        this.fecha_actual = fecha_actual;
    }
   ////////////////////////////////////////////////
   
    

    
    
    ///METODOS
    
        public void leerDatos(){
        int a = 0, b = 0, num;
        
            while(a != 2){ 
        System.out.println("Ingrese la fecha de caducidad");
        System.out.println("El numero debe de contener 6 digitos, en donde los dos primeros son el mes y los ultimos 4 el ano");
        caducidad = datos.nextLine();
        
        
        if (validar(caducidad) == true){
            System.out.println("Si son numeros!!");
            a = 1;
        } else {
            System.out.println("No son numeros");
        }
        
        if(a == 1){
            num = Integer.parseInt(caducidad);
            b = count_digits(num);   
                if(b == 6) {
                    a=2;
                } else {
                    System.out.println("La fecha de expiracion debe contener 6 digitos!");
                    System.out.println();
                }
        }
        
        
    }
            
        System.out.println("Ingrese el codigo");
        codigo = datos.nextInt();

        System.out.println("Ingrese el nombre");
        name = datos.nextLine();
        
        System.out.println("Ingrese el costo");
        costo = datos.nextInt();
        
        System.out.println("Ingrese el ventas");
        ventas = datos.nextInt();
        
        System.out.println("Ingrese el stock");
        stock = datos.nextInt(); 
        
        
        
  /*  while(a){ 
        System.out.println("Ingrese la fecha de caducidad");
        System.out.println("El numero debe de contener 6 digitos, en donde los dos primeros son el mes y los ultimos 4 el ano");
        caducidad = datos.nextLine();
        
        
        if (validar(caducidad) == true){
            System.out.println("Si son numeros!!");
        } else {
            System.out.println("No son numeros");
        }
    }
        */
        
        
        
        System.out.println("Ingrese el lote");
        lote = datos.nextInt();
        
        System.out.println("Ingrese el vigencia");
        vigencia = datos.nextInt();   
    }
        
        
     
    
    public double precioAPagar(int costo){
        double porcentaje, pago;
        porcentaje = 0.1;
        pago = costo +(costo * porcentaje);
        return pago;
    }
    
    
     ///// VERIFICAR SI LA FECHA DE VENCIMIENTO ES MENOR O MAYOR QUE LA FECHA ACTUAL
        public boolean dateChecker(){
            int mes = 0, ano = 0, mes_fecha = 0, ano_fecha = 0, num;
            int boton = 0, boton1 = 0;
            
            num = Integer.parseInt(caducidad);
            
            mes = fecha_actual / 10000;
            ano = fecha_actual % 10000;
            
            mes_fecha = num / 10000;
            ano_fecha = num % 10000;
            
            if(mes >= mes_fecha){
                boton = 1;
            } else if(ano >= ano_fecha){
                boton1 = 1;
            }
            
           if (boton == 1 && boton1 == 1){
               return true;
           } else {
               return false;
           }
        }
    
    
        /// DETERMINAR SI ESTA VENCIDO
        public void determinarVencido(int fecha_actual){
        int expiracion, fecha = 112011, ano = 0, mes = 0, mes_fecha = 0, ano_fecha = 0;
      //  expiracion = getCaducidad();
      expiracion = 112011;
        
     
        mes = expiracion / 10000;
        ano = expiracion % 10000;
        
        mes_fecha = fecha / 10000;
        ano_fecha = fecha % 10000;
 
        if (mes_fecha > mes & ano_fecha >= ano){
            System.out.println("Esta vencido");
        } else if(fecha == expiracion) { 
            System.out.print("Expira hoy!");
            } else {
            System.out.println("No esta vencido");
        }
     }
        //////////////////
        
        public void retirarLote(){
        int grupo, group;
       
        group = getLote();
        System.out.println("Indique el lote que desea retirar");
        grupo = datos.nextInt();  
        
        if (group == grupo){
            setVigencia(2);
            System.out.println("El lote ha sido retirado");

        }
    }
    
    public void colocarOferta(int fecha){
        int expira = 0;
        double x;
        
    //    expira = getCaducidad();
        
        if (expira - fecha <= 3){
            x = getPrecio();
            x = x*0.7;
            setPrecio(x);
        }
    }
    
    public void reponerInventario(){
        int inventario;
       
        inventario = getStock();   
        
        if (inventario < 5){
            System.out.println("Las unidades en existencias menos de 5");
        }
        else{
            System.out.println("Las unidades en existencia son: "+inventario);
        }
    }
    
    public void mostrarInformacion(){
        int code,cost, sells, inventario, tanda, validity, expiracion, fechadehoy;
        double price;
        String nombre;
        
        code = getCodigo();
        nombre = getName();
        cost = getCosto();
        price = getPrecio();
        sells = getVentas();
        inventario = getStock();
       // expiracion = getCaducidad();
        tanda = getLote();
        validity = getVigencia();
        fechadehoy = getFecha_actual();
        
        System.out.println("Datos del medicamento ");
        System.out.println("");
        System.out.println("El Codigo es: "+code);
        System.out.println("El Nombre es: "+nombre);
        System.out.println("El Costo es: "+cost);
        System.out.println("El Precio es: "+price);
        System.out.println("El numero de Ventas es: "+sells);
        System.out.println("Las Unidades en Stock son: "+inventario);
  //      System.out.println("La fecha de Caducidad es: "+expiracion);
        System.out.println("El lote al que pertenece es: "+tanda);
        System.out.println("El estado de Vigencia es: "+validity);
        System.out.println("La fecha de hoy es: "+fechadehoy);
    }

   /* public void crearMedicamento() {
        String nombre;
                
        System.out.println();
        System.out.println("*****************");
        System.out.println("Indica el nombre del medicamento que deseas agregar.");
        nombre = datos.nextLine();
        
        Medicamento  = new Medicamento();
    } */

    public void fecha(){
        System.out.println("**********************");
        System.out.println("Ingresa la fecha");
        System.out.println("**********************");
        fecha_actual = datos.nextInt();
        System.out.println("La fecha es: " + fecha_actual);
    }
    
    ////////////////////////////////////
    
    ///////////VALIDADORES///////////////////
    /////////////////////////////////////////
    
    
    /////////// COMPROBAR QUE SON ENTEROS
    public boolean validar(String cadena_x){
    //this.cadena = cadena_x;
        int num;
        try {
             num = Integer.parseInt(cadena_x);
             return true;
            } catch(Exception e){
                return false;
            }
    }
    
  //////////// CONTAR DIGITOS
    public int count_digits(int x) {
        return (int) Math.floor(Math.log10(x)+1);
    }
 }

     

