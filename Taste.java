public class Taste {
    public static void main(String[] args) {
        Fruit m = new Mango(.75);
        m.taste();
        Mango t = (Mango) m;
        t.pulp(); 
        // ((Mango) m).pulp(); 


    }
}
