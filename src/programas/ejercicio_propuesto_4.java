
package programas;

import java.util.Scanner ;
public class ejercicio_propuesto_4 {
    public static void main(String[] args) {
        //declacion de variables
        String p = "porfavor ingresar un nuemero valido" ;
        int x ;
        Scanner lectura=new Scanner(System.in) ;
        //entrada de procesos
        System.out.print("Ingrese un numero (1,2,3,4,6,12): ");
        x = lectura.nextInt();
        //proceso de datos 
        
        switch (x) {
            case 1: p= "Mensual" ;break;
            case 2: p= "Bimestral" ;break;
            case 3: p= "Trimestral" ;break;
            case 4: p= "Suatrimestral" ;break;
            case 6: p= "Semestral" ;break;
            case 12: p= "Anual" ;break;
        }
        //salida de datos
        System.out.println("Número=" + x);
        System.out.println("Periodo='" + p + "'");
        
    }
}