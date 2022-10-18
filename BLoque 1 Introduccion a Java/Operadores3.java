//Clase 8 Operadores Clase Math 
//Se hace uso del metodo Math.sqrt es para sacar la raiz de un numero
import java.util.Scanner;

public class Operadores3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            //Declaracion de Var
            double base, exponente, resul; 
            double num, raiz;
            float numeroR;
            int resulR;

            //Proceso para convertir en raiz2 al numero antes pedido por consola, luego se manda a imprimir
            System.out.println("INICIANDO PROGRAMA PARA SACAR LA RAIZ CUADRADA DE UN NUMERO");
            System.out.println("Ingrese el numero del cual desea la raiz cuadrada");
            num=entrada.nextDouble();
            raiz= Math.sqrt(num);
            System.out.println(raiz+"\n");

            //Se hace uso de otro metodo de la clase Math para elevacion de numeros
            System.out.println("INICIANDO PROGRAMA PARA DAR LA ELEVACION DE UN NUMERO");
            System.out.println("Por favor indica la base ");
            base=entrada.nextDouble();
            System.out.println("Por favor ingresa el exponente ");
            exponente=entrada.nextDouble();

            resul=Math.pow(base, exponente);
            System.out.println("La elevacion es "+resul+"\n");

            //Se redondea un numero
            System.out.println("INICIANDO PROGRAMA PARA REDONDEAR NUMERO");
            System.out.println("Por favor ingresa un numero decimal ");
            numeroR=entrada.nextFloat();
            resulR=Math.round(numeroR);
            System.out.println("El numero redondeado es "+resulR);
        }

    }
}
