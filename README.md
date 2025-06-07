# 🛒 Loja em Java - Teste TGID

## 📌 Descrição
Sistema em Java que simula uma loja online com usuários, produtos e vendas. O projeto foi montado no Visual Studio Code, usando a versão 24.0.1 do Java SE.

## 🧱 Classes
- `Usuario`
- `Produto`
- `ItemVenda`
- `Venda`

## 🧱 Estrutura das Classes
```classDiagram
    class Usuario {
        - String nome
        - String cpf
        - String email
    }

    class Produto {
        - String nome
        - double preco
        - int estoque
    }

    class ItemVenda {
        - Produto produto
        - int quantidade
        - double subtotal()
    }

    class Venda {
        - Usuario comprador
        - List~ItemVenda~ itens
        - double calcularTotal()
    }

    Usuario --> Venda
    Venda --> ItemVenda
    ItemVenda --> Produto
```


## 🚀 Como rodar
```bash
javac Main.java
java Main
```