package GroupArray;

import java.util.Arrays;

public class ArraysType {
    public static void main(String[] args) {
        int[] a={1,2,3,4,10,9,11,1,3,56,64};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,56));//二分法查找特定数字的序号
        Arrays.fill(a,4);//赋值
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(a,a));//比较数组数值是否相等
    }
}
