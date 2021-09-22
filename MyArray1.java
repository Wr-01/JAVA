package genericProgram;

/**
 * @Author: 19261
 * @Date: 2021/9/21 16:33
 */
//Object超父类实现泛型编程：
public class MyArray1 {
    private Object[] arr;
    private int size=0;
    private int capacity=10;

    public void add(Object arr){
        if(size>=capacity){
            return;
        }
        this.arr[size++]=arr;
    }

    public Object get(int i){
        return arr[i];
    }

    public static void main(String[] args) {
        MyArray1 arr1=new MyArray1();
        arr1.add(new Person("z",18));
        arr1.add(new Person("w",19));
        arr1.add(new Person("r",20));

        Person p1=(Person) arr1.get(0);
        Person p2=(Person) arr1.get(1);
        Person p3=(Person) arr1.get(2);

        MyArray1 arr2=new MyArray1();
        arr2.add(1);
        arr2.add(2);

        MyArray1 arr3=new MyArray1();
        arr3.add("we");
        arr3.add("are");
    }
}
