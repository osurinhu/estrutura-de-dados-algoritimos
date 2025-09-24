public class Principal {
    public static void main(String[] args) {
        

        Deque<String> deque = new Deque<String>("Dequezada");

        deque.addFinal("Teste1");

        deque.addInicio("Abra");
        deque.addInicio("Cadabra");
        deque.addInicio("Alakazan");

        deque.addFinal("finzin");

        deque.imprimeLista();

        deque.removeFim();
        deque.removeFim();

        deque.imprimeLista();

        deque.removeInicio();

        deque.imprimeLista();

    }
}
