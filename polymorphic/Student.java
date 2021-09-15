package polymorphic;

/**
 * @Author: 19261
 * @Date: 2021/9/15 15:26
 */
public class Student extends People{
    public String grade;
    public int classNum;
    public int score;

    public Student(String name, int age, String grade, int classNum, int score) {
        super(name, age);
        this.grade = grade;
        this.classNum = classNum;
        this.score = score;
    }

    @Override
    public void introduce(){
        System.out.println(name+",今年"+grade+age+"岁,目前在"+classNum+"班!");
    }

    public void showScore(){
        System.out.println(name+"总分为："+score);
    }
}
