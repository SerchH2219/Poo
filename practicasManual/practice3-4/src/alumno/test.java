package alumno;
import java.util.Scanner;
public class test{
public static void main(String[] args) {
String nombre="", apellidopaterno="", apellidomaterno="", sexo="", direccion="";
int edad=0;
//creamos dos objetos de la clase Alumno
Alumnos A1= new Alumnos();
Alumnos A2= new Alumnos();
int na;
Scanner tec= new Scanner(System.in);
//Capturamos los datos de cada alumno
for(int x=1;x<=2;x++){
System.out.println("Nombre del Alumno: " +x);
nombre=tec.nextLine();
System.out.println("Apellido Paterno:");
apellidopaterno=tec.nextLine();
System.out.println("Apellido Materno:");
apellidomaterno=tec.nextLine();
System.out.println("Sexo: ");
sexo=tec.nextLine();
System.out.println("Dirección: ");
direccion=tec.nextLine();
System.out.println("Edad: ");
edad=tec.nextInt();
/*Mandamos llamar el método para asignar los valores
capturados a variables de instancia */ 
A1.altaAlumnos(nombre, apellidopaterno, apellidomaterno, sexo, direccion, edad);
// Llamamos al método para listar los datos del alumno
A1.listarDatos();
}
}
}