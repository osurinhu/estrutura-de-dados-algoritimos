public class Principal {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>("Alunos");


        lista.imprimeLista();
        
        lista.addInicio("osuru");
        lista.addInicio("kuji");
        lista.addFinal("muitolegal");
        
        lista.imprimeLista();
        lista.removerFinal();
        lista.imprimeLista();
    }
}
