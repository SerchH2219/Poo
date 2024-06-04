package Main;
import javax.swing.JOptionPane;
import persona.Claseprincipal.Herencia.EmpleadoAdministrativo;
import persona.Claseprincipal.Herencia.EmpleadoOperativo;

public class PersonaPrueba {
    public static void main(String[] args) {
        int opcion;
        String nombre, domicilio, telefono, curp, rfc;
        float sueldobase=0.0f, sueldoneto, precioporhora, imp;
        int edad, horastrabajadas;
        EmpleadoAdministrativo EA1 = new EmpleadoAdministrativo();
        EmpleadoOperativo EO1 = new EmpleadoOperativo();
        while (true) {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones \n"
           + "1.- Alta Empleado Operativo\n"
           +"2.- Cálculo de Sueldo Empleado Adminstrativo\n"
           +"3.- Listar datos Empleados Operativo\n"
           +"4.- Salir" ));
           switch (opcion) {
            case 1:
                nombre=JOptionPane.showInputDialog("Nombre del Empleado: ");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                domicilio=JOptionPane.showInputDialog("Domicilio: ");
                telefono=JOptionPane.showInputDialog("Teléfono: ");
                horastrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas: "));
                precioporhora=Float.parseFloat(JOptionPane.showInputDialog("Precio por Hora:"));
                curp=JOptionPane.showInputDialog("CURP: ");
                rfc=JOptionPane.showInputDialog("RFC: ");
                sueldoneto=horastrabajadas*precioporhora;
                EO1.altaTrabajador(nombre, domicilio, telefono, curp, rfc, edad, sueldobase, sueldoneto, precioporhora, horastrabajadas);
                case 2:
                sueldobase=Float.parseFloat(JOptionPane.showInputDialog("Sueldo base: "));
                imp=sueldobase*.32f;
                JOptionPane.showMessageDialog(null, "El sueldo Neto del Empleado es : "
                +EA1.CalculodeSueldoNeto(sueldobase, imp));
                break;
                case 3:
                EO1.listarDatos();
                case 4:
                System.exit(0);
            default:
            System.out.println("Selecciona una opcion correcta (1-4)");
                break;
           }
            
        }    
        
    }

}
