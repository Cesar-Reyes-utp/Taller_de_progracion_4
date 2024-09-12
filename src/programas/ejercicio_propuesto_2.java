
package programas;

import java.util.Scanner ;
public class ejercicio_propuesto_2 {
    public static void main(String[] args) {
        //declacion de variables
        String p = "porfavor ingresar un nuemero valido" ;
        int x ;
        Scanner lectura=new Scanner(System.in) ;
        //entrada de procesos
        System.out.print("Ingrese un numero del 1 al 10: ");
        x = lectura.nextInt();
        //proceso de datos 
        
        switch (x) {
            case 1: p= "I" ;break;
            case 2: p= "II" ;break;
            case 3: p= "III" ;break;
            case 4: p= "IV" ;break;
            case 5: p= "V" ;break;
            case 6: p= "VI" ;break;
            case 7: p= "VII" ;break;
            case 8: p= "VIII" ;break;
            case 9: p= "IX" ;break;
            case 10: p= "X" ;break;
        }
        //salida de datos
        System.out.println("Número=" + x);
        System.out.println("Romano='" + p + "'");
        
    }
}
