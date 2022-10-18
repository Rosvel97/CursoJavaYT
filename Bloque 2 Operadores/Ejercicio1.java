import java.util.Scanner;

//Clase 9 Hacer un programa que calcule e imprima la suma de 3 calificaciones
public class Ejercicio1 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, notaFinal;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Por favor digite nota 1: ");
            nota1=entrada.nextFloat();
            System.out.print("Por favor digite nota 2: ");
            nota2=entrada.nextFloat();
            System.out.print("Por favor digite nota 3: ");
            nota3=entrada.nextFloat();
        }
        notaFinal=nota1+nota2+nota3;
        System.out.println("Tu nota final es "+notaFinal/3);

    }
}
