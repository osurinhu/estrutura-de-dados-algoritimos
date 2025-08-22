class Lista<T>{

    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    
    public Lista(){
        this("Lista");
    }
    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void imprimeLista(){
        if (primeiroNo == null){
            System.out.println("Lista vazia!");
            return;
        }

        No<T> cursor = this.primeiroNo;
        while(cursor != null){
            System.out.println(cursor.getDado());
            cursor = cursor.getProxNo();
        }

    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(this.primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        }
        else{
            novoNo.setProxNo(this.primeiroNo);
            this.primeiroNo = novoNo;
        }
    }
    
    public void addFim(T dado){
        if(this.ultimoNo == null){
            this.addInicio(dado);
            return;
        }
        No<T> novoNo = new No<T>(dado);
        this.ultimoNo.setProxNo(novoNo);
        this.ultimoNo = novoNo;
    }



}