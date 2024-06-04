package herencia;
public class Rectangulo extends Figura{
    double lado;
    float base, altura;
    public void Area(){
        System.out.println("Método para calcular área de un Rectangulo es"); 
        area=base * altura;
        System.out.println("El área del Rectángulo es "+ area);   
    }
    public void DibujarFigura(){
        System.out.println("Método para dibujar un Rectangulo");
    }
    }
    

