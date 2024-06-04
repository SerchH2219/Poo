package musica;

public class TestMusica {
    public static void main(String[] args) {
        //Objeto miGuitarra de tipo Instrumento
        InstrumentosMusicales miGuitarra = new Guitarra();
        System.out.println("Instrumento: "+miGuitarra.tipodeinstrumento);
        miGuitarra.tocarInstrumento();
        System.out.println();
        //Objeto miSaxofon de tipo Instrumento
        InstrumentosMusicales miPiano= new Piano();
        System.out.println("Instrumento: "+miPiano.tipodeinstrumento);
        miPiano.tocarInstrumento();
        System.out.println();
        //Objeto miViolin de tipo Instrumento
        InstrumentosMusicales miViolin = new Violin();
        System.out.println("Instrumento : " + miViolin.tipodeinstrumento);
        miViolin.tocarInstrumento();
    }
    
}
