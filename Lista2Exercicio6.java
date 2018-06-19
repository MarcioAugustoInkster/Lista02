import javax.swing.JOptionPane;

public class Lista2Exercicio6 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um numero:"));
        
        if (numero != 1) {
            JOptionPane.showMessageDialog(null, "Diferente de 1");
        } else {
            JOptionPane.showMessageDialog(null, "Igual a 1");
        }
    }
}