import java.util.ArrayList;
class Principal{
	public static void main(String[] args){
		ArrayList<Pessoa> pessoal = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("carlos", 21); 
		Pessoa p2 = new Pessoa("pedro", 45);
		Pessoa p3 = new Pessoa("santo", 23);

		pessoal.add(p1);
		pessoal.add(p2);
		pessoal.add(p3);

		for (Pessoa i: pessoal){
			System.out.println(i);
		}


		p1.setNome("Teste");

		for (Pessoa i: pessoal){
			System.out.println(i);
		}

	/*	
		ArrayList<Pessoa> pessoal = new ArrayList<Pessoa>();

		pessoal.add(new Pessoa("carlos", 21));
		pessoal.add(new Pessoa("pedro", 35));
		pessoal.add(new Pessoa("santo",23));

		for (Pessoa i: pessoal){
			System.out.println(i);
		}
		
		pessoal.get(1).setNome("TESTE");

		for (Pessoa i: pessoal){
			System.out.println(i);
		}
	*/

	}
}

