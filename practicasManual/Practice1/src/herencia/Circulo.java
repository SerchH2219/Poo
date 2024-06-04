package herencia;
public class Circulo extends Figura{
    float radio;
    public void Area(){
        System.out.println("Método para calcular área de un circulo");
        area=Math.PI*Math.pow(radio,2);
        System.out.println("El area del Circulo es"+ area);
        
    }
    public void DibujarFigura(){
        System.out.println("Método para dibujar un Circulo");
    }
    }

