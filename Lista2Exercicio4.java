import javax.swing.JOptionPane;

public class Lista2Exercicio4 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Entre um numero:"));
        
        //double valor = (numero / 2);
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Par");
        } else {
            JOptionPane.showMessageDialog(null, "Impar");
        }
    }
}