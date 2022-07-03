package JavaOOP.ObjectClass;

public class PrivatePackage {
    //private 私有
    private String name="Distortion";
    private int id=12321;
    private String gender;

    //提供一些可以操作私有属性的方法
    //get获得私有属性
    public String getName() {
        return name;
    }
    //set 给私有属性赋值
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}
