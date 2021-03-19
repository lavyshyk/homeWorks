package solid;

import shop.customers.Customer;
import shop.customers.Order;
import solid.pattern.MediatorMessangeSender;
import solid.templater.EngMessageOrderTemplater;
import solid.templater.RusMessageOrderTemplater;
import solid.templater.api.IMessageOrderTemplater;

public class SolidMain2 {
    public static void main(String[] args) {
        Order order = new Order("1");

        order.addItem(10, 5);
        order.addItem(1, 12);
        order.addItem(17, 3);

        Customer customer = new Customer("Вася");
        customer.setPhone("+3750000000");

        

        MediatorMessangeSender mediatorMessangeSender = new MediatorMessangeSender();

        boolean result = mediatorMessangeSender.send(customer, order);

        if (result){
            System.out.println(" Сообщение отправлено");
        }else {
            System.out.println("Что- то пошло не так");
        }



    }



}
