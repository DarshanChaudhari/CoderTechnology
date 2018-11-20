package CollectionsComparator;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {



    public static void main(String[] args) {

        List<Book> books = new ArrayList();
        books.add(new Book(101,"String","Steven",  250F));

        books.add(new Book(102,"String","Steven", 150F));
        books.add(new Book(103,"Naming Variable","Shoaib", 360F));
        books.add(new Book(101,"JAVA on track","Malik", 500F));

        System.out.println("Raw Data");
        for (int i = 0; i<books.size();i++ )
        {
            System.out.println(books.get(i));
        }


        System.out.println("Sorting by Title");
        Collections.sort(books,new sortByAuthor());
        for (Book b :books){
//            System.out.println(b);
            System.out.println("To String " + b.toString());

        }

    }
}
