public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Whisky", 150,3);
        Produto produto2 = new Produto("Vinho", 100,4);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1,2);
        carrinho.adicionarProduto(produto2, 1);


        carrinho.exiberCarrinho();
        carrinho.fazerChechout();

    }
}