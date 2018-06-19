import javax.swing.JOptionPane;

public class Lista2Exercicio16 {
    public static void main(String[] args) {
        double fahrenhreitCelcius = 0, 
            fahrenhreitKelvin = 0,
            celciusKelvin = 0, 
            celciusFahrenheit = 0,
            kelvinCelcius = 0, 
            kelvinFahrenheit = 0;
        
        
        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog(null, "*** Menu Conversao Temperatura ***\n\n" +
                "[1] Fahrenheit = Celcius\n" +
                "[2] Fahrenheit = Kelvin\n" +
                "[3] Celcius = Fahrenheit\n" +
                "[4] Celcius = Kelvin\n" +
                "[5] Kelvin = Celcius\n" +
                "[6] Kelvin = Fahrenheit\n" +
                "[0] Sair"
        ));
        
        while (opcao > 0 && opcao <= 6) {
            double temperatura = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Entre uma temperatura:"));
            
            if (opcao == 1) {
                fahrenhreitCelcius = (temperatura - 32) * ((double) 5 / 9);
                JOptionPane.showMessageDialog(null, "\n(F)ahrenheit para (C)elcius: " + fahrenhreitCelcius);
            } else if (opcao == 2) {
                fahrenhreitKelvin = ((temperatura + 459.67) * ((double) 5 / 9));
                JOptionPane.showMessageDialog(null, "\n(F)ahrenheit para (K)elvin: " + fahrenhreitKelvin);
            } else if (opcao == 3) {
                celciusFahrenheit = ((temperatura * ((double) 9 / 5)) + 32);
                JOptionPane.showMessageDialog(null, "\n(C)elcius para (F)ahrenheit: " + celciusFahrenheit);
            } else if (opcao == 4) {
                celciusKelvin = temperatura + 273.15;
                JOptionPane.showMessageDialog(null, "\n(C)elcius para (K)elvin: " + celciusKelvin);
            } else if (opcao == 5) {
                kelvinCelcius = temperatura - 273.15;
                JOptionPane.showMessageDialog(null, "\n(K)elvin para (C)elcius: " + kelvinCelcius);
            } else if (opcao == 6) {
                kelvinFahrenheit = (((double) 9 / 5) * (temperatura - 273.15)) + 32;
                JOptionPane.showMessageDialog(null, "\n(K)elvin para (F)ahrenheit: " + kelvinFahrenheit);
            }

            opcao = Integer.parseInt(
                JOptionPane.showInputDialog(null, "*** Menu Conversao Temperatura ***\n\n" +
                    "[1] Fahrenheit = Celcius\n" +
                    "[2] Fahrenheit = Kelvin\n" +
                    "[3] Celcius = Fahrenheit\n" +
                    "[4] Celcius = Kelvin\n" +
                    "[5] Kelvin = Celcius\n" +
                    "[6] Kelvin = Fahrenheit\n" +
                    "[0] Sair"
            ));
        }
    }
}