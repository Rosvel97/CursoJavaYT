import javax.swing.JOptionPane;

public class Condicionales3 {
    public static void main(String[] args) {
        int numero;
        String mensaje;
        /*OPERADOR TERNARIO ? ES REPRESENTADO CON EL SIGNO DE CIERRE PREGUNTA " ? " SE UTILIZA USUALMETE PARA COMPARAR
         * CONDICIONES SIEMPRE Y CUANDO SE CUMPLAN.
         */
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
// SI EL NUMERO ES PAR QUE ME MUESTRE EL PRIMER MENSAJE "ES PAR" , SINO ME MOSTRARA EL SEGUNDO MENSAJE "ES IMPAR"
        mensaje=(numero%2==0) ? "Es par" : "Es impar";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
