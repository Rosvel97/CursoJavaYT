package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PEDIR UN NUMERO ENTRE 0 Y 99,999 Y DECIR CUANTAS CIFRAS TIENE */
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entre 0 y 99,999"));

      if(numero<10){
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 1 cifra");
      }
      else if(numero<100){
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 2 cifras");
      }
      else if(numero<1000){
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 3 cifras");
      }
      else if(numero<10000){
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 4 cifras");
      }
      else if(numero<100000){
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene 5 cifras");
      }
      else{
        JOptionPane.showMessageDialog(null, "ERROR");
      }

    }
}
