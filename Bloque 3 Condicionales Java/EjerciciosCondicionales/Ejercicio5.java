package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*UN OBRERO NECESITA CALCULAR SU SALARIO SEMANAL, EL CUAL SE OBTIENE DE LA SIGUIENTE MANERA
 * SI TRABAJA 40 HORAS O MENOS SE EL PAGA $16 POR HORA
 * SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS PRIMERAS 40 HORAS Y $20 POR CADA HORA EXTRA
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int horas;
        double pagoFinal,pagoHora=16;
        horas=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas laboradas"));

        //SE ABRE UN CONDICIONAL PARA EVALUAR LAS HORAS Y EL PAGO A RECIBIR
        if(horas<=40){
            pagoFinal=pagoHora*horas;
        }
        else
        {
          pagoFinal=(40*16)+((horas-40)*20);
        }
        JOptionPane.showMessageDialog(null, "El pago final es $"+pagoFinal);
    }
}
