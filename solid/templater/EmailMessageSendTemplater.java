package solid.templater;

import shop.customers.Customer;
import shop.customers.Order;
import solid.templater.api.IMessageSendTemplater;

public class EmailMessageSendTemplater implements IMessageSendTemplater {
    @Override
    public boolean sendMessage(String number, Customer customer, Order order,String text){
        System.out.println("Отправляем электронное  сообщение " + number);
        System.out.println(text);
        return true;
    }
}
