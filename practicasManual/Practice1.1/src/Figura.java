public abstract class Figura {
String nombre;
double area;

public Figura(String nombre, double area) {
this.nombre = nombre;
this.area = area;
    }

public Figura() {

 System.out.println("Se creo la figura");

}
public void area(){
System.out.println("El nombre de la figura es: "+nombre+ "El area de la figura es: \n"+nombre);

}
public void Dibujarfigura(){
System.out.println("Dibujando figura: "+nombre);
}
}

