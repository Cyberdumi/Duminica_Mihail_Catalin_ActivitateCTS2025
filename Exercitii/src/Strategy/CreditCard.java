package Strategy;




public class CreditCard {

    private int amount = 1_000;
    private final String number;
    private final String date;
    private final String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public Object getAmount() {
        return null;
    }

    public void setAmount(int i) {
    }
}