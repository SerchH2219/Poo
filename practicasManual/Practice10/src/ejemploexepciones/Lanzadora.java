package ejemploexepciones;
// Esta clase lanzará la excepción
public class Lanzadora {
void lanzaSiNegativo( int param ) throws Miexcepcion {
if ( param < 0 )
throw new Miexcepcion( "Numero negativo" );
}
}


