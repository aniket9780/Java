abstract class Dog{
        public void bark(){
        System.out.println("Bark");
    }
    public abstract void eat();
}
class Husky extends Dog{

    @Override
    public void eat() {
        System.out.println("EAT");
    }
}

public class newabstract {

    public static void main(String[] args){
        Husky h = new Husky();
        h.bark();
        h.eat();
        }

    }

