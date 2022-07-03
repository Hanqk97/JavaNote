package JavaOOP.Polymorphic;

public class Test {
    public static void main(String[] args) {
    //一个对象的实际类型是确定的，可以指向的引用类型就不确定了

        Son s1=new Son();
        Father s2=new Son();//父类的引用指向子类的类型

        //对象能执行哪些方法主要看左边的类型，和右边关系不大。
        s2.say();//子类继承了父类的全部方法
        s1.say();//子类重写了父类的方法执行子类的方法。
        //s2.eat;不能调用eat方法，父类中没有eat方法
        ((Son)s2).eat();//强制转换成子类才可调用
    }
}
