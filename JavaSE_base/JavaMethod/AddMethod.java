package JavaMethod;

public class AddMethod {
    public static void main(String[] args) {
        // 实参
        int sum=add(5,6);
        System.out.println(sum);
    }
    //方法头 修饰符 返回值类型 方法名 形式参数
    public static int add(int a,int b){
        return a+b;
    }
}
