import javax.swing.JOptionPane;

public class Lista2Exercicio12 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um numero:"));
        int numero2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre outro numero:"));
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " eh maior do que " + numero2);
        } else if (numero1 < numero2) {
                JOptionPane.showMessageDialog(null, numero2 + " eh maior do que " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Os numeros " + numero1 + " e " + numero2 + " sao iguais");
        }
    }
}