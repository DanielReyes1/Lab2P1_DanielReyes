
package lab2_danielreyes;

import java.util.Scanner;

public class Lab2P1_DanielReyes {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1- MCD");
            System.out.println("2- Sumatoria");
            System.out.println("3- Supermercado");
            System.out.println("4- Salir del sistema");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
            
            if (opcion == 1){
                int a, b;
                
                System.out.print("Ingrese A: ");
                a = leer.nextInt();
                System.out.print("Ingrese B: ");
                b = leer.nextInt();
                if (a > 0 && b > 0){
                System.out.print( "El MCD de "+ a +" y "+ b +" es: ");
                    while (a != b){
               
                if ( a > b ){
                      a = a - b;        
                }// fin if mayor/menor
                else {
                    b = b - a;
                }// fin else mayor/menor
                        
                        
                    }// fin while y resutlado
                    System.out.println(" "+ a);
                   
                }// fin if de numeros positivos
                else 
                    System.out.println("Los numeros ingresados deben ser positivos");
                
            }// fin de opcion 1
            else if (opcion == 2){
                int base;
                System.out.println("Ingrese un entero positivo: ");
                base = leer.nextInt();
                if (base > 0 ){
                double acum = 0, cont = 1, result;
                while (cont <= base){
                    result = Math.pow(cont / (cont + 1), cont); 
                    acum += result;
                    cont++;
                }//fin while
                System.out.println("El resultado es: "+ acum);
                }// fin if base
                else{
                System.out.println("Debe de ingresar un numero entero positivo");
                }
                
            }// fin opcion 2
            else if (opcion == 3){
                int tipo, cant;
                double precio, desc, total = 0;
                System.out.println("Ingrese el tipo de cliente[0, 1, 2]: ");
                tipo = leer.nextInt();
                System.out.println("Ingrese el precio de la unidad del producto: ");
                precio = leer.nextDouble();
                System.out.println("Ingrese la cantidad del producto: ");
                cant = leer.nextInt();
                
                if (tipo == 0){
                    if (cant >= 10 && cant <= 19){
                        cant = cant - 2;
                    }// fin if cantidad
                    else if (cant > 20 ) {
                        cant = cant - 5;
                    }// fin if cantidad 
                  total = cant * precio;
                  
                }// fin if tipo 0
                else if (tipo == 1){
                    if (cant >= 20 && cant<= 29){
                        cant = cant - 2;   
                    } // fin if cantidad
                    else if (cant > 30 ) {
                        cant = cant - 5;
                    }// fin if cantidad 
                    desc = cant * precio * 0.1;
                    total = cant * precio - desc;
                }// fin tipo 1
                else if (tipo == 2){
                    if (cant >= 30 && cant<= 39){
                        cant = cant - 2;   
                    } // fin if cantidad
                    else if (cant > 40 ) {
                        cant = cant - 5;
                    }// fin if cantidad 
                    desc = cant * precio * 0.3;
                    total = cant * precio - desc;
                    
                }//fin tipo 2
                
                System.out.println("El total a pagar es: "+ total);
                
            }// fin opcion 3
            
        }while (opcion != 4); // fin del do while
        
        System.out.print(" Saliendo del sistema");
    }// fin del main
    
}
