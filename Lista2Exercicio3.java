import javax.swing.JOptionPane;

public class Lista2Exercicio3 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite um numero:"));

        int numero2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Digite outro numero:"));
        
        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog(null,
                "*** Pressione a seguinte opcao ***\n\n" +
                "[1] Somar\n" +
                "[2] Subtrair\n" +
                "[3] Multiplicar\n" +
                "[4] Dividir"));
        
        if (opcao == 1) {
            int soma = numero1 + numero2;

            JOptionPane.showMessageDialog(null, "A soma fica: " + soma);
        } else if (opcao == 2) {
            int subtracao = numero1 - numero2;

            JOptionPane.showMessageDialog(null, "A subtracao fica: " + subtracao);
        } else if (opcao == 3) {
            int multiplicacao = numero1 * numero2;

            JOptionPane.showMessageDialog(null, "A multiplicacao fica: " + multiplicacao);
        } else if (opcao == 4) {
            double divisao = numero1 / numero2;

            JOptionPane.showMessageDialog(null, "A divisao fica: " + divisao);
        } else {
            JOptionPane.showMessageDialog(null, "Opcao invalida");
        }
    }
}