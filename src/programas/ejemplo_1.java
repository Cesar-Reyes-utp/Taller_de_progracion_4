
package programas;

import java.util.Scanner;
public class ejemplo_1 {

    public static void main(String[] args) {
        //declarar variables
        int opc;
        Double a,b,r;
        Scanner lectura=new Scanner(System.in);
        // entrada de datps
        System.out.print("Ingresar primer numero: ");
        a = lectura.nextDouble();
        System.out.print("Ingresar segundo numero: ");
        b = lectura.nextDouble();
        System.out.print("Ingresar la operacion(1=suma, 2=resta 3=multiplicaion, 4=divicion): ");
        opc = lectura.nextInt();
        //proceso de datos
        r=0.0 ;
        switch (opc) {
            case 1:r= a+b;break;
            case 2:r= a-b;break;
            case 3:r= a*b;break;
            case 4:r= a/b;break;
        }
        //salida de datos
        System.out.println("El Resultado es :"+r );
    }
    
}
