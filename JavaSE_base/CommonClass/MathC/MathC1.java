package CommonClass.MathC;
public class MathC1 {
    public static void main(String[] args) {
        System.out.println(Math.PI);//输出圆周率 3.141592653589793
        System.out.println(Math.random());//生成随机数[0.0,1.0) 0.5077041881126857
        System.out.println(Math.abs(-900));//求绝对值 900
        System.out.println(Math.ceil(9.1));//向上取值 10.0
        System.out.println(Math.floor(9.9));//向下取值 9.0
        System.out.println(""+Math.round(3.4)+Math.round(3.5));//四舍五入 34
        System.out.println(Math.max(3,5));//取大的值 5
        System.out.println(Math.min(4,5));//取小的值 4
    }
}
