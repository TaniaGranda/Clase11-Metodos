package clase11;

import java.util.Scanner;

public class Metodos1 {
//Declaracion e inicializacion de variables estaticas o constantes    
static double iva=0.14;
static double iva1=0.02;
static double iva2=0.06;
static double iva3=0.08;


    public static void main(String[] args) {
        //Para llamar a los metodos
        Metodos1 mt = new Metodos1();
        double metodo1;
        metodo1=mt.iva(55, iva);//Llamamos al metodo iva con su codigo
        System.out.println("Calculo del iva: "+metodo1);
        double metodo2;
        metodo2 = mt.fact_tipo();//Llamamos al metodo fact_tipo con su codigo
        System.out.println("Facturacion: "+metodo2);
    }
    
//    public void mensaje(){
//        System.out.println(" Mensaje de la funcion mensaje ");
//    }
      
    public double iva(double subtotal, double iva){//METODO PARA CALCULAR EL IVA
        double total=subtotal*iva;
        return total;
    }
    
    public double fact_tipo(){//METODO PARA CALCULAR LA FACTURACION
        //Pedir los datos por consola
        Scanner entrada = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        double total=0, costo;
        int tipo; 
        //Pedimos que el usuario ingrese los datos
        System.out.println("Escoga el tipo: 1. Publica 2. Privada 3. Personalidad");
        tipo=entrada.nextInt();
        //Menu con if-else para que el usuario escoja el tipo de institucion
        if(tipo == 1){
            System.out.println("Ingrese el costo: ");
            costo = entrada.nextDouble();
            total = iva(costo, iva1);//Llamamos al metodo iva, para calcular el valor a pagar
        }else{
            if(tipo==2){
                System.out.println("Ingrese el costo: ");
                costo = entrada.nextDouble();
                total = iva(costo, iva2);
            }else{
                if(tipo==3){
                    System.out.println("Ingrese el costo: ");
                    costo = entrada.nextDouble();
                    total=iva(costo, iva3);
                }
            }
        }
        return total;//Retornamos el total a pagar
    } 
}
