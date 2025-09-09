public class PrincipalP {
    public static void main(String[] args) {
        
        Pilha<String> linguagens = new Pilha<String>("Linguagens");

        linguagens.push("Java");
        linguagens.push("C");
        linguagens.push("Lua");
        
        linguagens.imprimePilha();
        
        System.out.println("\nElemento removido: "+linguagens.pop() + "\n");

        linguagens.push("Python");
        linguagens.push("JavaScript");

        linguagens.imprimePilha();
 
    }
}
