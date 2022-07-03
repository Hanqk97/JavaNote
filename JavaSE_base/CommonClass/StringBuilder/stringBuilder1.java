package CommonClass.StringBuilder;

public class stringBuilder1 {
    public static void main(String[] args) {
        //创建StringBuilder的对象
        StringBuilder s1=new StringBuilder();
        //表面上调用StringBuilder的空构造器，实际底层是对value数组进行初始化，长度为16
        StringBuilder s2=new StringBuilder(3);
        //表面上调用StringBuilder的有参构造器，传入一个int类型的数，实际底层是对value数组进行初始化，长度为传入的数字
        StringBuilder s3=new StringBuilder("abc");
        //表面上调用StringBuilder的有参构造器，传入一个字符串，实际底层是对value数组进行初始化，并将字符串按字符添加进字符数组，count记录已被使用的的字符数组空间个数
        s3.append("def").append("ghy").append("poi");//当加入字符超过初始值时会自动左移一位扩容（原数*2+2），链式调用：可以不断添加
    }
}
