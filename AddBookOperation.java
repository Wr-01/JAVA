package books.management.operation;

import books.management.Book;
import books.management.BooksList;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:44
 */
public class AddBookOperation implements IOperation{
    //添加书籍类，实现操作接口，重写添加操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("添加书籍：");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入新添加的书籍名称：");
        String name=sc.next();
        System.out.println("请输入新添加的书籍作者：");
        String author = sc.next();
        System.out.println("请输入新添加的书籍价格：");
        double price = sc.nextDouble();
        System.out.println("请输入添加书籍的类型：");
        String type = sc.next();
        Book book=new Book(name,author,price,type);
        int curSize = booksList.getSize();
        booksList.setBook(curSize, book);
        booksList.setSize(curSize+1);
        System.out.println("添加书籍成功！");
    }
}
