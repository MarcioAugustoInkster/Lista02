import javax.swing.JOptionPane;

public class Lista2Exercicio19 {
   public static void main(String[] args) {
        double deposito = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Quanto quer depositar? R$"));
        
        JOptionPane.showMessageDialog(null, "Você depositou: R$" + deposito);
    }
}