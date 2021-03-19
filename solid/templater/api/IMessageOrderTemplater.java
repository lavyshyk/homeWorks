package solid.templater.api;

import shop.customers.Customer;
import shop.customers.Order;

public interface IMessageOrderTemplater {
    /**
     * Получить специфический текст
     * @param customer информация о заказчике
     * @param order заказ
     * @return текст
     */
    public String getText(Customer customer, Order order);
}
