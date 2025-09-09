public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    private String nomeFila;


        public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.inicio = null;
        this.fim = null;
    }

    public String getNome(){
        return this.nomeFila;
    }

    public void add(T dado){
        No<T> novoNo = new No<T>(dado);

        if (this.inicio == null){
            this.inicio = novoNo;
            this.fim = novoNo;
            return;
        }

        this.fim.setProxNo(novoNo);
        this.fim = novoNo;
        return;
    }

    public void imprimeFila(){
        System.out.println("Fila:");
        No<T> aux = this.inicio;
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getProxNo();
        }
    }

    public T pop(){    
        if (this.inicio == null){
            System.out.println("Fila Vazia!");
            return null;
        }
        
        T dadoTemp = this.inicio.getDado();

        if (this.inicio == this.fim){
            this.inicio = null;
            this.fim = null;
            return dadoTemp;
        }

        this.inicio = this.inicio.getProxNo();
        return dadoTemp;
    }



}
