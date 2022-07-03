package GroupArray;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4,5}, {5,7, 6}, {7, 8}};
        printArray(array[0]);
//        System.out.println("\n" + "---------------------------------");
////        for (int x = 0; x < array.length; x++) {
//           for (int y = 0; 0 < array[x].length; y++) {
//                System.out.print(array[x][y]);
//                }
//            }
        System.out.println("-------------------------------------");
        for (int[] i : array) {
            for (int k : i) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
