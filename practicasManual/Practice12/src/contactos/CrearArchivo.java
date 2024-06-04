package contactos;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
public class CrearArchivo {
    public void crearArchivo(){
      try{
        FileOutputStream f = new FileOutputStream("agenda.dat");
        DataOutputStream archivo = new DataOutputStream(f);

      }catch(FileNotFoundException e){
        System.out.println("No se pudo crear el archivo");
 
      }

}
}
