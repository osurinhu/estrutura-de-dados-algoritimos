public class ListaDupla<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(String nomeLista){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeLista = nomeLista;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString(){
        String s = "Elementos da Lista " + this.nomeLista + " de tamanho "+ this.getTamanho() +"\n";
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

    public NoDuplo<T> getNoIdx(int idx){
        if (idx > this.tamanho || idx < 0){
            System.out.println("A posição " + idx + " é invalida!");
            return null;
        }

        NoDuplo<T> aux; 
        // Começo ao fim
        if (idx >= this.tamanho/2){
            aux = this.primeiroNo;
            while(aux.getIndice() != idx){
                aux = aux.getProximoNo();
            }
        }
        // Fim ao começo
        else{
            aux = this.ultimoNo;
            while(aux.getIndice() != idx){
                aux = aux.getAnteriorNo();
            }
        }
        return aux;
    }

    public T getDadoIdx(int idx){
        return this.getNoIdx(idx).getDado();
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

    public void addIdx(T dado, int idx){
        if (idx == 0){
            this.addInicio(dado);
            return;
        }
        if (idx == this.tamanho){
            this.addFinal(dado);
            return;
        }

        NoDuplo<T> aux = this.getNoIdx(idx);

        NoDuplo<T> novoNo = new NoDuplo<T>(dado, idx);
        aux.incrementaProxIdx();

        // Set prox e ante do novoNo
        novoNo.setAnteriorNo(aux.getAnteriorNo());
        novoNo.setProximoNo(aux);

        aux.getAnteriorNo().setProximoNo(novoNo);
        aux.setAnteriorNo(novoNo);

        this.tamanho++;
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

    public T removeIdx(int idx){
        if (idx == this.getTamanho() || idx < 0){
            System.out.println("A posição " + idx + " é invalida!");
            return null;
        }

        
        
        if (idx == 0){
            return this.removeInicio();
        }

        if (idx == this.getTamanho()-1){
            return removeFim();
        }

        NoDuplo<T> aux = this.getNoIdx(idx);
        
        T dadoTemp = aux.getDado();

        aux.decrementaProxIdx();
        
        aux.getProximoNo().setAnteriorNo(aux.getAnteriorNo());
        aux.getProximoNo().setProximoNo(aux.getProximoNo());
        

        this.tamanho--;

        return dadoTemp;
    }








}

