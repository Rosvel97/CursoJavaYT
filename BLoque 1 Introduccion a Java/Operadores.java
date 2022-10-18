import java.util.Scanner;
//Clase 6 Operadores aritmeticos
public class Operadores {
    public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
        float numero1, numero2, suma, resta, mult, div, mod;
        
        System.out.println("Ingresa el primer numero");
        numero1=entrada.nextFloat();
        System.out.println("Ingresa el segundo numero");
        numero2=entrada.nextFloat();

        //Operadores aritmeticos
        suma=numero1+numero2;
        resta=numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        mod=numero1%numero2;

    //Se imprimen resultados
    System.out.println("La suma es "+suma);
    System.out.println("La resta es "+resta);
    System.out.println("La multiplicacion es "+mult);
    System.out.println("La division es "+div);
    System.out.println("El mod es "+mod);
        }
    }
}
