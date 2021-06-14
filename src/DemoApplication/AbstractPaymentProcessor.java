package DemoApplication;

import DemoApplication.model.IPaymentDetails;
import DemoApplication.paymentGateway.IPaymentGateway;
import DemoApplication.paymentGateway.PaymentGatewayMaker;

public abstract class AbstractPaymentProcessor{
    IPaymentDetails iPaymentDetails;

    public void setPaymentDetails(IPaymentDetails paymentDetails) {
        this.iPaymentDetails = paymentDetails;
    }

    //this method for all info printing.
    protected void process(int i) {

        IPaymentGateway paymentGateway = new PaymentGatewayMaker();
        EPaymentMethod ePaymentMethod = EPaymentMethod.getValue(i); // for example, if i==1 then EPaymentMethod.BKASH;

        //for selection Type of PaymentGateway
        System.out.println("You are selected "+ePaymentMethod+" payment System.");

        //paymentGateway = paymentGateway.withPaymentMethod(ePaymentMethod);
        //paymentGateway.withPaymentDetails(iPaymentDetails).process();

        //PaymentType.BkashPaymentGateway(withPaymentMethod).BkashPaymentProcessor(withPaymentDetails).
    	paymentGateway.withPaymentMethod(ePaymentMethod).withPaymentDetails(iPaymentDetails).process();
    }

    abstract void run();
}
