package JavaOOP.Succeed;

public class Application {
    public static void main(String[] args) {
        //FirstStudent继承了SucceedFirst所有的public方法
        FirstStudent firstStudent = new FirstStudent();
        firstStudent.say();
        FirstTeacher firstTeacher = new FirstTeacher();
        System.out.println(firstTeacher.money);
        //private 获取
        System.out.println("---------------------------");
        System.out.println(firstTeacher.getAge());
        System.out.println("super和this\n---------------------------");
        firstTeacher.test("Dis");
    }
}
