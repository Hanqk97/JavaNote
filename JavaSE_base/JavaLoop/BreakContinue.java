package JavaLoop;

public class BreakContinue {
    public static void main(String[] args) {
        int i= 0;
        int m =0;
        while(i<100){
            if(i%10==0) {
                System.out.print(i+" ");
            }
            if(i==30){ break; }
            i++;
        }
        System.out.println("\n"+"--------------------------------------------------------------");
        while(m<100){
            if(m%10==0) {
               System.out.print(m +" ");
            }
            m++;//
            if(m==30){ continue; }
            }
        }
}
