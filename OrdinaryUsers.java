package books.management;

import books.management.operation.*;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:17
 */
public class OrdinaryUsers extends User{
    public OrdinaryUsers(String name) {
        this.name=name;
        this.iOperations=new IOperation[]{
                new FindBookOperation(),
                new BorrowBookOperation(),
                new ReturnBookOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("===================================");
        System.out.println("hello "+name+", 欢迎使用图书管理系统！");
        System.out.println("  1. 查阅书籍功能；");
        System.out.println("  2. 借阅书籍功能；");
        System.out.println("  3. 归还书籍功能；");
        System.out.println("  4. 退出系统功能；");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您选择的功能：");
        int choice = sc.nextInt();
        if(0<choice && choice<5){
            return choice;
        }
        return 0;
    }
}
