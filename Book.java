package books.management;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:54
 */
public class Book {
    //类书 的属性：
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    //通过构造方法传参进行实例对象初始化的方法：
    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    //获取书名:
    public String getName() {
        return name;
    }
    //获取借阅状态：
    public boolean isBorrowed() {
        return isBorrowed;
    }
    //设置借阅状态：
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
