package books.management.operation;

import books.management.BooksList;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:45
 */
public class ShowBookListOperation implements IOperation{
    //显示书列表类，实现操作接口，重写显示书籍列表的work操作方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("显示所有书籍列表：");
        for(int i=0;i<booksList.getSize();i++){
            System.out.println(booksList.getBook(i));
        }
    }
}
