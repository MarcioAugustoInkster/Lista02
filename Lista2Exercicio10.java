import javax.swing.JOptionPane;

public class Lista2Exercicio10 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre o primeiro numero:"));
        int numero2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre outro numero:"));
        int numero3 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre mais um numero:"));
        int numero4 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um ultimo numero:"));
        
        if (numero1 == numero3 && numero3 == numero1 &&
            numero2 == numero4 && numero4 == numero2 &&
            numero1 != numero2 && numero3 != numero4) {
            JOptionPane.showMessageDialog(null, "Eh um retangulo");
        } else {
            JOptionPane.showMessageDialog(null, "NAO eh um retangulo");
        }
    }
}