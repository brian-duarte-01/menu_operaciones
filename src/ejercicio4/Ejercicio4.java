// tarea 7 ejercicio 4 del curso de JAVA
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        int n1;
        int n2;
        int suma;
        int resta;
        int multiplicacion;
        System.out.println("1.- Suma\n2.- Resta\n3.- Multiplicacion");
        System.out.println("ingrese una opcion");
        op=in.nextInt();
        switch(op){
            case 1:System.out.println("Suma\n");
                   System.out.println("Ingrese el primer numero");
                   n1=in.nextInt();
                   System.out.println("ingrese el segundo numero");
                   n2=in.nextInt();
                   suma=n1+n2;
                   System.out.println("la suma de los dos numeros es: "+suma);
                   break;
                   
            case 2:System.out.println("Resta\n");
                   System.out.println("ingrese el primer numero");
                   n1=in.nextInt();
                   System.out.println("ingrese el segundo numero");
                   n2=in.nextInt();
                   resta=n1-n2;
                   System.out.println("la resta de los dos numeros es: "+resta);
                   break;
                   
            case 3:System.out.println("Multiplicacion");  
                   System.out.println("ingrese el primer numero");
                   n1=in.nextInt();
                   System.out.println("ingrese el segundo numero");
                   n2=in.nextInt();
                   multiplicacion=n1*n2;
                   System.out.println("la multiplicacion de los dos numeros es: "+multiplicacion);
                   break;
                   
                   
            default:System.out.println("opcion Incorrecta");      
    }
    }
    
}
