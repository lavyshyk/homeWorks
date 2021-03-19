package solid.pattern;

import shop.customers.Customer;
import shop.customers.Order;
import solid.templater.EmailMessageSendTemplater;
import solid.templater.RusMessageOrderTemplater;
import solid.templater.SMSMessageSendTemplater;
import solid.templater.api.IMessageOrderTemplater;
import solid.templater.api.IMessageSendTemplater;

public class MediatorMessangeSender {

    public boolean send(Customer customer, Order order){

        boolean managerSleep = true;
        String number;

        IMessageOrderTemplater messageOrderTemplater = new RusMessageOrderTemplater();
        IMessageSendTemplater messageSendTemplater;


        String text = messageOrderTemplater.getText(customer, order);

        if (!managerSleep){
            messageSendTemplater = new EmailMessageSendTemplater();

            number = "Kuku.@mail.com";
        }
        else{
            messageSendTemplater = new SMSMessageSendTemplater();
             number = "+3759999999";
        }
        return messageSendTemplater.sendMessage(number, customer, order, text);
    }

}
