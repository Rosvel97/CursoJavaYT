package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR SI LA FECHA DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA
 * SUPONIENDO QUE TODOS LOS MESE SON DE 30 DIAS
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int dia,mes,anio;
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el mes"));
        anio= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el año"));

        if((dia>=1)&&(dia<=30)){
            if((mes>=1)&&(mes<=12)){
                if(anio !=0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
    }
}
