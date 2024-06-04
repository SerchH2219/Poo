package contactos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class AgregarContactos {
public void agregarContactos() {
//Escritura del archivo
String nombre, direccion, telefono, sexo, ocupacion;
int edad;
FileWriter w;
try{
    w = new FileWriter("agenda.dat", true);
    PrintWriter wr = new PrintWriter(w);
    nombre=(JOptionPane.showInputDialog("Nombre: "));
    direccion=(JOptionPane.showInputDialog("Direccion: "));
    telefono=(JOptionPane.showInputDialog("Teléfono: "));
    sexo=(JOptionPane.showInputDialog("Sexo: "));
    ocupacion=(JOptionPane.showInputDialog("Ocupacion: "));
    edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
    wr.println(nombre+" "+direccion+" "+telefono+" "+sexo+" "+ocupacion+" "+edad);
    w.close();
} catch (IOException e) {
    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al escribir en el archivo");
}

}
}