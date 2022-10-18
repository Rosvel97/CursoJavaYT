import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*Construir un programa que, dado numero total de horas, devuelve el numero de semanas, dias y horas equivalentes.
        Por ejemplo, dado un total de 1000horas debe de mostrar 5 semanas, 6 dias y 16 horas*/
try (Scanner entrada = new Scanner(System.in)) {
            int horasTotales,semanas,dias,horas;
             System.out.println("Digite por favor el numero de horas ");
             horasTotales=entrada.nextInt();

            semanas=horasTotales/168;
            dias=horasTotales%168/24;
            horas=horasTotales%24;
            System.out.println("\nNumero de Semanas "+semanas+"\nNumero de Dias "+dias+"\nNumero de Horas "+horas);
        }
    }
}
