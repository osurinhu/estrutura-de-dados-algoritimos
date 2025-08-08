public class Principal{
    public static void main(String[] args){

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Joaquim", 1);
        Pessoa obj3 = new Pessoa("Cecilia", 2, 777777l);
        
        System.out.println(obj3.toString());

    
    }

}