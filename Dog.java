package objectClass;

/**
 * @Author: 19261
 * @Date: 2021/9/3 17:07
 */
//通过创建特定的类，表示实际的对象特征；
public class Dog {
    //属性
    public String name; //属性1：名字
    public int age;     //属性2：年龄
    public String breed;//属性3：品种

    //构造方法
    public Dog(){
        name="小狗";
        age=2;
        breed = "中华田园猫";
    }
    public Dog(String n){
        name=n;
    }
    public Dog(int a){
        age=a;
    }
    public Dog(String n, int a) {
        name=n;
        age=a;
    }
    public Dog(String n,int a,String b){
        name=n;
        age=a;
        breed=b;
    }

    //方法/行为
    public void eat() {
        System.out.println(name + "正在吃饭!");
    }

    public void play() {
        System.out.println(name + "正在玩耍！");
    }

    public void introduce() {
        System.out.println(name + "是" + breed + "品种," + "今年" + age + "岁了！");
    }
}
class Student{
    //成员/属性
    private final int score; //private
    public String name;      //public
    int age;                 //default

    //构造方法
    public Student(){
        name="小明";
        age=18;
        score=60;
    }
    public Student(String n,int a,int s){
        name=n;
        age=a;
        score=s;
    }
    public void show(){
        System.out.println(name+" "+age+" "+score);
    }
}