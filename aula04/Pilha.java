public class Pilha<T>{

    private No<T> topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado){
        this.topo = new No<T>(dado, this.topo);
        return;
    }

    public void imprimePilha(){
        No<T> aux = this.topo;
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getProxNo();
        }
    }

    public T pop(){
        if (this.topo == null){
            System.out.println("Pilha vazia");
            return null;
        }

        T dadoTemp = this.topo.getDado();
        this.topo = this.topo.getProxNo();
        return dadoTemp;
    }

}