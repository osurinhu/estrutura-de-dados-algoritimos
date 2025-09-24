public class Deque<T> {

    private String nomeDeque;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanho;

    public Deque(String nomeDeque){
        this.nomeDeque = nomeDeque;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }
    
    @Override
    public String toString(){
        String s = "Elementos do Deque " + this.nomeDeque + " de tamanho "+ this.tamanho +"\n";
        NoDuplo<T> aux = this.primeiroNo;
        while (aux != null){
            s += " " + aux + "\n";
            aux = aux.getProximoNo();
        }
        return s;
    }

    public void imprimeLista(){
        System.out.println(this);
        return;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
        
        this.tamanho++;

        // Lista vazia
        if (this.primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }
        
        //Pelo menos um
        this.primeiroNo.incrementaProxIdx(); 

        novoNo.setProximoNo(this.primeiroNo);
        this.primeiroNo.setAnteriorNo(novoNo);
        this.primeiroNo = novoNo;

        return;
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, this.tamanho);
        
        this.tamanho++;
        // Lista vazia
        if (this.primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }

        // Pelo menos um
        novoNo.setAnteriorNo(this.ultimoNo);
        this.ultimoNo.setProximoNo(novoNo);
        this.ultimoNo = novoNo;
        
    }

    
    public T removeInicio(){
        if(this.primeiroNo == null){
            System.out.println("Lista já esta vazia");
            return null;
        }

        T dadoTemp = this.primeiroNo.getDado();

        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            return dadoTemp;
        }

        this.primeiroNo.getProximoNo().setAnteriorNo(null);
        this.primeiroNo = this.primeiroNo.getProximoNo();

        this.primeiroNo.decrementaProxIdx();
        
        this.tamanho--;

        return dadoTemp;
    }

    public T removeFim(){
        if(this.ultimoNo == null){
            System.out.println("Lista já esta vazia");
            return null;
        }

        this.tamanho--;

        T dadoTemp = this.primeiroNo.getDado();

        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            return dadoTemp;
        }

        this.ultimoNo.getAnteriorNo().setProximoNo(null);
        this.ultimoNo = this.ultimoNo.getAnteriorNo();
        
        return dadoTemp;
    }

}
