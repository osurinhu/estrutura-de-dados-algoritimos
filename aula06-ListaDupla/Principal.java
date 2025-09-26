public class Principal {
    public static void main(String[] args) {
        
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Antonio");
        lista.addInicio("Padua");
        lista.addFinal("Rabelo");
        
        System.out.println(lista);
        
        lista.removeInicio();
        lista.removeFim();
        
        System.out.println(lista);
        
        System.out.println("add pedro ao 0");
        lista.addIdx("pedro", 0);
        System.out.println(lista);


        System.out.println("add osuru ao 1");
        lista.addIdx("osuru", 1);
        System.out.println(lista);

        System.out.println("add kuji ao 2");
        lista.addIdx("kuji", 2);
        System.out.println(lista);
        
        System.out.println("add memes ao 2");
        lista.addIdx("memes", 2);
        System.out.println(lista);
        
        System.out.println("rm 3");
        lista.removeIdx(3);
        System.out.println(lista);

    }
}
