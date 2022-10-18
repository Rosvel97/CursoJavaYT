import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int horaSemanales;
            float salariohoras, salarioTotal;

            System.out.println("Digite las horas semanales trabajadas ");
            horaSemanales=entrada.nextInt();

            System.out.println("Digite el salario recibi por hora");
            salariohoras=entrada.nextFloat();

            salarioTotal=horaSemanales*salariohoras;
            System.out.println("El salario total es $"+salarioTotal);
        }
    }
}
