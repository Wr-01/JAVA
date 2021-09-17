package abstractInterface;

/**
 * @Author: 19261
 * @Date: 2021/9/17 15:31
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1=new Duck("鸭子",2);
        System.out.println(animal1.toString());
        Duck duck=(Duck) animal1;
        duck.fly();
        System.out.println("=================================");
        Frog frog=new Frog("青蛙");
        frog.swim();
        System.out.println("=================================");
        Rabbit rabbit=new Rabbit("兔兔");
        rabbit.run();
    }
}
