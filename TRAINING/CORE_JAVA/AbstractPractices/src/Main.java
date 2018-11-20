import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating a HashMap");

        Map<Integer,Card> myCard = new HashMap<Integer, Card>();
        myCard.put(12345,new CreditCard(12345,"MasterCard","12/03/2019","Darshan",5000,65898472,50000,3000,250, (float) 8.75));
        myCard.put(23456,new DebitCard(23456,"CityExpress","15/06/2019","Chaudhari",6000,65897));

        ShoppingVendor sv = new ShoppingVendor("Haldiram");
        sv.acceptPayment(myCard.get(12345),6000);
        sv.acceptPayment(myCard.get(23456),2000);
    }
}
