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
        System.out.println("Elementos da lista " + this.nomeLista);
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
    
    public void addFinal(T dado){
        if(this.ultimoNo == null){
            this.addInicio(dado);
            return;
        }
        No<T> novoNo = new No<T>(dado);
        this.ultimoNo.setProxNo(novoNo);
        this.ultimoNo = novoNo;
    }

    public void removerInicio(){
        // Caso Vazio: Não há elementos na lista
        if (this.primeiroNo == null){
            System.out.println("Lista já está vazia!");
            return;
        }

        // Afirma qual elemento será removido
        System.out.println("Primeiro elemento: " + this.primeiroNo.getDado());

        // Caso Unico Elemento: Há apenas um elemento na lista, aka: primeiro e ultimo elementos são iguais
        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            System.out.println("Lista se tornou vazia!");
            return;
        }

        // Caso Varios Elementos: Há mais que um elemento na lista
        this.primeiroNo = this.primeiroNo.getProxNo();
        System.out.println("Primeiro elemento removido!");
        return;
    }

    public void removerFinal(){
        // Caso Vazio: Não há elementos na lista
        if (this.primeiroNo == null){
            System.out.println("Lista já está vazia!");
            return;
        }

        // Afirma qual elemento será removido
        System.out.println("Ultimo elemento: " + this.ultimoNo);

        // Caso Unico Elemento: Há apenas um elemento na lista, aka: primeiro e ultimo elementos são iguais
        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            System.out.println("Lista se tornou vazia!");
            return;
        }

        //Caso Varios Elementos: Há mais que um elemento na lista
        No<T> aux = this.primeiroNo;
        while(aux.getProxNo() != this.ultimoNo){
            aux = aux.getProxNo();
        }
        aux.setProxNo(null);
        this.ultimoNo = aux;
        System.out.println("Ultimo elemento foi removido! ");
    }
}
