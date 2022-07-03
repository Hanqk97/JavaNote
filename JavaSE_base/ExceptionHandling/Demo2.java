package ExceptionHandling;

import GroupArray.ArrayUse;

public class Demo2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
//        new Demo2().Next(a,b);
        //快捷键Ctrl+Alt+T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(0);//手动结束程序
            e.printStackTrace();//打印错误栈信息
        } finally {
        }

    }

//    public void Next (int c, int d){
//       if(d==0){throw new ArithmeticException();}//主动throw抛出异常
//        System.out.println(c/d);
//    }
//
//    public void Next(int c,int d) throws ArithmeticException{ //方法上抛出异常
//        System.out.println(c/d);
//    }

}
