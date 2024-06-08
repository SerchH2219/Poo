public class Competencia {
    public static void main(String[] args) {
        
    }
    // Atributos
         String disciplina;
    String rama;
        String categoria;
        String sede;
         String etapa;
         String fecha;
         String hora;
         String Ganador;
        String segundoLugar;
         String tercerLugar;
        String observaciones;
    //constructor sin parametro
        public Competencia() {
    
        }
        //Constructor con parametros
    
        public Competencia(String observaciones, String disciplina, String rama, String categoria, String sede, String etapa,
                String fecha, String hora, String Ganador, String segundoLugar, String tercerLugar) {
            this.observaciones = observaciones;
            this.disciplina = disciplina;
            this.rama = rama;
            this.categoria = categoria;
            this.sede = sede; 
            this.etapa = etapa;
            this.fecha = fecha;
            this.hora = hora;
            this.Ganador = Ganador;
            this.segundoLugar = segundoLugar;
            this.tercerLugar = tercerLugar;
    
        }
    
        //Getter y Setters
        public void setObservaciones(String Observaciones) {
            this.observaciones = Observaciones;
        }
        public String getObservaciones() {
            return observaciones;
        }
        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }
    
        public String getDisciplina() {
            return disciplina;
        }
    
        public void setRama(String rama) {
            this.rama = rama;
        }
    
        public String getRama() {
            return rama;
        }
    
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    
        public String getCategoria() {
            return categoria;
        }
    
        public void setSede(String sede) {
            this.sede = sede;
        }
    
        public String getSede() {
            return sede;
        }
    
        public void setEtapa(String etapa) {
            this.etapa = etapa;
        }
    
        public String getEtapa() {
            return etapa;
        }
    
        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
    
        public String getFecha() {
            return fecha;
        }
    
        public void setHora(String hora) {
            this.hora = hora;
        }
    
        public String getHora() {
            return hora;
        }
    
        public void setGanador(String Ganador) {
            this.Ganador = Ganador;
        }
    
        public String getGanador() {
            return Ganador;
        }
    
        public void setSegundoLugar(String segundoLugar) {
            this.segundoLugar = segundoLugar;
        }
    
        public String getSegundoLugar() {
            return segundoLugar;
        }
    
        public void setTercerLugar(String tercerLugar) {
            this.tercerLugar = tercerLugar;
        }
    
        public String getTercerLugar() {
            return tercerLugar;
        }
 
 
}





