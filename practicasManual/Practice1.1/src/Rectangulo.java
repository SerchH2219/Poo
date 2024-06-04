public class Rectangulo  extends Figura{
    double base;
    double altura;
    public Rectangulo(String nombre, double base, double altura){
        super(nombre, altura);
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){
        super();
    System.out.println("Se creo un rectangulo");
    }
    public void area(){
        double area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
    }
  
}
