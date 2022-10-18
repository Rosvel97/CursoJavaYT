import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float guillermo,luis,juan,total;

            System.out.println("Cuanto dinero posee Guillermo");
            guillermo=entrada.nextFloat();

            luis=guillermo/2;
            juan=(guillermo+luis)/2;
            total=guillermo+luis+juan;
            System.out.print("El total que tienen todos es "+total);
        }

    }
}
