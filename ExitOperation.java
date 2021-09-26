package books.management.operation;

import books.management.BooksList;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:48
 */
public class ExitOperation implements IOperation{
    //退出程序类，实现操作接口，重写退出操作的work方法：
    @Override
    public void work(BooksList booksList) {
        System.out.println("已退出程序！");
        //退出程序（该进程），0表示正常结束的退出码；非0表示异常终止的退出码
        //exit 方法可以退出程序（结束jvm 的 Java进程）
        System.exit(0);
    }
}
