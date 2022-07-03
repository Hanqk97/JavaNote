package GroupArray;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={10,45,6546,2,3,4,55,111,111,232,111};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static int[] sort(int[] array){
        //杯子
        int c=0;
        //外部循环：判断要走几次。
        for (int i=0;i<array.length-1;i++){
            //优化：通过flag表示减少无意义的循环比较
            boolean flag=false;
            //内部循环：比较判断两个数，交换位置。
            for (int j=0;j<array.length-1-i;j++){
                if(array[j+1]>array[j]){
                   c= array[j];
                   array[j]=array[j+1];
                   array[j+1]=c;
                   flag=true;
                }
            }
            if (flag==false){break;}
        }
        return array;
    }
}
