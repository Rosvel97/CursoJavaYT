package EjerciciosCondicionales;
import javax.swing.JOptionPane;
/*HACER UN PROGRAMA QUE TOME DOS NUMEROS Y DIGA SI AMBOS SON PARES O IMPARES */
public class Ejercicio6 {
    public static void main(String[] args) {
        int num1,num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        if((num1%2==0) && (num2%2==0)){
//SE COLOCAN ENTRE PARENTESIS AMBAS CONDICIONES PARA QUE SE CUMPLAN LAS 2, if((condicion1) && (condicion2))
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }else if((num1%2 !=0) &&(num2%2 !=0)){
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
        else{
            JOptionPane.showMessageDialog(null, "Un numero es par, y el otro impar");
        }
    }
}
