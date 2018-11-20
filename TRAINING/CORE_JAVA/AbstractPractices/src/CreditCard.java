public class CreditCard extends Card {
    private double maxWithdrawal;
    private int accountNo;
    private double creditLimit;
    private double cashLimit;
    private double rewardPoints;
    private float rateOfInterest;

    public CreditCard() {
        super();
    }

    @Override
    public void withDraw(double amount) {
        System.out.println("Rs. " + amount + " is withdrawan from Credit Card");
    }

    @Override
    public void payToVendor(String vendorName, double amount) {
        System.out.println("Pay amount " + amount + "from Credit Card to " + vendorName );

    }


    public CreditCard(double cardNo, String vendorName, String expiryDate, String cardHolderName, double maxWithdrawal, int accountNo, double creditLimit, double cashLimit, double rewardPoints, float rateOfInterest) {
        super(cardNo, vendorName, expiryDate, cardHolderName);
        this.maxWithdrawal = maxWithdrawal;
        this.accountNo = accountNo;
        this.creditLimit = creditLimit;
        this.cashLimit = cashLimit;
        this.rewardPoints = rewardPoints;
        this.rateOfInterest = rateOfInterest;
    }
}
