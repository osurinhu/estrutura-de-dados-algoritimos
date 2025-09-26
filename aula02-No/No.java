class No<T>{
	private T dado;       
	private No<T> nextNo;


	// CONSTRUTORES
	public No(T dado){
		this(dado, null);
	}

	public No(T dado, No<T> proximo){
		this.dado = dado;
		this.nextNo = proximo;
	}


	//GETTERS
	public T getDado(){
		return this.dado;
	}

	public No<T> getNextNo(){
		return this.nextNo;
	}

	//SETTERS
	public void setDado(T dado) {
		this.dado = dado;
	}

	public void setNextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Dado{" + getDado() + "}";
	}





}
