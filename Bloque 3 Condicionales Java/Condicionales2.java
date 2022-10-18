import javax.swing.JOptionPane;

public class Condicionales2 {
    public static void main(String[] args) {
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero entre 1 y 5: "));

        //Se abre condicional switch
        switch (dato) {
            case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
                break;
            case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
                break;
            default:JOptionPane.showMessageDialog(null, "El numero no esta entre 1 y 5");
                break;
        }
    }
}
