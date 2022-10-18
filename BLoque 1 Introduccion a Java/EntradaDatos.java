//Clase 4
import java.util.Scanner;
public class EntradaDatos {
    //Se usa la clase Scanner para poder pedirle al usuario los datos a guardar
    //dentro de las variables declaradas
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            byte edad;
            String nombre;
            System.out.println("Ingresa tu nombre ");
            nombre=entrada.nextLine();
            System.out.println("Por favor ingrese su edad");
            edad=entrada.nextByte();

            System.out.println("Gracias "+nombre+" tu edad es "+edad+" años");
        }
    }
}
