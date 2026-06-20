interface PaymentProcessor {
    public void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing creditcard amount: "+amount);
    }
}

class UpiProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing upi payment:"+amount);
    }
}

class PaymentProcessorRunner {
    private PaymentProcessor paymentProc;
    PaymentProcessorRunner(PaymentProcessor paymentProc) {
        this.paymentProc = paymentProc;
    }

    void runProcessor(double amount) {
        paymentProc.processPayment(amount);
    }
}

class InterfaceEx2 {
    public static void main(String args[]) {

        PaymentProcessor paym = new CreditCardProcessor();
        paym.processPayment(100.0);

        paym = new UpiProcessor();
        paym.processPayment(234.99);


        // Now running via dependency injection

        PaymentProcessorRunner runner = new PaymentProcessorRunner(new CreditCardProcessor());
        runner.runProcessor(400.0);

        PaymentProcessorRunner runner2 = new PaymentProcessorRunner(new UpiProcessor());
        runner2.runProcessor(500.0);
    }
}