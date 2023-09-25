import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

        private List<Produto> itens;

        public CarrinhoDeCompras(){
            itens = new ArrayList<>();
        }
        public void adicionarProduto(Produto produto, int quantidade){
            if(quantidade <= 0){
                System.out.println("A quantidade deve ser maior que zero.");
                return;
            }
            if (produto.getEstoque() < quantidade){
                System.out.println("Estoque insuficiente para "+ produto.getNome() + "adicionado no carrinho");
                return;
            }
            for ( int i = 0; i < quantidade; i++){
                itens.add(produto);
            }
            produto.diminuirEstoque(quantidade);
            System.out.println(quantidade + "x" + produto.getNome() + " adicionado no carrinho");
        }
        public double calcularTotal(){
            double total = 0;
            for (Produto produto : itens){
                total += produto.getPreco();
            }
            return total;
        }
        public void fazerChechout(){
            double total = calcularTotal();
            System.out.println("Total da compra: R$" + total);
            System.out.println("Compra realizada com sucesso!");
            itens.clear();
        }

    public void exiberCarrinho(){
        System.out.println("Itens no carrinho: ");
        for(Produto produto : itens){
            System.out.println(produto.getNome() + " R$ " + produto.getPreco());
        }
    }
}


