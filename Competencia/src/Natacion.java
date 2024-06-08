public class Natacion extends Individual {
    //atributos
    String juezArbitro;
    String juezArbitroSalida;
    String juezArbitroLlegada[] = new String[3];
    String juezAuxiliares[]= new String[2];
    String cronometradore[]= new String[2];
//Constructor sin parametros 
    public Natacion() {
    }

    public Natacion(String observaciones, String juezArbitro, String juezArbitroSalida, String[] juezArbitroLlegada, String[] juezAuxiliares, String[] cronometradore, String prueba, String disciplina, String rama, String categoria, String sede, String etapa, String fecha, String hora, String Ganador, String segundoLugar, String tercerLugar, String tiempoGanador, String tiempo2doLugar, String tiempo3erLugar, String recordMundial, String recordPanamericano, String Observaciones, String hits) {
        super(observaciones, prueba, disciplina, rama, categoria, sede, etapa, fecha, hora, Ganador, segundoLugar, tercerLugar, tiempoGanador, tiempo2doLugar, tiempo3erLugar, recordMundial, recordPanamericano, Observaciones, hits);
        this.juezArbitro = juezArbitro;
        this.juezArbitroSalida = juezArbitroSalida;
        this.juezArbitroLlegada = juezArbitroLlegada;
        this.juezAuxiliares = juezAuxiliares;
        this.cronometradore = cronometradore;

    }
    // seters y getters

    public void setJuezArbitro(String juezArbitro) {
        this.juezArbitro = juezArbitro;
    }

    public String getJuezArbitro() {
        return juezArbitro;
    }

    public void setJuezArbitroSalida(String juezArbitroSalida) {
        this.juezArbitroSalida = juezArbitroSalida;
    }

    public String getJuezArbitroSalida() {
        return juezArbitroSalida;
    }

    public void setJuezArbitroLlegada(String[] juezArbitroLlegada) {
        this.juezArbitroLlegada = juezArbitroLlegada;
    }

    public String[] getJuezArbitroLlegada() {
        return juezArbitroLlegada;
    }

    public void setJuezAuxiliares(String[] juezAuxiliares) {
        this.juezAuxiliares = juezAuxiliares;
    }

    public String[] getJuezAuxiliares() {
        return juezAuxiliares;
    }

    public void setCronometradore(String[] cronometradore) {
        this.cronometradore = cronometradore;
    }

    public String[] getCronometradore() {
        return cronometradore;

    }



}

    

