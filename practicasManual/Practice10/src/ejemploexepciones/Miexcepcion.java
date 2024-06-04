package ejemploexepciones;
public class Miexcepcion extends Exception {
// Creo una excepción personalizada
Miexcepcion(){
super(); // constructor por defecto de Exception
}
Miexcepcion( String cadena ){
super( cadena ); // constructor con parametro de Exception
}
}
