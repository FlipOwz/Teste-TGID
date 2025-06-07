package Loja;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Usuario usuario;
    private List<ItemVenda> itens = new ArrayList<>();
    
    public Venda(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarItem(ItemVenda item) {
        Produto produto = item.getProduto();
        int quantidade = item.getQuantidade();

    if (produto.getEstoque() >= quantidade) {
        itens.add(item);
        produto.estoqueReduz(quantidade);
    } else {
        System.out.println("❌ Estoque insuficiente para o produto: " + produto.getNome());
    }
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    public void exibirResumo() {
        System.out.println("🧾 RESUMO DA VENDA");
        System.out.printf("Cliente: %s (CPF: %s)\n", usuario.getNome(), usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("\nProdutos Comprados:");
        for (ItemVenda item : itens) {
            System.out.println(item.getDescricao());
        }
        System.out.printf("\nTotal da Venda: R$%.2f\n", calcularTotal());
    }
}
