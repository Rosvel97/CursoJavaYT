package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*PEDIR EL DIA, MES Y AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA. CON MESES DE 28,30,31
 * DIAS, SIN AÑOS BISIESTOS
 * 
 * TABLA DE LOS DIAS QUE CONTIENE CADA MES
 * ENERO 31 DIAS    FEBRERO 28 DIAS  MARZO 31 DIAS  ABRIL 30 DIAS   MAYO 31 DIAS    JUNIO 30 DIAS
 * JULIO 31 DIAS    AGOSTO 31 DIAS   SEPTIEMBRE 30 DIAS     OCTUBRE 31 DIAS     NOVIEMBRE 30 DIAS   DICIEMBRE 31 DIAS
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int dia,mes,año;
        dia=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes"));
        año=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año"));

        if(año==0){
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
        else if((mes==2)&&(dia>=1 && dia<=28)){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else if((mes==4 || mes==6 || mes==9 || mes==11)&&(dia>=1 && dia<=30)){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31)){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
    }
}
