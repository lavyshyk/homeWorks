package shop.paymants;

import shop.paymants.api.Payment;

import java.util.Date;

public class DebitCard implements Payment {

   private final String issuer;
   private final Long cardNo;
   private final Date expiryDate;


    public DebitCard(String issuer, Long cardNo, Date expiryDate) {
        this.issuer = issuer;
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean authorize(double amount) {
        return true;
    }
}
