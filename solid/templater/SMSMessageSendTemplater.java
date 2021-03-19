package solid.templater;

import shop.customers.Customer;
import shop.customers.Order;
import solid.templater.api.IMessageSendTemplater;

public class SMSMessageSendTemplater implements IMessageSendTemplater {
    @Override


    public boolean sendMessage(String number, Customer customer, Order order, String text){
        System.out.println("Отправляем смс на номер " + number);
        System.out.println(text);
        return true;
    }
}
