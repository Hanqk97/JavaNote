package JavaOOP.InterfaceTest;

public class Application {
    public static void main(String[] args) {
        System.out.println("age:"+User.age);
        UserImplement userImplement=new UserImplement();
        userImplement.add(3,4);
        userImplement.timeCal(57);
        userImplement.delete(10000,4354);
        userImplement.update("V");
        userImplement.inquiry("How long?");
    }
}
