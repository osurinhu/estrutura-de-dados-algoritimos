public class PrincipalF {
    public static void main(String[] args) {
        
        Fila<String> alunos = new Fila<String>("Alunos");

        alunos.add("Antonio");
        alunos.add("Padua");
        alunos.add("Rabelo");
        
        alunos.imprimeFila();
        
        System.out.println("\nElemento removido: " +alunos.pop()+"\n");
        
        alunos.add("Almeida");
        alunos.add("Silva");
        
        alunos.imprimeFila();
    }
}
