interface phone {
    String name = "Iphone";
    String brand = "Apple";

    void model();

}

public class newinterface implements phone {
    public static void main(String[] args) {
        System.out.println("Name as defined in interface "+ name);
        System.out.println("Brand as defined in interface"+ brand);
        newinterface n =new newinterface();
        n.model();
    }

    @Override
    public void model() {
        System.out.println("An apple iphone");

    }
}
