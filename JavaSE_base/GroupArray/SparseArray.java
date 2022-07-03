package GroupArray;

public class SparseArray {
    public static void main(String[] args) {
        // 创建一个二维数组11*11 0：没有棋子；1：黑棋；2：白棋
        int[][] array=new int[9][9];
        array[1][2]=1;
        array[2][3]=2;
        array[7][3]=2;
        array[8][2]=1;
        Orign1(array);//输出原始数据
        System.out.println("------------------------------------------------------------------");
        System.out.println("数组中有效数字个数为："+NumVal(array));
        System.out.println("------------------------------------------------------------------");
        Last1(Sparse(array,NumVal(array)));
    }
    public static void Orign1(int[][] a){
        //输出原始数据
        System.out.println("原始数据：");
        for (int[] ints:a) {
            for (int intSingle : ints) {
                System.out.print(intSingle + "\t");
            }
            System.out.println();
        }
    }
    public static int NumVal(int[][] b){
        //计算有效值的个数
        int sum=0;
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                if (b[i][j]!=0){
                    sum++;
                }
            }
        }
        return sum;
    }
    //创建稀疏数组
    public static  int[][] Sparse(int[][] c,int d){
        int[][] s= new int[d+1][3];
        s[0][0]=c.length;
        s[0][1]=c[0].length;
        s[0][2]=d;
        // 遍历二维数组将特殊值存放入稀疏数组
        int count=0;
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c[i].length;j++){
                if (c[i][j]!=0){
                    count++;
                    s[count][0]=i;
                    s[count][1]=j;
                    s[count][2]=c[i][j];
                }
            }
        }
        return s;
    }

    public static void Last1(int[][] a){
        //输出稀疏数组
        System.out.println("稀疏数组：");
        for (int[] ints:a) {
            for (int intSingle : ints) {
                System.out.print(intSingle + "\t");
            }
            System.out.println();
        }
    }
}
