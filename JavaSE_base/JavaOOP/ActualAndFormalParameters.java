package JavaOOP;

public class ActualAndFormalParameters {
    public static void main(String[] args) {
        //1,2为实际参数
        int c= add(1,2);
        System.out.println(c);
    }
    //a,b为形式参数
    public static int add(int a, int b){
        return a+b;
    }
}
