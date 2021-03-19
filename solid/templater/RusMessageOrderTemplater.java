package solid.templater;

import shop.customers.Customer;
import shop.customers.Order;
import solid.templater.api.IMessageOrderTemplater;

public class RusMessageOrderTemplater implements IMessageOrderTemplater {

    @Override
    public String getText(Customer customer, Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("Сформирован заказ ").append(order.getOrderNo()).append("\n");
        builder.append("В заказе есть позиции: ").append("\n");
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            builder.append(orderItem.getQuantity())
                    .append(": ")
                    .append(orderItem.getItemPrice())
                    .append(" = ")
                    .append(orderItem.getQuantity() * orderItem.getItemPrice()).append("\n");
        }
        builder.append("Сумма заказа: ")
                .append(order.getOrderItems().stream().mapToDouble(i -> i.getQuantity() * i.getItemPrice()).sum())
                .append("\n");

        builder.append("Заказ сформировал ").append(customer.getName()).append(": ").append(customer.getPhone())
                .append("\n");

        return builder.toString();
    }
}
