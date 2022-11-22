class Card  extends Payment() {
    constructor(id, numberCard, expiration, ccv) {
        super(id)
        this.numberCard = numberCard;
        this.expiration = expiration;
        this.ccv = ccv;
    }
}