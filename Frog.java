package abstractInterface;

/**
 * @Author: 19261
 * @Date: 2021/9/17 15:13
 */
public class Frog extends Animal implements IAmphibious{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name+"正在双脚跳！");
    }

    @Override
    public void swim() {
        System.out.println(name+"正在蛙泳！");
    }
}
//public class frog extends Animal implements IRunning,ISwimming{
//    public frog(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(name+"正在双脚跑！");
//    }
//
//    @Override
//    public void swim() {
//        System.out.println(name+"正在游泳！");
//    }
//}