package CollectionsComparator;

import java.util.Comparator;

public class Book {


    private int bookid;
    private String title;
    private String author;
    private Float price;

    public Book(int bookid, String title, String author, Float price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
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


}

class sortBytitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        return o1.getBookid() - o2.getBookid();
    }
}

  class sortByAuthor implements Comparator<Book>{

      @Override
      public int compare(Book o1, Book o2) {
          return o1.getAuthor().compareTo(o2.getAuthor());
      }
  }

  class sortByprice implements Comparator<Book>{

      @Override
      public int compare(Book o1, Book o2) {

          return o1.getPrice().compareTo(o2.getPrice());
      }
  }
