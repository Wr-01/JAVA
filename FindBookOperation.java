package books.management.operation;

import books.management.BooksList;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:43
 */
public class FindBookOperation implements IOperation{
    //查阅书籍类，实现操作接口，重写查找操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("查阅书籍：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        for(int i=0;i<booksList.getSize();i++){
//            if(name.equals(booksList.getBook(i).getName())){
//                System.out.println(booksList.getBook(i));
//                return;
//            }
            //contains()方法是判断前面字符串是否包含后面的字符串，包含则返回true
            if (booksList.getBook(i).getName().contains(name)){
                System.out.println(booksList.getBook(i));
                return;
            }
        }
        System.out.println("查无此书！");
    }
}
