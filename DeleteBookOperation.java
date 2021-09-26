package books.management.operation;

import books.management.BooksList;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:44
 */
public class DeleteBookOperation implements IOperation{
    //删除书籍类，实现操作接口，重写删除操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("删除书籍：");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要删除书籍的名称：");
        String name=sc.next();
        int i = 0;
        for(;i<booksList.getSize();i++){
            if (name.equals(booksList.getBook(i).getName())){
                break;
            }
        }
        if(i>=booksList.getSize()){
            System.out.println("您输入名为["+name+"] 的书不在书籍列表中，删除失败！");
            return;
        }
        //若存在，删除操作如下：1，将最后一个书籍覆盖掉要删除的书籍；2.size--；
        int last=booksList.getSize()-1;
        int curSize=booksList.getSize();
        booksList.setBook(i,booksList.getBook(last));
        booksList.setSize(curSize-1);
        System.out.println("删除成功！");
    }
}
