import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double caliFinal, participacion,parcial1,parcial2,examenFin;
            System.out.println("Por Favor digite su nota de participacion ");
            participacion=entrada.nextDouble();
            System.out.println("Por favor igrese su nota de su examen parcial 1 ");
            parcial1=entrada.nextDouble();
            System.out.println("Por favor ingrese su nota de su examen parcial 2 ");
            parcial2=entrada.nextDouble();
            System.out.println("Por favor ingrese su nota de su examen final ");
            examenFin=entrada.nextDouble();

            caliFinal=participacion*.10+parcial1*.25+parcial2*.25+examenFin*.40;
            System.out.println("\nLa calificacion final es "+caliFinal);
        }
    }
}