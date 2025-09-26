class No<T>{

    private T dado;
    private No<T> proxNo;

    // CONSTRUTORES

    public No(T dado, No<T> proxNo){
        this.dado = dado;
        this.proxNo = proxNo;
    }

    public No(T dado){
        this(dado, null);
    }

    // GETTERS

    public T getDado(){
        return this.dado;
    }

    public No<T> getProxNo(){
        return this.proxNo;
    }

    // SETTERS

    public void setDado(T dado){
        this.dado = dado;
        return;
    }

    public void setProxNo(No<T> proxNo){
        this.proxNo = proxNo;
        return;
    }

}