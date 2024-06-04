package ejemplointerfaces;
public class Comparaciones implements Relaciones {
int numero1;
int numero2;
public Comparaciones(int numero1, int numero2) {
this.numero1 = numero1;
this.numero2 = numero2;
}
//Implementación del método abstracto de la interface
public boolean esMayorQue( Relaciones a) {
if ((numero1 ) <= (numero2)) {
return false;
}
return true;
}
//Implementación del método abstracto de la interface
public boolean esMenorQue(Relaciones a) {
if ((numero1 ) >= (numero2)) {
return false;
}
return true;
}
//Implementación del método abstracto de la interface
public boolean esIgualQue(Relaciones a) {
if (numero1 != numero2) {
return false;
}
return true;
}

}