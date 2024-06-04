package contactos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Agenda {
    public static void main(String[] args) {
        CrearArchivo ca = new CrearArchivo();
        AgregarContactos ac = new AgregarContactos(); 
       
        while (true) {
            int op = 0;
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones\n"
            + "1. Crear Archivo\n"
            + "2. Agregar Contactos\n"
            + "3. Desplegar Conactos\n"
            + "4. Salir\n"));
        
        switch (op) {
            case 1:
                ca.crearArchivo();
                break;
        
            case 2:
            ac.agregarContactos();

            case 3:
            try{
                BufferedReader fd= new BufferedReader(new FileReader("agenda.dat"));
                String linea = "";
                while ((linea = fd.readLine()) != null){
                    JOptionPane.showMessageDialog(null, linea);
                }
            
            fd.close();
        } catch (FileNotFoundException e) {
            System.out.println("No pude abrir el archivo agenda.dat");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo agenda.dat");
        }
        break;

            case 4:
            System.exit(0);
            }}}
        }
