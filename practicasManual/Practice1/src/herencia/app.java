package herencia;
import java.util.Scanner;
public class app {
  public static void main(String[] args) {
    int opcion;
    Scanner tec = new Scanner(System.in);
    Triangulo objtriangulo = new Triangulo();
    Circulo objCirculo= new Circulo();
    Rectangulo objRectangulo = new Rectangulo();
    System.out.println("Menú de Opciones");
    System.out.println("1. Cálculo del área y dibujo de un Triángulo");
    System.out.println("2. Cálculo del área  y dibujo de un Circulo");
    System.out.println("3. Cáculo del área y dibujo de un Rectángulo");
    System.out.println("4. Salir");
    opcion=tec.nextInt();
    switch (opcion) {
        case 1:
        //Nombre de la figura 
        objtriangulo.nombre="Soy un Triángulo";
        //Solicitud de datos para cáculo del área del triángulo
        System.out.println("Dame la base del triángulo:");
        objtriangulo.base=tec.nextFloat();
        System.out.println("Dame la altura del triángulo:");
        objtriangulo.altura=tec.nextFloat();
        //Llamada al método para calcular el triangulo
        objtriangulo.Area();
        //Llamada al método para dibujar el triangulo
        objtriangulo.DibujarFigura();
        break;
            case 2:
        //Nombre de la figura 
        objCirculo.nombre="Soy un Círculo";
        //Solicitud de datos para cáculo del área del Círculo
        System.out.println("Dame el radió del Círculo:");
        objCirculo.radio=tec.nextFloat();
        //Llamada al método para calcular el Círculo
        objCirculo.Area();
        //Llamada al método para dibujar el Círculo
        objCirculo.DibujarFigura();    
        break;
        case 3:
            //Nombre de la figura
        objRectangulo.nombre= "Soy un Rectángulo";
        //Solicitud de datos para cálculo del érea del Rectángulo
        System.out.println("Dame la base del Rectángulo:");
        objRectangulo.base=tec.nextFloat();
        System.out.println("Dame la altura del Rectángulo:");
        objRectangulo.altura=tec.nextFloat();
        //Llamada al método para calcular el área del Rectángulo
        objRectangulo.Area();
        //Llamada al método para dibujar el Rectángulo
        objRectangulo.DibujarFigura();
        break;
        case 4: 
        System.exit(0);
        default:
        System.out.println("Ingrese alguna opcion valida (1-4)");
        
    }
tec.close();

  }
  
}
