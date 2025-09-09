class Lista<T>{

    private String nomeLista;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    
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

        NoDuplo<T> cursor = this.primeiroNo;
        while(cursor != null){
            System.out.println(cursor.getDado());
            cursor = cursor.getProxNo();
        }

    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        // Lista vazia
        if(this.primeiroNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }

        // Pelo menos 1 elemento
        novoNo.setProxNo(this.primeiroNo);
        this.primeiroNo.setAnteNo(novoNo);
        this.primeiroNo = novoNo;
        return;

    }
    
    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        // Lista vazia
        if(this.ultimoNo == null){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }

        // Pelo menos 1 elemento
        novoNo.setAnteNo(this.ultimoNo);
        this.ultimoNo.setProxNo(novoNo);
        this.ultimoNo = novoNo;
    }

    public void addNoIndice(T dado, int indice){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (this.primeiroNo == null){
            if (indice != 0){
                System.out.println("Indice maior que a lista! Elemento não pode ser adicionado.");
                return;
            }
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
            return;
        }
        if (indice == 0){
            this.addInicio(dado);
            return;
        }

        NoDuplo<T> aux = this.primeiroNo.getProxNo();
        for(int i = 1; i>=indice; i++){
            if (i == indice){
                aux.getAnteNo().setProxNo(novoNo);
                novoNo.setAnteNo(aux.getAnteNo());
                aux.setAnteNo(novoNo);
                novoNo.setProxNo(aux);
                return;
            }

            if (aux.getProxNo()==null){
                if((i+1)==indice){
                    this.addFinal(dado);
                    return;
                }
                System.out.println("Indice maior que a lista! Elemento não pode ser adicionado.");
                return;
            }
            aux = aux.getProxNo();
        }
    }

    public T removerNoIndice(int indice){
        if (this.primeiroNo == null){
            System.out.println("Lista vazia! Elemento não pode ser removido.");
            return null;
        }

        if (this.primeiroNo == this.ultimoNo){
            if (indice != 0){
                System.out.println("Indice maior que a lista! Elemento não pode ser removido.");
                return null;
            }
            this.primeiroNo = null;
            this.ultimoNo = null;
        }

        if (indice == 0){
            return this.removerInicio();
        }

        NoDuplo<T> aux = this.primeiroNo.getProxNo();
        for(int i = 1; i>=indice; i++){
            if (i == indice){
                T dadoTemp = aux.getDado();
                aux.getAnteNo().setProxNo(aux.getProxNo());
                aux.getProxNo().setAnteNo(aux.getAnteNo());
                return dadoTemp;
            }

            if (aux.getProxNo()==null){
                System.out.println("Indice maior que a lista! Elemento não pode ser removido.");
                return null;
            }
            aux = aux.getProxNo();
        }
        return null;
    }

    public T removerInicio(){
        // Caso Vazio: Não há elementos na lista
        if (this.primeiroNo == null){
            System.out.println("Lista já está vazia!");
            return null;
        }

        // Afirma qual elemento será removido
        T dadoTemp = this.primeiroNo.getDado();
        System.out.println("Primeiro elemento: " + dadoTemp);


        // Caso Unico Elemento: Há apenas um elemento na lista, aka: primeiro e ultimo elementos são iguais
        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            System.out.println("Lista se tornou vazia!");
            return dadoTemp;
        }

        // Caso Varios Elementos: Há mais que um elemento na lista
        this.primeiroNo = this.primeiroNo.getProxNo();
        this.primeiroNo.setAnteNo(null);
        System.out.println("Primeiro elemento removido!");
        return dadoTemp;
    }

    public T removerFinal(){
        // Caso Vazio: Não há elementos na lista
        if (this.primeiroNo == null){
            System.out.println("Lista já está vazia!");
            return null;
        }

        // Afirma qual elemento será removido
        T dadoTemp = this.ultimoNo.getDado();
        System.out.println("Ultimo elemento: " + dadoTemp);

        // Caso Unico Elemento: Há apenas um elemento na lista, aka: primeiro e ultimo elementos são iguais
        if (this.primeiroNo == this.ultimoNo){
            this.primeiroNo = null;
            this.ultimoNo = null;
            System.out.println("Lista se tornou vazia!");
            return dadoTemp; 
        }

        //Caso Varios Elementos: Há mais que um elemento na lista
        this.ultimoNo = this.ultimoNo.getAnteNo();
        this.ultimoNo.setProxNo(null);
        System.out.println("Ultimo elemento foi removido! ");
        return dadoTemp;
    }
}
