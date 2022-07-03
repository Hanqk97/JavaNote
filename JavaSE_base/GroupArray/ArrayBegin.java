package GroupArray;

public class ArrayBegin {
//计算数组各元素之和并输出各个值
    static int[] num1={1,2,3,4,5,6,7,8,9,10,11};
    static double sum=0;

    public static void main(String[] args) {
        for (int i = 0; i < num1.length; i++){
            System.out.println("数组的第"+i+"个数为"+num1[i]);
            sum+=num1[i];
        }
        System.out.println("这个数字的所有元素之和为:"+sum);
        double max = num1[0];
        for (int i = 1; i < num1.length; i++) {
            if (num1[i] > max) max =num1[i];
        }
        System.out.println("Max is " + max);
    }
}
