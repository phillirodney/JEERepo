package models;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

/**
 * @author Luke
 */
@Stateless
@Default
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
    		
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time
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
