
package programas;

import java.util.Scanner ;
public class ejercicio_propuesto_3 {
    public static void main(String[] args) {
        //declacion de variables
        String p = "porfavor ingresar un nuemero valido" ;
        int x ;
        Scanner lectura=new Scanner(System.in) ;
        //entrada de procesos
        System.out.print("Ingrese un numero del 1 al 6: ");
        x = lectura.nextInt();
        //proceso de datos 
        
        switch (x) {
            case 1: p= "One" ;break;
            case 2: p= "Two" ;break;
            case 3: p= "Three" ;break;
            case 4: p= "Four" ;break;
            case 5: p= "Five" ;break;
            case 6: p= "Six" ;break;
            
        }
        //salida de datos
        System.out.println("Número=" + x);
        System.out.println("Ingles='" + p + "'");
        
    }
}