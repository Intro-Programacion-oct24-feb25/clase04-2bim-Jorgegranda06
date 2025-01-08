/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;



/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int limite;
        int tabla;
        int opcion;
        String mensajeSuma;
        String mensajeSumaDos;
        System.out.printf("Ingrese el limite de la tabla:", args);
        limite = entrada.nextInt();
        
        System.out.printf("Ingrese la tabla que desea realizar:", args);
        tabla = entrada.nextInt();
        
        System.out.printf("Ingrese la operacion que desea realizar (1)suma,"
                + "(2)multiplicación:", args);
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                mensajeSuma= obtenerTablaSumar(limite, tabla);
                System.out.printf("%s\n", mensajeSuma);
                break;
            case 2:
                mensajeSumaDos = obtenerTablaMultiplicar(limite, tabla);
                System.out.printf("%s\n", mensajeSumaDos);
                break;
        }
        
       
       
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
