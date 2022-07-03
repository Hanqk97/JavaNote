package JavaOOP.In_Out;

public class Out {
    private int id=3150;
    public void outer(){
        System.out.println("This is outer.");
    }
    public class inner{
        public void in(){
            System.out.println("This is inner.");
        }
        public void getId(){
            System.out.println(id);//获得外部类私有属性
        }
    }
}
