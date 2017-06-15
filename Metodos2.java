package clase11;

import java.util.Scanner;

public class Metodos2 {

    public static void main(String[] args) {
        //Para poder llamar a los metodos que estan fuera del main
        Metodos2 mt = new Metodos2();
        int metodo1;
        metodo1 = mt.ciclo(); //Llamamos al metodo 1 que contiene su respectivo codigo.
        System.out.println("El Ciclo cuesta: $"+metodo1);
        double metodo2;
        metodo2 = mt.costo_materias(metodo1);//Llamamos al metodo 2 que contiene su respectivo codigo.
        System.out.println("Subtotal: $"+metodo2);
        double metodo3;
        metodo3 = mt.becas(metodo2);//Llamamos al metodo 3 que contiene su respectivo codigo.
        System.out.println("Valor a pagar matricula: $"+metodo3);
        
    }
    //METODO 1: PARA PEDIR AL USUARIO QUE ESCOJA EL CICLO AL QUE SE VA A MATRICULAR
    public int ciclo(){
        //Pedir  los tados por consola
        Scanner entrada = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        int valor=0;
        int ciclo=0;
        //Menu if - else para que escoja el ciclo al que va
        System.out.println("Escoja el ciclo: ");
        System.out.println("1. Ciclo1, 2. Ciclo3, 3. Ciclo5, 4. Ciclo7 5. Ciclo9");
        //Pedimos los datos
        ciclo=entrada.nextInt();
        //Condicion 
        if (ciclo==1){
            valor=700;
        }else{
            if(ciclo==2){
                valor=720;
            }else{
                if(ciclo==3){
                    valor=740;
                }else{
                    if(ciclo==4){
                        valor=760;
                    }else{
                        if(ciclo==5){
                            valor=780;
                        }
                    }
                }
            }
        }
        return valor; //retorna el valor
    }
    //METODO 2 PARA CALCULAR EL COSTO DE LA MATRICULA, SEGUN EL COSTO DE CADA CREDITO
    public double costo_materias(int metodo1){
        //Para pedir los datos por consola
        Scanner entrada2 = new Scanner(System.in);
        //Pedimos que ingrese los datos al usuario
        System.out.println("Ingrese cuantas materias troncales tiene: ");
        int mat_t = entrada2.nextInt();
        System.out.println("Ingrese cuantas materias2 tiene: ");
        int mat_2 = entrada2.nextInt();
        //Hacemos las operaciones necesarias para calcular el costo o subtotal de la matricula
        double credito=mat_t*4;
        double total1= credito*35;
        double credito1=mat_2*3;
        double total2= credito1*35;        
        double subtotal = total1+total2+metodo1;//llamamos al METODO UNO para retornar el valor que contiene
        return subtotal;//Retorna el subtotal
    }
    //METODO 3: CALCULAMOS EL TOTAL A PAGAR SI TIENE ALGUNA BECA 
    public double becas(double metodo2){
        //Para pedir los datos por consola
        Scanner entrada3 = new Scanner(System.in);
        //Inicializacion y declaracion de variables
        double valor_pagar=0, costo;
        //Pedir al usuario que ingrese los datos
        System.out.println("Escoja: 1. Meritos 2. Familiar 3. Ninguno");
        int b = entrada3.nextInt();
        //Menu con if-else para que elija que tipo de beca tiene o es beneficiario
        if(b==1){
            costo=metodo2*0.15;
            valor_pagar=metodo2-costo;//llamamo al METODOS DOS, con contiene el valor que necesitamos para la operacion
        }else{
            if(b==2){
                costo=metodo2*0.08;
                valor_pagar=metodo2-costo;
            }else{
                if(b==3){
                   valor_pagar=metodo2;
                }
                        
            }
        }
        return valor_pagar;//Retorna el valor a pagar
    }
}
