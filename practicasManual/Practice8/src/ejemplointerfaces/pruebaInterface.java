package ejemplointerfaces;

import java.util.Scanner;

public class pruebaInterface {
    public static void main(String[] args) {
        //Solicitar 2 números y muestra cúal es mayor, menor y iguales.
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el número uno");
        numero1=sc.nextInt();
        System.out.println("Teclea el número dos");
        numero2=sc.nextInt();
        //Creamos un objeto de la clase comparaciones
        Comparaciones f1 = new Comparaciones(numero1, numero2);
        //Hacemos uso de los tre métodos implementados en la case
        if (f1.esMayorQue(f1)){
            System.out.println(f1.numero1 + " > " + f1.numero2);
        } else if (f1.esMenorQue(f1)){
            System.out.println(f1.numero1+" < "+ f1.numero2);
        } else
        if(f1.esIgualQue(f1)){
            System.out.println(f1.numero1 + " = "+f1.numero2);

        }
    }
}
