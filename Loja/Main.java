package Loja;

public class Main {
    public static void main(String[] args) {
        Usuario cliente = new Usuario("Felipe Galvão", "123.456.789-00", "felipegalvaosp@email.com");

        Produto camiseta = new Produto("Camiseta", 50.00, 10);
        Produto calca = new Produto("Calça Jeans", 120.00, 5);

        Venda venda = new Venda(cliente);
        venda.adicionarItem(new ItemVenda(camiseta, 2));
        venda.adicionarItem(new ItemVenda(calca, 1));

        venda.exibirResumo();
    }
}
