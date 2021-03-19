package solid.templater.api;

import shop.customers.Customer;
import shop.customers.Order;

public interface IMessageSendTemplater {
    /**
     * Отправляет сообщение с  содержанием заказа
     * @param number электронный адрес на который отправлен заказ
     * @param customer информация о заказчике
     * @param order информация о заказе
     * @return  подтверждение заказа
     */

    public boolean sendMessage(String number, Customer customer, Order order, String text);
}
