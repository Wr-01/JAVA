package polymorphic;

/**
 * @Author: 19261
 * @Date: 2021/9/12 12:21
 */
public class Main {
    public static void main(String[] args) {
        People[] people={new Teacher("赵六",45,"数值分析",6000),
                new Student("张三",16,"高一",1,500)};
        for (People people1:people){
            people1.introduce();
        }
    }
    public static void main3(String[] args) {
        Teacher teacher=new Teacher("赵六",45,"数值分析",7000);
        People people=(People) teacher;
        teacher=(Teacher) people;
        people=(People) teacher;
        teacher=(Teacher) people;
        teacher.showWages();
        System.out.println(teacher.toString());
        people=(People) teacher;
        teacher=(Teacher) people;
        people=(People) teacher;
        people.introduce();
        System.out.println(people.toString());
        People p=new People("小明",20);
        System.out.println(p.toString());
    }

    public static void main2(String[] args) {
        Student student=new Student("张三",16,"高一",1,490);
        Teacher teacher=new Teacher("李四",40,"信息安全",6000);
        //向上转型
        introduce(teacher);
        People people=(People) student;
        people.introduce();
        //向下转型
        student=(Student) people;
        student.showScore();
    }
    public static void introduce(People people){
        people.introduce();
    }

    public static People transform(Teacher teacher){
        return teacher;
    }
    public static void main1(String[] args) {
        Teacher teacher=new Teacher("于帆",48,"计算机网络",8000);
        People people=transform(teacher);
        people.introduce();
        introduce((teacher));
        people=(People) teacher;
        people.introduce();

    }
}
