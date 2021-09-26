package books.management;

/**
 * @Author: 19261
 * @Date: 2021/9/25 11:54
 */
public class BooksList {
    private Book[] books=new Book[100];
    private int size=0;

    //构造方法:
    public BooksList(){
        books[0]=new Book("三国","罗贯中",100,"古典小说");
        books[1]=new Book("西游记","吴承恩",100,"古典小说");
        books[2]=new Book("水浒传","施耐庵",100,"古典小说");
        size=3;
    }

    //setter方法
    //修改某一本书
    public void setBook(int index,Book book){
        books[index]=book;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //getter方法；
    // 获取某本书
    public Book getBook(int index) {
        return books[index];
    }
    //获取书籍数量：
    public int getSize() {
        return size;
    }

}
