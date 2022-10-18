import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double salarioMen=1000 ,comision=150 ,cantidadVeh,porcenVenta=0.05,precioAuto,salarioFinal;
            String nombre;
            System.out.println("Digite el nombre del vendedor ");
            nombre=entrada.nextLine();
            System.out.println("Digite la cantidad de autos vendidos en este mes");
            cantidadVeh=entrada.nextDouble();
            System.out.println("Digite el precio del automovil");
            precioAuto=entrada.nextDouble();

            salarioFinal=salarioMen+(comision*cantidadVeh)+(precioAuto*porcenVenta*cantidadVeh);
            System.out.println("\nNombre Vendedor- "+nombre+"\nSalario Final $"+salarioFinal);
        }


    }
}
