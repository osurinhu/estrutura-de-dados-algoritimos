public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public String getNomeFila(){
        return this.nomeFila;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if (this.ultimoNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }

        this.ultimoNo.setProxNo(novoNo);
        this.ultimoNo = novoNo;
        return;
    }

    public T desenfileirar(){
        if (this.primeiroNo == null){
            return null;
        }
        T dadoTemp = this.primeiroNo.getDado();
        this.primeiroNo = this.primeiroNo.getProxNo();
        if (this.primeiroNo == null){
            this.ultimoNo = null;
        }
        return dadoTemp;
    }

    public void imprimeFila(){
        if (this.primeiroNo == null){
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("Elementos da fila " + this.getNomeFila());
        No<T> aux = this.primeiroNo;
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getProxNo();
        }
    }
}
