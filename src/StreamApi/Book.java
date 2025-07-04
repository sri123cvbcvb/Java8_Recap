package StreamApi;

public class Book {

    private String BookName;
    private int page;
    private int price;

    public Book() {
    }

    public Book(String bookName, int page, int price) {
        BookName = bookName;
        this.page = page;
        this.price = price;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", page=" + page +
                ", price=" + price +
                '}';
    }
}
