public class Circulo extends Figura{
    double radio;
    public Circulo(String nombre, double radio){
        super(nombre, radio);
        this.radio = radio;
        this.nombre = nombre;
    }
    public Circulo(){
        super();
        System.out.println("Se creo un circulo");
    }
    public void area(){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+area);
    }


}
