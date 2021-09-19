package exception;

import java.util.Scanner;

/**
 * @Author: 19261
 * @Date: 2021/9/18 10:24
 */
public class Test {
    public static String name="zwr";
    public static String password="123";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("请输入用户名：");
            String name=scanner.nextLine();
            System.out.println("请输入密码:");
            String password=scanner.nextLine();
            login(name,password);
        }catch (UserNameError | UserPasswordError user){
            user.printStackTrace();
        }
    }
    public static void login(String name,String password)throws UserNameError, UserPasswordError {
        if(!Test.name.equals(name)){
            throw new UserNameError("用户名错误！");
        }
        if (!Test.password.equals(password)) {
            throw new UserPasswordError("用户密码错误！");
        }
        System.out.println("登陆成功！");
    }

    public static void main4(String[] args) {
        System.out.println(divide(2,1));
        System.out.println(divide(2,0));
    }
    public static int divide(int a,int b)throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException();
//        }
        return a/b;
    }

    public static void main3(String[] args) {
        func();
    }
        public static void func () {
            int a = 1;
            int b = 0;
            System.out.println("a / b =");
            try {
                System.out.println("qian");
                Integer ret = func1(a, b);
                System.out.println(ret);
                System.out.println("hou");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }finally {
                System.out.println("ending");
            }
        }
        public static Integer func1 ( int a, int b){
            Integer num = a / b;
            return num;
        }


        public static void main2 (String[]args){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("before");
                String s = sc.nextLine();
                System.out.println("after");
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                System.out.println("sos");
            }
            System.out.println("输入结束!");
        }

        public static void main1 (String[]args){
            try {
                int[] n = {1, 2};
                System.out.println("异常前!");
                System.out.println(n[12]);
                System.out.println("异常后!");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("finally!");
            }
            System.out.println("处理异常结束！");
        }

}