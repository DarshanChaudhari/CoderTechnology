package CollectionsComparable;

public class Book implements Comparable<Book>{


   private int bookid;
   private String title;
   private String author;
   private float price;

    public Book(int bookid, String title, String author, float price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        System.out.println("Using compareTo");
        return this.bookid  - o.bookid;
    }
}
