package JavaOOP.InterfaceTest;
//类可以实现implement接口
//一个类可以实现多个接口，多继承
public class UserImplement implements User,TimeCal {
    @Override
    public void timeCal(int a) {
        int b=0;
        for (int i=0;i<a;i++){
            b++;
        }
        System.out.println("总时长为："+b);
    }

    @Override
    public void add(int a, int b) {
        int sum;
        sum=a+b;
        System.out.println("加法结果为："+sum);
    }

    @Override
    public void delete(int a, int b) {
        int res=a-b;
        System.out.println("减法结果为"+res);
    }

    @Override
    public void update(String name) {
        System.out.println("上传字符串为："+name);
    }

    @Override
    public void inquiry(String name) {
        System.out.println("输入的问题为："+name);
    }
}

