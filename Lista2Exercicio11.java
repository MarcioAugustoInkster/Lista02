import javax.swing.JOptionPane;

public class ELista2Exercicio11 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Entre a nota1:"));
        double nota2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Entre a nota2:"));
        double nota3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Entre a nota3:"));
        double nota4 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Entre a nota4:"));
        double nota5 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Entre a nota5:"));
        
        double calculaNota = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        String consulta = "\n\n7.99 > ------------- Aprovado\n"
            + "6.00 <> 7.99 ----- Recuperacao\n"
            + "0 <> 5.99 --------- Reprovado";

        if (calculaNota < 5.99) {
            JOptionPane.showMessageDialog(
                null, "Media: " + calculaNota + "\nReprovado" + consulta);
        } else if (calculaNota >= 6 & calculaNota <= 7.99) {
            JOptionPane.showMessageDialog(
                null, "Media: " + calculaNota + "\nRecuperacao" + consulta);
        } else {
            JOptionPane.showMessageDialog(
                null, "Media: " + calculaNota + "\nAprovado" + consulta);
        }
    }
}