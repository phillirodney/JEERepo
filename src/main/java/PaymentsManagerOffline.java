import javax.inject.Inject;
import java.util.List;

/**
 * Created by Luke on 19/11/2016.
 */
public class PaymentsManagerOffline implements PaymentsManager {

    @Inject
    private TestData testData;

    @Override
    public Payment createNewPayment(Payment payment) {


        List<Payment> payments = testData.getPayments();
        payments.add(payment);
        testData.setPayments(payments);
        return findByCardNumber(payment.getCardNumber());

    }


    @Override
    public void updatePayment(Payment payment) {

    }

    @Override
    public void deletePayment(Payment payment) {

        List<Payment> payments = testData.getPayments();
        payments.remove(payment);
        testData.setPayments(payments);

    }

    @Override
    public Payment findByCardNumber(String cardNumber) {

        for(Payment p: testData.getPayments()){
            if(p.getCardNumber() == cardNumber){
                return p;
            }
        }

        return null;
    }
}
