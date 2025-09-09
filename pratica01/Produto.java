public class Produto {

    private String nome;
    private double preco;

    public Produto(){
        this("", 0);
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produto {nome: " + nome + ", preco: R$" + preco + "}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0){
            this.preco = preco;
            return;
        }
        System.out.println("Preco invalido");
        return;
    }

    
    
}
