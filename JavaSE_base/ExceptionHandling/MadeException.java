package ExceptionHandling;
//自定义异常
public class MadeException extends Exception{
    //传递数字小于10
    int wrong =10;

    public MadeException(int wrong) {
        this.wrong = wrong;
    }
    //toString:异常的打印信息
    @Override
    public String toString() {
        return "MadeException{" + "wrong=" + wrong + '}';
    }
}
