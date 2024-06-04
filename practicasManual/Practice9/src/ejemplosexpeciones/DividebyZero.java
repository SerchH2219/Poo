package ejemplosexpeciones;
import javax.swing.JOptionPane;

public class DividebyZero {
    public static void main(String[] args) {
        int a, b, resultado;
        while (true) {
            a=Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Teclea el númerador"));
            try{
                resultado=b / a; //Aquí podría lanzarse una expeción
                JOptionPane.showMessageDialog(null, "Resultado = "+ resultado);
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                System.exit(0);
            } catch(ArithmeticException e){
                //Aquí la atrapamos y corregimos problema en caso de prestarse
                JOptionPane.showMessageDialog(null, "Intento de dividir entre cero, teclea nuevamente los valores");
            }

            
        }
    }
    
}
