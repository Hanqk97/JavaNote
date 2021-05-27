package JavaLoop;

public class ForTest2 {
    //用for循环输出1~1000之间能被5整除的数并且每行输出3个
    public static void main(String[] args) {
        int m=0;
        for (int i=0;i<=1000;i++){
            if (i%5==0){
                System.out.print(i);
                if(m<2){
                    System.out.print(" ");
                    m++;
                }else{
                    System.out.print("\n");
                    m=0;

                }
                }
            }
        }
    }
/**参考答案
 * for(int i=0;i<=1000;i++){
 *     if(i%5==0&& i>0){
 *       System.out.print(i+"\t");
 *     }
 *     if(i%(5*3)==0){
 *        System.out.print("\n"); or System.out.println();
 *     }
 * }
 */
