package EjerciciosCondicionales;

import javax.swing.JOptionPane;

/*CONSTRUIR UN PROGRAMA QUE SIMULE UNA CALCULADORA, EL FUNCIONAMIENTO DE UNA CALCULADORA
 * QUE PUEDE REALIZAR LAS CUATRO OPERACIONES ARITMETICAS BASICAS(SUMA,RESTA,MUL,DIV) CON 
 * VALORES NUMERICOS ENTEROS. EL USUARIO DEBE DE ESPECIFICAR LA OPERACION CON EL PRIMER 
 * CARACTER DEL RPIMER PARAMETRO DE LA LINEA DE COMANDOS 
 * S o s PARA LA SUMA
 * R o r PARA LA RESTA
 * P,p o M,m PARA MULTIPLICACION O PRODUCTO
 * D o d PARA LA DIV
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int num1,num2,suma,resta,mult,div;
        char operacion;
        operacion=JOptionPane.showInputDialog(null, "ESTAS SON LAS OPERACIONES QUE PUEDES REALIZAR"+"\nSUMA = S"+"\nResta = R"+
        "\nMultiplicacion = M o P"+"\nDivicion = D").charAt(0);
        num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite segundo numero"));

       
       
        switch(operacion){
            //SUMA
            case 'S':
            case 's': suma=num1+num2;
            JOptionPane.showMessageDialog(null, "\nSuma"+"El resultado de "+num1+"+"+num2+"="+suma);
            break;
            //RESTA
            case 'R':
            case 'r': resta=num1-num2;
            JOptionPane.showMessageDialog(null, "\nResta"+"El resultado de "+num1+"-"+num2+"="+resta);
            break;
            //MULTIPLICACION
            case 'P':
            case 'p':
            case 'M':
            case 'm': mult=num1*num2;
            JOptionPane.showMessageDialog(null, "\nMultiplicacion"+"El resultado de "+num1+"x"+num2+"="+mult);
            break;
            //DIVICION
            case 'D':
            case 'd': div=num1/num2;
            JOptionPane.showMessageDialog(null, "\nDivicion"+"El resultado de "+num1+"/"+num2+"="+div);
            break;
            default: JOptionPane.showMessageDialog(null, "Error se equivoco de letra");
            break;

        }
    }
}
