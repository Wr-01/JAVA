package exception;

/**
 * @Author: 19261
 * @Date: 2021/9/19 15:48
 */
//继承自受查异常类，要么需要try包裹 要么需要在方法后面throws表明可能的异常
public class UserNameError extends Exception{
    public UserNameError(String message) {
        super(message);
    }
}
//继承自非抽查异常类
//public class UserName extends RuntimeException{
//    public UserName(String message) {
//        super(message);
//    }
//}
