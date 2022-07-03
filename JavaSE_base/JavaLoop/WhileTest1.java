package JavaLoop;

public class WhileTest1 {
    public static void main(String[] args) {
        //计算1+2+...+100
        int i = 0;
        int sum = 0;
        while(i<101){
            sum=sum+i;
            i++;
            System.out.println(i);
        }
        System.out.println("1+2+...+100="+sum);
    }

}
