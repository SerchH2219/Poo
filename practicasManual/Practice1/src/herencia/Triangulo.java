package herencia;
public class Triangulo extends Figura{
    double base;
    double altura;
    public void Area(){
System.out.println("Metodo para calcular área del Triangulo");    
area=base*altura/2;
System.out.println("El área del Triángulo es "+area);
}public void DibujarFigura(){
    System.out.println("Método para dibujar un Triángulo");
}
}