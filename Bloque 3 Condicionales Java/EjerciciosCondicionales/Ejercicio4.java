package EjerciciosCondicionales;
/*EN UN MEGAPLAZA SE HACE UN 20% DE DESCUENTO A LOS CLIENTES CUYA COMPRA SUPERE LOS $300. ¿CUAL SERA LA CANTIDAD QUE PAGARA
 * UNA PERSONA POR SU COMPRA
 */
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        double porcentaje=.20,compra,totalPagar;
        compra=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto de la compra"));

        //SE EVALUA SI LA COMPRA SOBRE PASA DE LOS 300 DOLARES PARA APLICAR EL DESCUENTO
        if(compra>300.00){
            totalPagar=compra-(compra*porcentaje);
        }
        else
        {
            totalPagar=compra;
        }
        JOptionPane.showMessageDialog(null, "El total a pagar es: $"+totalPagar);
    }
}
