package objectClass;

/**
 * @Author: 19261
 * @Date: 2021/9/5 19:11
 */
public class Computer{
    public int id;
    private static String cpu;
    public String memory;
    //实例代码块
    {
        this.id=333;
        this.memory="50G";
        this.cpu="MAR20";
        System.out.println("执行实例代码块");
    }
    //static代码块
    static{
        cpu="NULL";
        System.out.println("执行static代码块");
    }
    public Computer() {
        id=123;
        cpu="MAR";
        memory="100G";
    }
    public void show(){
        System.out.println(id);
        this.replace("MMM");
    }
    public static void replace(String s){
        //this.id=n;
        cpu=s;
        System.out.println(cpu);
    }
    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\''+
                '}';
    }
}
