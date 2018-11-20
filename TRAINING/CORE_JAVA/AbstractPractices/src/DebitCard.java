public class DebitCard extends Card {

    private double maxWithdrawal;
    private int accountNo;

    @Override
    public void withDraw(double amount) {
        System.out.println("Rs. " + amount + " is withdrawan from Debit Card");
    }

    @Override
    public void payToVendor(String vendorName, double amount) {
        System.out.println("Pay amount " + amount + "from Debit Card to " + vendorName );

    }

    public DebitCard(double cardNo, String vendorName, String expiryDate, String cardHolderName, double maxWithdrawal, int accountNo) {
        super(cardNo, vendorName, expiryDate, cardHolderName);
        this.maxWithdrawal = maxWithdrawal;
        this.accountNo = accountNo;
    }

    public DebitCard() {
        super();
    }
}
