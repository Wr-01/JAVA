package books.management.operation;

import books.management.BooksList;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:49
 */
public class BorrowBookOperation implements IOperation{
    //借阅书籍类，实现操作接口，重写借阅操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("借阅书籍：");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要借书籍的名称：");
        String name=sc.next();
        int i = 0;
        for(;i<booksList.getSize();i++){
            if (name.equals(booksList.getBook(i).getName())){
                break;
            }
        }
        if(i>=booksList.getSize()){
            System.out.println("您输入名为["+name+"] 的书不在书籍列表中，借阅失败！");
            return;
        }
        boolean curBorrowed=booksList.getBook(i).isBorrowed();
        if(curBorrowed){
            System.out.println("该书籍已经被借阅了，未归还，借阅失败！");
            return;
        }
        booksList.getBook(i).setBorrowed(true);
        System.out.println("借阅书籍完成！");
    }
}
