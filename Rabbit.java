package abstractInterface;

/**
 * @Author: 19261
 * @Date: 2021/9/17 15:12
 */
public class Rabbit extends Animal implements IRunning{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name+"正在蹦蹦跳跳！");
    }
}
