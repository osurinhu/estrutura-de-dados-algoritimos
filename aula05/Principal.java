public class Principal {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        
        fila.imprimeFila();

        fila.desenfileirar();

        fila.imprimeFila();


    }
}
