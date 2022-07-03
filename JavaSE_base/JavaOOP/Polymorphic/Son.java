package JavaOOP.Polymorphic;

public class Son extends Father {
    @Override
    public void say() {
        System.out.println("Son said something.");
    }
    public void eat(){
        System.out.println("Son ate something.");
    }
}
