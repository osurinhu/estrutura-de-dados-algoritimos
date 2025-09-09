public class NoDuplo<T> {


    private T dado;
    private NoDuplo<T> proxNo;
    private NoDuplo<T> anteNo;

    // CONSTRUTORES

    public NoDuplo(T dado, NoDuplo<T> proxNo, NoDuplo<T> anteNo){
        this.dado = dado;
        this.proxNo = proxNo;
        this.anteNo = proxNo;
    }

    public NoDuplo(T dado){
        this(dado, null, null);
    }

    // GETTERS

    public T getDado(){
        return this.dado;
    }

    public NoDuplo<T> getProxNo(){
        return this.proxNo;
    }

    public NoDuplo<T> getAnteNo(){
        return this.anteNo;
    }

    // SETTERS

    public void setDado(T dado){
        this.dado = dado;
        return;
    }

    public void setProxNo(NoDuplo<T> proxNo){
        this.proxNo = proxNo;
        return;
    }

    public void setAnteNo(NoDuplo<T> anteNo){
        this.anteNo = anteNo;
        return;
    }


}
