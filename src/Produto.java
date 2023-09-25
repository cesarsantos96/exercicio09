public class Produto {

    public String nome;
    public double preco;

    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    public void diminuirEstoque(int quantidade){
        if (quantidade > estoque){
            System.out.println("Estoque insuficiente para " + nome);
        } else {
            estoque -= quantidade;
        }
    }
}
