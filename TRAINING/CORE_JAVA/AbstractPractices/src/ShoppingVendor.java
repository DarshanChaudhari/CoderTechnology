public class ShoppingVendor {

    public String shoppingVendorName;

    public void acceptPayment (Card card,double amount) {
        card.payToVendor(this.shoppingVendorName,amount);
        System.out.println(card.getCardNo() + " amount : " + amount);
        System.out.println("Card was " + card.getClass().getName());

    }

    public ShoppingVendor(String shoppingVendorName) {
        this.shoppingVendorName = shoppingVendorName;
    }
}
