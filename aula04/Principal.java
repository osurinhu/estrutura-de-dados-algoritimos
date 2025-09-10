public class Principal{
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");
        pilha.push("E");

        pilha.imprimePilha();

        System.out.println("#################################");
        System.out.println(pilha.peek());
        System.out.println("#################################");
        
        pilha.imprimePilha();

    }
}