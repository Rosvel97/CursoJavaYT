package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PEDIR DOS NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON NUMEROS IGUALES */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1,numero2;
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        if(numero1>numero2){
            JOptionPane.showMessageDialog(null, numero1+" Es mayor que "+numero2);
        }
        else if(numero2>numero1){
            JOptionPane.showMessageDialog(null, numero2+" Es mayor que "+numero1);
        }
        else{
            JOptionPane.showMessageDialog(null, " Los numeros son iguales");
        }

    }
}
