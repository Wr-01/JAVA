package objectClass;

/**
 * @Author: 19261
 * @Date: 2021/9/4 13:22
 */
public class Point {
    public int x;
    public int y;


        //相当于没有参数的构造方法，也是在new 创建对象时自动调用
    {
        x=0;
        y=1;
    }
    public Point(int x){
        this.x=x;
    }
    //构造方法在默认初始化和代码块初始化之后执行的初始化
    public Point(int x,int y){
        //当形参和类成员属性名字相同时，使用Java中的this 指向对象的该属性
        this.x=x;
        // 通过this调用它自身构造方法
        //this(x);
        this.y=y;
    }
    void show(){
        System.out.println("点("+x+","+y+")");
    }

//    public String toString(){
//        return "点("+this.x+","+this.y+")";
//    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
