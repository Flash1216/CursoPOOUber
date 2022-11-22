public class Tarjeta extends Payment {
    int id, cardNumber, ccv, expirationDate;
    String cardName;

    public Tarjeta(int id, String cardName, int cardNumber, int ccv, int expirationDate) {
        super(id);
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.expirationDate = expirationDate;
    }
}