// Payment System
// Create a Payment class with method pay().
// Extend with CreditCardPayment, UPIPayment, PayPalPayment.
// Call them using a Payment reference to show dynamic dispatch.

class Tenth{
    public static class Payment {
        public void pay(double amount) {
            System.out.println("Processing payment of: " + amount);
        }
    }   

    public static class CreditCardPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Processing credit card payment of: " + amount);
        }
    }
    public static class UPIPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Processing UPI payment of: " + amount);
        }
    }   
    public static class PayPalPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Processing PayPal payment of: " + amount);
        }
    }

        
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UPIPayment();
        payment.pay(500);

        payment = new PayPalPayment();
        payment.pay(750);
    }
}
