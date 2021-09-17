package abstractInterface;

/**
 * @Author: 19261
 * @Date: 2021/9/17 15:10
 */
abstract public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
