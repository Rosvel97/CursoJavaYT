package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PROGRAMA  QUE LEA UN CARACTER POR TECLADO Y QUE COMPRUEBE SI ES UNA LETRA MAYUSCULA */
public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;
        letra=JOptionPane.showInputDialog(null, "Ingrese una letra").charAt(0);
        //SE EVALUA SI LA LETRA ESTA EN MAYUSCULA O NO
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayuscula");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La letra es minuscula");
        }
    }
}
