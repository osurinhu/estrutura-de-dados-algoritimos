public class PrincipalL {
    public static void main(String[] args) {
        
        Lista<Produto> produtos = new Lista<Produto>("Produtos");

        produtos.addInicio(new Produto("Suco Primeiro", 10.0));
        produtos.addFinal(new Produto("Bolo Final", 30.0));
        produtos.addNoIndice(new Produto("Garfos Indice", 20.0),1);

        produtos.imprimeLista();
        
        System.out.println("\nElemento removido: "+ produtos.removerNoIndice(1) +"\n");
        
        produtos.addInicio(new Produto("Torta Recomeco", 50.90));
        produtos.addFinal(new Produto("Salgadinho Prologo", 5.60));
        
        produtos.imprimeLista();
    }
}
