package herencia;
public class Figura {
    String nombre;
    double area;
    
    public void Area(){
        System.out.println("El area de la figura "+nombre+" es: "+area);
    }
    public void DibujarFigura(){
        System.out.println("Dibujando figura "+nombre);
    }
}