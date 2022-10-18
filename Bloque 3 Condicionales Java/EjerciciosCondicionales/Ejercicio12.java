package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PEDIR UNA NOTA ENTRE 0 Y 10 Y MOSTRARLA DE LA FORMA:
 * INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE Y SOBRESALIENTE
 */
public class Ejercicio12 {
    public static void main(String[] args) {
       double nota;
       nota=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su calificacion"));
      if(nota<=4.0){
        JOptionPane.showMessageDialog(null, "INSUFICIENTE");
      }
      else  if(nota<=6.0){
        JOptionPane.showMessageDialog(null, "SUFICIENTE");
      }
      else if(nota<=8.0){
        JOptionPane.showMessageDialog(null, "BIEN");
      }
      else if(nota<=9.0){
        JOptionPane.showMessageDialog(null, "NOTABLE");
      }
      else if(nota<=10){
        JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
      }
      else{
        JOptionPane.showMessageDialog(null, "Error nota invalida");
      }
      
    }
}
