package JavaLoop;

public class ForTest1 {
    //计算0~100之间所有奇数和偶数的和

    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for (int m=1;m<=100;m+=2){
            oddSum+=m;
            }
        for (int i=0;i<=100;i+=2){
            evenSum+=i;
            }

            /**优化解法：
             * for(int i=0;i<=100;i++){
             *  if(i%2==0){
             *      evenSum+=i;
             *  }else{
             *      oddSum+=i
             *  }
             * }
             *
             */
            System.out.println("0~100的偶数和为：" + evenSum);
            System.out.println("0~100的奇数和为：" + oddSum);
        }
}


