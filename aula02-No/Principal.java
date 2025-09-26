public class Principal{
    public static void main(String[] args) {
        No<String> obj1 = new No<String>("Chihiro");
        No<String> obj2 = new No<String>("Samura");
        No<String> obj3 = new No<String>("Hiruhiko");
        No<String> obj4 = new No<String>("Uruha");

        //System.out.println("Objetos: "+ obj1 + " " + obj2 + " " + obj3 + " " + obj4);

        obj1.setNextNo(obj2);
        obj2.setNextNo(obj3);
        obj3.setNextNo(obj4);
        
        No<String> objLegal = obj1;
        while(objLegal != null){
            System.out.println(objLegal);
            objLegal = objLegal.getNextNo();
        }
    
    
    }
}