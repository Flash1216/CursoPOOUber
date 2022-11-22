public class PayPal extends Payment {
        int id;
        String email;

        public PayPal(int id, String email) {
            super(id);
            this.email = email;
        }
}
