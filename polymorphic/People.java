package polymorphic;

/**
 * @Author: 19261
 * @Date: 2021/9/12 12:19
 */
public class People {
    public String name;
    public int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void introduce(){
        System.out.println(name+"今年"+age+"岁了！");
    }
}
