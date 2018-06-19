import javax.swing.JOptionPane;

public class Lista2Exercicio14 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um numero:"));
        int numero2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre outro numero:"));
        int numero3 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um ultimo numero:"));
        
        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                JOptionPane.showMessageDialog(
                    null, numero1 + "\n" + numero2 + "\n" + numero3);
            } else {
                JOptionPane.showMessageDialog(
                    null, numero1 + "\n" + numero3 + "\n" + numero2);
            }
        }
        if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                JOptionPane.showMessageDialog(
                    null, numero2 + "\n" + numero1 + "\n" + numero3);
            } else {
                JOptionPane.showMessageDialog(
                    null, numero2 + "\n" + numero3 + "\n" + numero1);
            }
        }
        if (numero3 < numero1 && numero3 < numero2) {
            if (numero2 < numero1) {
                JOptionPane.showMessageDialog(
                    null, numero3 + "\n" + numero2 + "\n" + numero1);
            } else {
                JOptionPane.showMessageDialog(
                    null, numero3 + "\n" + numero1 + "\n" + numero2);
            }
        }
    }
}