package solid;

import shop.customers.Customer;
import shop.customers.Order;

import java.util.List;
import java.util.stream.Stream;

public class SolidMain {
    public static void main(String[] args) {
        Order order = new Order("1");

        order.addItem(10, 5);
        order.addItem(1, 12);
        order.addItem(17, 3);

        Customer customer = new Customer("Вася");
        customer.setPhone("+3750000000");

        sendSMS("+3759999999", customer, order);

        sendEmail("kuku@mail.com", customer, order);




    }

    /**
     * Отправляет смс с содержанием заказ
     * @param number номер н акоторый отправлен заказ
     * @param customer информация о заказчике
     * @param order информация о заказе
     * @return  подтверждение заказа
     */
    public static boolean sendSMS(String number, Customer customer, Order order){

        System.out.println("Отправляем смс на номер " + number + ".  Сформирован заказ : " + order.getOrderNo());
        System.out.println("В заказе есть позиции : ");
        
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.getQuantity() + ": " + orderItem.getItemPrice() + " = " +
                    (orderItem.getQuantity() * orderItem.getItemPrice())
            );
        }
        System.out.println("Сумма заказа: " + order.getOrderItems().stream().mapToDouble(i -> i.getQuantity() * i.getItemPrice()).sum());

        System.out.println("Заказ сформировал " + customer.getName() + ": " + customer.getPhone());
        return true;
    }

    /**
     * Отправляет сообщение на электронный адрес с  содержанием заказ
     * @param number электронный адрес на который отправлен заказ
     * @param customer информация о заказчике
     * @param order информация о заказе
     * @return  подтверждение заказа
     */
    public static boolean sendEmail(String number, Customer customer, Order order){

        System.out.println("Отправляем электронное сообщение " + number + ".  Сформирован заказ : " + order.getOrderNo());
        System.out.println("В заказе есть позиции : ");

        for (Order.OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.getQuantity() + ": " + orderItem.getItemPrice() + " = " +
                    (orderItem.getQuantity() * orderItem.getItemPrice())
            );
        }
        System.out.println("Сумма заказа: " + order.getOrderItems().stream().mapToDouble(i -> i.getQuantity() * i.getItemPrice()).sum());

        System.out.println("Заказ сформировал " + customer.getName() + ": " + customer.getPhone());
        return true;
    }


}
