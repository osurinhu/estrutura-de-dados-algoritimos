public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> proximoNo; 
    private NoDuplo<T> anteriorNo;
    private int indice;
    
    public NoDuplo(T dado, int indice){
        this.dado = dado;
        this.indice = indice;
        this.proximoNo = null;
        this.anteriorNo = null;
    }

    // GETTERS

    public T getDado() {
        return dado;
    }
    
    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }
    
    public NoDuplo<T> getAnteriorNo() {
        return anteriorNo;
    }
    
    public int getIndice() {
        return indice;
    }
    
    // SETTERS

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo) {
        this.anteriorNo = anteriorNo;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    // TO STRING
    @Override
    public String toString(){
        String s = "{Indice: " + getIndice() + " Dado: " + getDado();

        if (getAnteriorNo() != null){
            s += " Ante: " + getAnteriorNo().getDado();
        }
        if (getProximoNo() != null){
            s += " Prox: " + getProximoNo().getDado();
        }
        s += "}";
        return s;
    }

    // UTIL
    public void incrementaIdx(){
        this.indice ++;
    }

    public void incrementaProxIdx(){
        NoDuplo<T> aux = this;
        while (aux != null) {
            aux.incrementaIdx();
            aux = aux.getProximoNo();
        }
        return;
    }

    public void decrementaIdx(){
        this.indice--;
    }
    public void decrementaProxIdx(){
        NoDuplo<T> aux = this;
        while (aux != null) {
            aux.decrementaIdx();
            aux = aux.getProximoNo();
        }
        return;
    }
}