class No<T>{
	private T dado;       
	private No<T> nextNo;

	public No(T dado){
		this(dado, null);
	}

	public No(T dado, No<T> no){
		this.dado = dado;
		this.nextNo = no;
	}

	public T getDado(){
		return this.dado;
	}

	public No<T> getNextNo(){
		return this.nextNo;
	}

	//FALTA PARTE DOS GETSET



}
