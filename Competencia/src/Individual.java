public class Individual extends Competencia {
//atributos
protected String prueba;
   protected String tiempoGanador;
   protected String tiempo2doLugar;
   protected String tiempo3erLugar;
   protected String recordMundial;
   protected String recordPanamericano;
   protected String hits;

   // Constructor sin parametros
   public Individual() {
    
   }

   // Constructor con parametros
   public Individual(String observaciones, String prueba, String disciplina, String rama, String categoria, String sede, String etapa, String fecha,
           String hora, String Ganador,
           String segundoLugar, String tercerLugar, String tiempoGanador,
           String tiempo2doLugar, String tiempo3erLugar, String recordMundial,
           String recordPanamericano, String Observaciones, String hits) {
      super(observaciones, disciplina, rama, categoria, sede, etapa, fecha, hora, Ganador, segundoLugar, tercerLugar);
      this.prueba = prueba;
      this.tiempoGanador = tiempoGanador;
      this.tiempo2doLugar = tiempo2doLugar;
      this.tiempo3erLugar = tiempo3erLugar;
      this.recordMundial = recordMundial;
      this.recordPanamericano = recordPanamericano;
      this.hits = hits;
   }
   // setters y getters

   public void setTiempoGanador(String tiempoGanador) {
      this.tiempoGanador = tiempoGanador;
   }

   public String getTiempoGanador() {
      return tiempoGanador;
   }

   public void setTiempo2doLugar(String tiempo2doLugar) {
      this.tiempo2doLugar = tiempo2doLugar;
   }

   public String getTiempo2doLugar() {
      return tiempo2doLugar;
   }

   public void setTiempo3erLugar(String tiempo3erLugar) {
      this.tiempo3erLugar = tiempo3erLugar;
   }

   public String getTiempo3erLugar() {
      return tiempo3erLugar;
   }

   public void setRecordMundial(String recordMundial) {
      this.recordMundial = recordMundial;
   }

   public String getRecordMundial() {
      return recordMundial;
   }

   public void setRecordPanamericano(String recordPanamericano) {
      this.recordPanamericano = recordPanamericano;
   }

   public String getRecordPanamericano() {
      return recordPanamericano;
   }

   public void setHits(String hits) {
      this.hits = hits;
   }
   public String getHits() {
      return hits;
   }
public void nuevoRecordMundial(){
   System.out.println("Nuevo record mundial en la disciplina de "+disciplina+" con un tiempo de "+tiempoGanador);
}

public void nuevoRecordPanamericano(){
   System.out.println("Nuevo record panamericano en la disciplina de "+disciplina+" con un tiempo de "+tiempoGanador);


}

public void setPrueba(String prueba){
   this.prueba = prueba;
}

public String getPrueba(){
   return prueba;

}
}













     
     
    



