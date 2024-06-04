package ModificacionArchivo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {
    public void leerArchivo(){
        try{
            FileReader archivo = new FileReader("archivo1.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            String linea;
            while((linea = lectura.readLine()) != null){
                System.out.println(linea);
            }
            lectura.close();
        }   catch (FileNotFoundException ex){
            System.out.println("Error: "+ex);
        }   catch (IOException ex){
            System.out.println("Error: "+ex);
        }
    }
}