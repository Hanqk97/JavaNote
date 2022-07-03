package JavaLoop;

public class DoWhileTest {
    static int a = 0;
    static int b = 0;
    static int c = 0;
    static int d = 0;

    public static void main(String[] args) {
        while(a<0){
            a++;
            System.out.println(a);
        }
        System.out.println("--------------------------------------------------------------");
        do {
            b++;
            System.out.println(b);
        }while(b<0);
        System.out.println("--------------------------------------------------------------");
        while(c<3){
            c++;
            System.out.println(c);
        }
        System.out.println("--------------------------------------------------------------");
        do {
            d++;
            System.out.println(d);
        }while(d<3);


    }
}
