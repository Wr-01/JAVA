package books.management;

import books.management.operation.IOperation;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:11
 */
abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    //用户菜单（对于管理员和一般用户现实的菜单功能不同，故使用abstract修饰菜单方法；
    // 通过管理员和一般用户继承User类时，重写特定的菜单
    public abstract int menu();

    //用户操作方法:
    public void doOperation(int choice,BooksList booksList){
        this.iOperations[choice-1].work(booksList);
    }
}
