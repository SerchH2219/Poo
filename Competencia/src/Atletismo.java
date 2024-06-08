public class Atletismo extends Individual {
    //atributos
    String Oficialmayor;
    String juecesSalida[] = new String[2];
    String juecesNado[] = new String[3];
    String inspectoresVueltas[] = new String[2];
//Constructor vacio
    public Atletismo() {

    }
//Constructor con parametros
    public Atletismo(String observaciones, String prueba, String disciplina, String rama, String categoria, String sede, String etapa, String fecha,
            String hora, String Ganador,
            String segundoLugar, String tercerLugar, String tiempoGanador,
            String tiempo2doLugar, String tiempo3erLugar, String recordMundial,
            String recordPanamericano, String Observaciones, String hits, String Oficialmayor, String juecesSalida[],
            String juecesNado[], String inspectoresVueltas[]) {
        super(observaciones, prueba, disciplina, rama, categoria, sede, etapa, fecha, hora, Ganador, segundoLugar, tercerLugar, tiempoGanador,
                tiempo2doLugar, tiempo3erLugar, recordMundial, recordPanamericano, Observaciones, hits);
        this.Oficialmayor = Oficialmayor;
        this.juecesSalida = juecesSalida;
        this.juecesNado = juecesNado;
        this.inspectoresVueltas = inspectoresVueltas;
            }
    // Getters y Setters
    public void setOficialmayor(String Oficialmayor) {
        this.Oficialmayor = Oficialmayor;
    }

    public String getOficialmayor() {
        return Oficialmayor;
    }

    public void setJuecesSalida(String juecesSalida[]) {
        this.juecesSalida = juecesSalida;
    }

    public String[] getJuecesSalida() {
        return juecesSalida;
    }

    public void setJuecesNado(String juecesNado[]) {
        this.juecesNado = juecesNado;
    }

    public String[] getJuecesNado() {
        return juecesNado;
    }

    public void setInspectoresVueltas(String inspectoresVueltas[]) {
        this.inspectoresVueltas = inspectoresVueltas;
    }

    public String[] getInspectoresVueltas() {
        return inspectoresVueltas;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }


    }

    

    




