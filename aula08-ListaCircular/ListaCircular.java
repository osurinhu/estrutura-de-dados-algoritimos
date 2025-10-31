public class ListaCircular<T>{

private No<T> primeiroNo;
private String nomeLista;
private int tamanho;

public ListaCircular(String nomeLista){
    this.nomeLista = nomeLista;
}

public boolean listaVazia(){
    if(this.primeiroNo == null){
        return true;
    }
    return false;
}

public boolean unicoElemento(){
    if (this.listaVazia()){
        return false;
    }
    if (this.primeiroNo == this.primeiroNo.getProxNo()){
        return true;
    }
    return false;
}

public No<T> encontrarAnterior(No<T> alvo){
    No<T> aux = this.primeiroNo;
    while (aux.getProxNo() != alvo){
        aux = aux.getProxNo();
    }
    return aux;
}

// Adicionar

private boolean addListaVazia(T dado){
    if (this.listaVazia()){
        No<T> novoNo = new No<T>(dado);
        
        this.primeiroNo = novoNo;
        primeiroNo.setProxNo(primeiroNo);
        this.tamanho ++;
        return true;
    }
    return false;
}

public void addInicio(T dado){
    if (this.addListaVazia(dado)){
        return;
    }

    No<T> novoNo = new No<T>(dado);

    encontrarAnterior(this.primeiroNo).setProxNo(novoNo);
    novoNo.setProxNo(this.primeiroNo);
    this.primeiroNo = novoNo;
    this.tamanho ++;
}

public void addFinal(T dado){
    if (this.addListaVazia(dado)){
        return;
    }

    No<T> novoNo = new No<T>(dado);
    encontrarAnterior(this.primeiroNo).setProxNo(novoNo);
    novoNo.setProxNo(this.primeiroNo);
    this.tamanho++;
}

//Remover

public T removerUnicoElemento(){
    if (this.unicoElemento()){
        T dadoTemp = this.primeiroNo.getDado();
        this.primeiroNo = null;
        return dadoTemp;
    }
    return null;
}

public T removerInicio(){
    if (this.listaVazia()){
        return null;
    }

    T dadoTemp = this.removerUnicoElemento();
    if (dadoTemp != null){
        return dadoTemp;
    }

    dadoTemp = this.primeiroNo.getDado();

    this.encontrarAnterior(this.primeiroNo).setProxNo(this.primeiroNo.getProxNo());
    this.primeiroNo = primeiroNo.getProxNo();

    return dadoTemp;
}

public T removerFim(){
    if (this.listaVazia()){
        return null;
    }

    T dadoTemp = this.removerUnicoElemento();
    if (dadoTemp != null){
        return dadoTemp;
    }

    No<T> ultimoNo = this.encontrarAnterior(this.primeiroNo);
    dadoTemp = ultimoNo.getDado();
    this.encontrarAnterior(ultimoNo).setProxNo(this.primeiroNo);
    return dadoTemp;

// dia 26/09/2025
}




}