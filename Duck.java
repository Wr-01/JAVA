package abstractInterface;

/**
 * @Author: 19261
 * @Date: 2021/9/17 15:22
 */
public class Duck extends Animal implements IRunning,ISwimming,IFlying{
    public int age;

    public Duck(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println(name+"正在飞！");
    }

    @Override
    public void run() {
        System.out.println(name+"正在慢慢跑！");
    }

    @Override
    public void swim() {
        System.out.println(name+"在湖里游！");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
