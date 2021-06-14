package DemoApplication.processor;

import DemoApplication.model.IPaymentDetails;

public class VisaPaymentProcessor implements IPaymentProcessor {
    private final IPaymentDetails paymentDetails;

    public VisaPaymentProcessor(IPaymentDetails paymentDetails) {
        this.paymentDetails =paymentDetails;
    }

    @Override
    public void process() {
        System.out.println("VISA Payment Successful. ");
        System.out.println(paymentDetails.toString());
    }
}
