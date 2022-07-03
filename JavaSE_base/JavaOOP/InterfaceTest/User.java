package JavaOOP.InterfaceTest;
//interface定义的关键字,接口都需要实现类
public interface User {
    public  static final int age =99;//接口里的出属性默认是常量。
    public abstract void add(int a,int b);//默认为 public abstract
    void delete(int a,int b);
    void update(String name);
    void inquiry(String name);
}
