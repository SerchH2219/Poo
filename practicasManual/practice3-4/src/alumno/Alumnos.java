package alumno;
public class Alumnos {
String nombre, apellidopaterno, apellidomaterno, sexo, direccion;
int edad;
public void listarDatos(){
System.out.println("Datos del Alumno ");
System.out.println("Nombre: "+ nombre);
System.out.println("Apellido paterno: " + apellidopaterno);
System.out.println("Apellido Materno: "+ apellidomaterno);
System.out.println("Sexo: "+ sexo);
System.out.println("Dirección: "+ direccion);
System.out.println("Edad: "+ edad);
}
public void altaAlumnos(String nombre,String apellidopaterno,String apellidomaterno,
String sexo, String direccion, int edad) {
this.nombre=nombre;
this.apellidomaterno=apellidomaterno;
this.apellidopaterno=apellidopaterno;
this.sexo=sexo;
this.direccion=direccion;
this.edad=edad;
}
}