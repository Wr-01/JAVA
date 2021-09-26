package books.management;

import books.management.operation.IOperation;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/25 16:26
 */
public class Main {
    //主类主方法实现 图书管理系统：
    public static void main(String[] args) {
        //创建书籍（书架）
        BooksList booksList=new BooksList();
        //创建用户实例
        User user=login();

        while(true) {
            int choice = user.menu();
            user.doOperation(choice,booksList);
        }
    }

    //登录方法 判断用户类型，创建子类用户实例，返回给父类（向上转型）；
    public static User login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=sc.nextLine();
        System.out.println("请输入您的用户类型: 1-管理员；2-一般用户");
        int type=sc.nextInt();
        if(type==1){
            return new Administrators(name);
        }
        return new OrdinaryUsers(name);
    }
}
