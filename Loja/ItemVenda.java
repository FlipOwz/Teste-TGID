package Loja;

public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        produto.estoqueReduz(quantidade);
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
    return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return String.format("- %s (%dx R$%.2f) = R$%.2f", produto.getNome(), quantidade, produto.getPreco(), getSubtotal());
    }
}
