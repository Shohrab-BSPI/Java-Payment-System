package DemoApplication.paymentGateway;

import DemoApplication.EPaymentMethod;
import DemoApplication.model.IPaymentDetails;
import DemoApplication.processor.IPaymentProcessor;
import DemoApplication.processor.BkashPaymentProcessor;

public class BkashPaymentGateway implements IPaymentGateway{
    //it's return BkashPaymentGateway type object. cz it's implements class.
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new BkashPaymentProcessor(_paymentDetails);
    }
}
