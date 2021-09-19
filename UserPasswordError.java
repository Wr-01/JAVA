package exception;

/**
 * @Author: 19261
 * @Date: 2021/9/19 15:48
 */
public class UserPasswordError extends Exception{
    public UserPasswordError(String message) {
        super(message);
    }
}

//public class UserPassword extends RuntimeException{
//    public UserPassword(String message) {
//        super(message);
//    }
//}
