
public abstract class Card {

    private double cardNo;
    private String vendorName;
    private String expiryDate;
    private String CardHolderName;


    public abstract void withDraw(double amount);

    public abstract void payToVendor(String vendorName,double amount);

    public Card(double cardNo, String vendorName, String expiryDate, String cardHolderName) {
        this.cardNo = cardNo;
        vendorName = vendorName;
        this.expiryDate = expiryDate;
        CardHolderName = cardHolderName;
    }

    public double getCardNo() {
        return cardNo;
    }

    public void setCardNo(double cardNo) {
        this.cardNo = cardNo;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        vendorName = vendorName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        CardHolderName = cardHolderName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                ", VendorName='" + vendorName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", CardHolderName='" + CardHolderName + '\'' +
                '}';
    }

    public Card() {
    }
}
