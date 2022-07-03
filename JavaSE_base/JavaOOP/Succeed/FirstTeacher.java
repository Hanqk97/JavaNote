package JavaOOP.Succeed;
// SucceedFirst 子类2
public class FirstTeacher extends SucceedFirst{
    public FirstTeacher(){
        System.out.println("调用了子类无参构造");
    }
    private String name ="tor";
    public void test(String name){
        System.out.print(name);//输入的name
        System.out.print(this.name);//子类的name
        System.out.println(super.name);//父类的name
    }
}
