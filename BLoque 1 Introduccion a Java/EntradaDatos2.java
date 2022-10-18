//Clase 5
import javax.swing.JOptionPane;
public class EntradaDatos2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        //char letra;
//        double decimal;
  //      float decimal2;
        //CONVERSION DE DATOS Y ENTRADA DE DATOS EN VENTANA
        //Se hace uso de JOptionPane
        //Con la clase Integer podemos hacer uso de uno de sus metodos que es parseInt
        //Haciendo uso de este metodo para poder convertir un String a Int
        //Con la extension .charAt(0) definimos la posicion que necesitamos en el string
        //De esta manera podemos convertir el String a char

        
        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu edad"));
       // letra=JOptionPane.showInputDialog("Ingresa una letra").charAt(0);
        //decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un decimal"));
        //decimal2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese un segundo decimal"));

        //Se manda a imprimir los Datos pero en una ventana de Dialogo
        JOptionPane.showMessageDialog(null, "Nombre- "+nombre+"\nEdad- "+edad+"años");

        //Me quede en 1 hora con 5 minutos
    }
}
