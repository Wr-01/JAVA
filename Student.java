package genericProgram;

/**
 * @Author: 19261
 * @Date: 2021/9/22 16:42
 */
public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
