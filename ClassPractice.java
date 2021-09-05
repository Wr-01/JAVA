package objectClass;

/**
 * @Author: 19261
 * @Date: 2021/9/1 19:34
 */
public class ClassPractice {
    public static void main(String[] args) {
        Computer c=new Computer();
        Computer cp=new Computer();
        System.out.println(c);
        c.show();
        Computer.replace("max");
    }

    public static void main1(String[] args) {
        //对象实例化
        //对象属性初始化：通过 . 解引用操作
        //方法行为的调用：通过 . 调用该对象封装类的方法，完成某种行为
        Student s2=new Student("小白",19,90);
        s2.show();

        Dog dog1 =new Dog();
        dog1.name="小呆";
        dog1.age=1;
        dog1.breed="金毛";
        Dog dog =new Dog(3);
        dog.name="小花";
        Dog dog2 =new Dog("旺财");
        dog2.name="旺财";
        dog2.age=2;
        dog2.breed="吉娃娃";

        Dog dog3 =new Dog("迪迦",1,"边牧");
        dog3.name="迪加";
        dog3.age=1;
        dog3.breed="边牧";

        dog1.introduce();
        dog2.introduce();
        dog3.introduce();
        dog.introduce();
        dog1.eat();
        dog2.play();
        dog3.play();
        dog.play();

        Point p=new Point(1,2);
        System.out.println(p);
    }
}
