package GroupArray;

public class ArrayUse {
    public static void main(String[] args) {
        int[] a={1,2,3,45,6,78,6};
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();
        printArray(a);

        System.out.println();
        printArray((reverse(a)));

    }
    public static void printArray(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print("b"+a[i]+" ");
        }
    }
    public static int[] reverse(int[] a){
        int[] result= new int[a.length];
        for (int i=0, j=result.length-1;i<a.length;i++,j--){
            result[j]=a[i];
        }
        return result;
    }//反转数组
}
