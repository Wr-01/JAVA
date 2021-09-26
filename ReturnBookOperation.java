package books.management.operation;

import books.management.BooksList;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:51
 */
public class ReturnBookOperation implements IOperation{
    //归还书类，实现操作接口，重写归还操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("归还书籍：");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要还书籍的名称：");
        String name=sc.next();
        int i = 0;
        for(;i<booksList.getSize();i++){
            if (name.equals(booksList.getBook(i).getName())){
                break;
            }
        }
        if(i>=booksList.getSize()){
            System.out.println("您输入名为["+name+"] 的书不属于该书籍列表中，归还失败！");
            return;
        }
        boolean curBorrowed=booksList.getBook(i).isBorrowed();
        if(!curBorrowed){
            System.out.println("该书籍没有被借出，不用归还！");
            return;
        }
        booksList.getBook(i).setBorrowed(false);
        System.out.println("归还书籍成功！");
    }
}
