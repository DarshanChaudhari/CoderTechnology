package CollectionsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        books.add(new Book(105,"Meluha","Koeoin",420));
        books.add(new Book(102,"String","Steven",150));
        books.add(new Book(103,"Naming Variable","Shoaib",360));
        books.add(new Book(101,"JAVA on track","Malik",500));

        Collections.sort(books);
        System.out.println("Sorting the book...");

        for (Book o :books){
            System.out.println(o);
        }


    }
}
