package GroupArray;

public class ArrayBegin2 {
    public static void main(String[] args) {
        //静态初始化
        int[] a={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<a.length;i++){
            System.out.println("group a"+i+" th is "+a[i]);
        }
        //动态初始化
        int b[]= new int[9];
        b[0]=1;
        b[1]=2;
        b[2]=3;
        b[3]=4;
        b[4]=5;
        b[5]=6;
        b[6]=7;
        b[7]=8;
        b[8]=9;
        for (int i=0;i<b.length;i++){
            System.out.println("group b"+i+" th is "+b[i]);
        }
        System.out.println(b[9]);
    }
}
