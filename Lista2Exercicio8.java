import javax.swing.JOptionPane;

public class Lista2Exercicio8 {
    public static void main(String[] args) {
        String menu = "-------------------------------------------------\n"
            + "| TIPO           NOME                        VALOR      |\n"
            + "---------------------------------------------------------\n"
            + "Bolos ------------ Bolo Brigadeiro ----------- R$29,50\n"
            + "Bolos ------------ Bolo Floresta Negra ------- R$2,00\n"
            + "Bolos ------------ Bolo Leite com Nutela ----- R$29,23\n"
            + "Bolos ------------ Bolo Mousse de Chocolate -- R$7,10\n"
            + "Bolos ------------ Bolo Nega Maluca ---------- R$19,33\n"
            + "Doces ----------- Bomba de Creme ------------ R$17,71\n"
            + "Doces ----------- Bomba de Morango ---------- R$4,82\n"
            + "Sandwiches -- File-Mignon com fritas e -- R$21,16\n"
            + "--------------------- cheddar\n"
            + "Sandwiches--- Hamburger com queijos, ----- R$12,70\n"
            + "--------------------- champignon e rucula\n"
            + "Sandwiches --- Provolone com Salame ------ R$19,70\n"
            + "Sandwiches --- Vegetariano com Berinjela - R$28,22\n"
            + "Pizzas ------- Calabresa ----------------- R$8,98\n"
            + "Pizzas ------- Napolitana ---------------- R$0,42\n"
            + "Pizzas ------- Peruana ------------------- R$18,36\n"
            + "Pizzas ------- Portuguesa ---------------- R$27,50\n"
            + "---------------------------------------------------------\n";
        
        JOptionPane.showInputDialog(null, "*** Entre com o Nome do Pedido ***\n\n" + menu);
        

        
    }
}