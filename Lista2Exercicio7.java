import javax.swing.JOptionPane;

public class Lista2Exercicio7 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um numero:"));
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " eh Par");
        } else {
            JOptionPane.showMessageDialog(null, numero + " eh Impar");
        }
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, numero + " eh Negativo");
        } else {
            JOptionPane.showMessageDialog(null, numero + " eh Positivo");
        }
        if (numero > 10) {
            JOptionPane.showMessageDialog(null, numero + " eh maior que 10");
        }
        if (numero == 50) {
            JOptionPane.showMessageDialog(null, numero + " eh igual a 50");
        } else if (numero < 50) {
            JOptionPane.showMessageDialog(null, numero + " eh menor que 50");
        }
        if (numero < -10) {
            JOptionPane.showMessageDialog(null, numero + " eh menor que -10");
        }        
        if (numero > 30) {
            JOptionPane.showMessageDialog(null, numero + " eh maior que 30");
        } else if (numero == 30) {
            JOptionPane.showMessageDialog(null, numero + " eh igual a 30");
        }
        if (numero != 1) {
            JOptionPane.showMessageDialog(null, numero + " eh diferent de 1");
        } else {
            JOptionPane.showMessageDialog(null, numero + " eh igual a 1");
        }
    }
}