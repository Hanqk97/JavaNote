package JavaOOP;

public class ObjectPassing {
    public static void main(String[] args) {
    Person person = new Person();
        System.out.println(person.name);
        ObjectPassing.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        //person是一个对象，指向Person person = new Person()，这是一个具体的对象，可以改变属性。【
        person.name="Chen";
    }
}
//定义一个Person类，有一个属性：name
class Person{ String name="Liu";}
//public static void change(Prson){}
