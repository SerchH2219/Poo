package persona.Claseprincipal.Herencia; 
import persona.Claseprincipal.Persona;

public class EmpleadoAdministrativo extends Persona{
    float sueldobase, isr;

    public void altaTrabajador(String nombre, String domicilio, String telefono, 
    String curp, String rfc, int edad, float sueldobase, float sueldoneto, float isr){
      this.nombre=nombre;
      this.domicilio=domicilio;
      this.telefono=telefono;  
      this.curp=curp;
      this.rfc=rfc;
      this.edad=edad;
      this.sueldobase=sueldobase;
      this.sueldoneto=sueldoneto;
      this.isr=isr;
    }
    //Practica 6 (Se esta sobreescribiendo el metodo listarDatos)
    public float CalculodeSueldoNeto(float sueldobase, float isr){
      this.sueldobase=sueldobase;
      this.isr=isr;
      this.sueldoneto=sueldobase-isr;
      return sueldoneto;
    }
    
}
