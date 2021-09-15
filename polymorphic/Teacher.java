package polymorphic;

/**
 * @Author: 19261
 * @Date: 2021/9/12 12:22
 */
public class Teacher extends People{
    public String teach;
    private int wages;

    public Teacher(String name, int age, String teach, int wages) {
        super(name, age);
        this.teach = teach;
        this.wages = wages;
    }

    @Override
    public void introduce(){
        System.out.println(name+"是一个"+teach+"老师，今年"+age+"岁！");
    }

    public void showWages(){
        System.out.println(name+"老师的基本工资为："+wages);
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", wages=" + wages +
//                '}';
//    }
}
