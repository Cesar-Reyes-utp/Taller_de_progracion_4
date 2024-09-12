
package programas;

import java.util.Scanner ;
public class ejercicio_propuesto_1 {
    public static void main(String[] args) {
        //declarar variablesa
        String p = "porfavor ingresar un nuemero valido" ;
        int x ;
        Scanner lectura=new Scanner(System.in) ;
        //entrada de procesos
        System.out.print("Ingrese un numero del 1 al 5: ");
        x = lectura.nextInt();
        //proceso de datos 
        
        switch (x) {
            case 1: p= "uno" ;break;
            case 2: p= "dos" ;break;
            case 3: p= "tres" ;break;
            case 4: p= "cuatro" ;break;
            case 5: p= "cinco" ;break;
        }
        //salida de datos
        System.out.println("Número=" + x);
        System.out.println("Palabra='" + p + "'");
        
    }
}
