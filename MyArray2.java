package genericProgram;

/**
 * @Author: 19261
 * @Date: 2021/9/22 13:17
 */
//Java泛型编程<E> / <E extends 类名>:表示泛型类型边界是该类或者该类的子类
// 通配符：？ / ？extends 上界类：表示类型只能是上界类或者上界类的子类；
// 通配符： ？super 下界类：表示类型只能是下界类或者下界类的父类；
public class MyArray2<E extends Person> {
    private E[] data=null;
    private int size;
    private final int capacity=10 ;

    public MyArray2(){
        data = (E[]) new Person[capacity];
        size=0;
    }
    public void add(E data){
        if(size>= capacity){
            return ;
        }
        this.data[size++]=data;
    }
    public E get(int i){
        if(size<i){
            return null;
        }
        return data[i];
    }

    public static void main(String[] args) {
        MyArray2<Student> a=new MyArray2<>();
        a.add(new Student("王明",18));
        a.add(new Student("王一",18));
        Student s=(Student) a.get(1);
        System.out.println(s.toString());


//        MyArray2 <Integer>arr=new MyArray2();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        System.out.println(arr.get(0));
    }
}
