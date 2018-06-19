import javax.swing.JOptionPane;

public class Lista2Exercicio17 {
    public static String ano = "";

    public static void apresentarTexto() {

        String um = "um",
            dois = "dois",
            tres = "tres",
            quatro = "quatro",
            cinco = "cinco",
            seis = "seis",
            sete = "sete",
            oito = "oito",
            nove = "nove",
            dez = "dez",
            onze = "onze",
            doze = "doze",
            treze = "treze",
            catorze = "catorze",
            quinze = "quinze",
            dezesseis = "dezesseis",
            dezessete = "dezessete",
            dezoito = "dezoito",
            dezenove = "dezenove",
            vinte = "vinte",
            trinta = "trinta",
            quarenta = "quarenta",
            cinquenta = "cinquenta",
            sessenta = "sessenta",
            setenta = "setenta",
            oitenta = "oitenta",
            noventa = "noventa",
            cem = "cem",
            cento = "cento",
            duzentos = "duzentos",
            trezentos = "trezentos",
            quatrocentos = "quatrocentos",
            quinhentos = "quinhentos",
            seissentos = "seissentos",
            setessentos = "setessentos",
            oitossentos = "oitossentos",
            novessentos = "novessentos",
            mil = "mil";
        
        int pegaPrimeiro = Character.getNumericValue(ano.charAt(0)), 
            pegaSegundo = Character.getNumericValue(ano.charAt(1)),
            pegaTerceiro = Character.getNumericValue(ano.charAt(2)),
            pegaQuarto = Character.getNumericValue(ano.charAt(3));

        String junta = "";

        if (pegaPrimeiro == 1) {
            junta += mil;

            if (pegaSegundo == 9) {
                junta += " " + novessentos;
            }
            if (pegaSegundo == 8) {
                junta += " " + oitossentos;
            }
            if (pegaSegundo == 7) {
                junta += " " + setessentos;
            }
            if (pegaSegundo == 6) {
                junta += " " + seissentos;
            }
            if (pegaSegundo == 5) {
                junta += " " + quinhentos;
            }

            if (pegaTerceiro == 5 && pegaQuarto == 0) {
                junta += " e " + cinquenta;
            } else if (pegaTerceiro == 5 && pegaQuarto == 1) {
                junta += " e " + cinquenta + " e " + um;
            } else if (pegaTerceiro == 5 && pegaQuarto == 2) {
                junta += " e " + cinquenta + " e " + dois;
            } else if (pegaTerceiro == 5 && pegaQuarto == 3) {
                junta += " e " + cinquenta + " e " + tres;
            } else if (pegaTerceiro == 5 && pegaQuarto == 4) {
                junta += " e " + cinquenta + " e " + quatro;
            } else if (pegaTerceiro == 5 && pegaQuarto == 5) {
                junta += " e " + cinquenta + " e " + cinco;
            } else if (pegaTerceiro == 5 && pegaQuarto == 6) {
                junta += " e " + cinquenta + " e " + seis;
            } else if (pegaTerceiro == 5 && pegaQuarto == 7) {
                junta += " e " + cinquenta + " e " + sete;
            } else if (pegaTerceiro == 5 && pegaQuarto == 8) {
                junta += " e " + cinquenta + " e " + oito;
            } else if (pegaTerceiro == 5 && pegaQuarto == 9) {
                junta += " e " + cinquenta + " e " + nove;
            }

            if (pegaTerceiro == 6 && pegaQuarto == 0) {
                junta += " e " + sessenta;
            } else if (pegaTerceiro == 6 && pegaQuarto == 1) {
                junta += " e " + sessenta + " e " + um;
            } else if (pegaTerceiro == 6 && pegaQuarto == 2) {
                junta += " e " + sessenta + " e " + dois;
            } else if (pegaTerceiro == 6 && pegaQuarto == 3) {
                junta += " e " + sessenta + " e " + tres;
            } else if (pegaTerceiro == 6 && pegaQuarto == 4) {
                junta += " e " + sessenta + " e " + quatro;
            } else if (pegaTerceiro == 6 && pegaQuarto == 5) {
                junta += " e " + sessenta + " e " + cinco;
            } else if (pegaTerceiro == 6 && pegaQuarto == 6) {
                junta += " e " + sessenta + " e " + seis;
            } else if (pegaTerceiro == 6 && pegaQuarto == 7) {
                junta += " e " + sessenta + " e " + sete;
            } else if (pegaTerceiro == 6 && pegaQuarto == 8) {
                junta += " e " + sessenta + " e " + oito;
            } else if (pegaTerceiro == 6 && pegaQuarto == 9) {
                junta += " e " + sessenta + " e " + nove;
            }

            if (pegaTerceiro == 7 && pegaQuarto == 0) {
                junta += " e " + setenta;
            } else if (pegaTerceiro == 7 && pegaQuarto == 1) {
                junta += " e " + setenta + " e " + um;
            } else if (pegaTerceiro == 7 && pegaQuarto == 2) {
                junta += " e " + setenta + " e " + dois;
            } else if (pegaTerceiro == 7 && pegaQuarto == 3) {
                junta += " e " + setenta + " e " + tres;
            } else if (pegaTerceiro == 7 && pegaQuarto == 4) {
                junta += " e " + setenta + " e " + quatro;
            } else if (pegaTerceiro == 7 && pegaQuarto == 5) {
                junta += " e " + setenta + " e " + cinco;
            } else if (pegaTerceiro == 7 && pegaQuarto == 6) {
                junta += " e " + setenta + " e " + seis;
            } else if (pegaTerceiro == 7 && pegaQuarto == 7) {
                junta += " e " + setenta + " e " + sete;
            } else if (pegaTerceiro == 7 && pegaQuarto == 8) {
                junta += " e " + setenta + " e " + oito;
            } else if (pegaTerceiro == 7 && pegaQuarto == 9) {
                junta += " e " + setenta + " e " + nove;
            }
            
            if (pegaTerceiro == 8 && pegaQuarto == 0) {
                junta += " e " + oitenta;
            } else if (pegaTerceiro == 8 && pegaQuarto == 1) {
                junta += " e " + oitenta + " e " + um;
            } else if (pegaTerceiro == 8 && pegaQuarto == 2) {
                junta += " e " + oitenta + " e " + dois;
            } else if (pegaTerceiro == 8 && pegaQuarto == 3) {
                junta += " e " + oitenta + " e " + tres;
            } else if (pegaTerceiro == 8 && pegaQuarto == 4) {
                junta += " e " + oitenta + " e " + quatro;
            } else if (pegaTerceiro == 8 && pegaQuarto == 5) {
                junta += " e " + oitenta + " e " + cinco;
            } else if (pegaTerceiro == 8 && pegaQuarto == 6) {
                junta += " e " + oitenta + " e " + seis;
            } else if (pegaTerceiro == 8 && pegaQuarto == 7) {
                junta += " e " + oitenta + " e " + sete;
            } else if (pegaTerceiro == 8 && pegaQuarto == 8) {
                junta += " e " + oitenta + " e " + oito;
            } else if (pegaTerceiro == 8 && pegaQuarto == 9) {
                junta += " e " + oitenta + " e " + nove;
            }

            if (pegaTerceiro == 9 && pegaQuarto == 0) {
                junta += " e " + noventa;
            } else if (pegaTerceiro == 9 && pegaQuarto == 1) {
                junta += " e " + noventa + " e " + um;
            } else if (pegaTerceiro == 9 && pegaQuarto == 2) {
                junta += " e " + noventa + " e " + dois;
            } else if (pegaTerceiro == 9 && pegaQuarto == 3) {
                junta += " e " + noventa + " e " + tres;
            } else if (pegaTerceiro == 9 && pegaQuarto == 4) {
                junta += " e " + noventa + " e " + quatro;
            } else if (pegaTerceiro == 9 && pegaQuarto == 5) {
                junta += " e " + noventa + " e " + cinco;
            } else if (pegaTerceiro == 9 && pegaQuarto == 6) {
                junta += " e " + noventa + " e " + seis;
            } else if (pegaTerceiro == 9 && pegaQuarto == 7) {
                junta += " e " + noventa + " e " + sete;
            } else if (pegaTerceiro == 9 && pegaQuarto == 8) {
                junta += " e " + noventa + " e " + oito;
            } else if (pegaTerceiro == 9 && pegaQuarto == 9) {
                junta += " e " + noventa + " e " + nove;
            }
            //System.out.println(ano  + "\t" + junta);
            JOptionPane.showMessageDialog(null, "Você nasceu em " + junta);
        }
    }

    public static void main(String[] args) {
        ano = JOptionPane.showInputDialog("Entre com teu ano de nascimento:");

        int anoAtual = Integer.parseInt(ano);

        //while(anoAtual <= 2018){
            apresentarTexto();
            anoAtual = anoAtual + 1;
            ano = String.valueOf(anoAtual);
        //}
    }
}