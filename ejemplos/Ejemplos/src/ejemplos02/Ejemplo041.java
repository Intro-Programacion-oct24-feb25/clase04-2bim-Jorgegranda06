/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {
    /* En el main se se dan 3 arreglos, tambien se usa un ciclo repititivo for 
    para dar valor al arreglo 3 que no tiene valores segun su posicion y de 
    acuerdo a lo que la funcion dada retorne, luego se llama a un solo 
    procedimiento con los 3 arreglos luego hay un procedimiento para presentar 
    los valores de los arreglos en pantalla mediante un ciclo for y con una 
    cadena acumuladora agrupamos todos los datos y los imprimimos, y luego 
    hay una funcion que retorna la multipiclacion entre el arreglo 1 y arreglo 2.
    */
    public static void main(String[] args) {
        // 
        
        int [][] arreglo1 = {{1,2,3}, {3,2,4}, {2,6,2}};
        int [][] arreglo2 = {{1,2,3}, {2,2,2}, {3,1,2}};
        int [][] arreglo3 = new int[3][3];
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
            }
        }
        
        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
    }
    
    public static void obtenerReporte(int[][] arreglo1){
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    
    public static int obtenerMultiplicacion(int a, int b){
        int operacion;
        operacion = a * b;
        return operacion;
        
    }
    
    
}
