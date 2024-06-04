public class Triangulo extends Figura{
    double base;
    double altura;
public Triangulo(String nombre, double base, double altura){
    super(nombre, base);
    this.base = base;
    this.altura = altura;
}
public Triangulo(){
    super();
    System.out.println("Se creo un triangulo");
}
    public void area(){
        double area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
