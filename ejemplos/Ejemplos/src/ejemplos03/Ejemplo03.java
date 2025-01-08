/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
/* generar una solución que permita sumar dos numeros a traves de un metodo los 
numeros deben ser ingresados por teclado en el meteodo main el metodo que genera
la suma debe verificar que los dos numeros sean positivos para realizar la 
operacion caso contrario la suma es 0
*/
package ejemplos03;


import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int valor1;
        int valor2;
        
        System.out.println("Ingrese un numero para el valor1");
        valor1= entrada.nextInt();
        System.out.println("Ingrese un numero para el valor2");
        valor2= entrada.nextInt();
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        if (a>0 && b>0){
            suma= a+b;
        }else{
            suma=0;
        }
        
        return suma;
        // return a + b;
    }
    
    
}
