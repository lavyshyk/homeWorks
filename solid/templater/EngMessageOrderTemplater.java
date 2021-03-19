package solid.templater;

import shop.customers.Customer;
import shop.customers.Order;
import solid.templater.api.IMessageOrderTemplater;

/**
 * Реализация для формаирования текста "на английском языке"
 */
public class EngMessageOrderTemplater implements IMessageOrderTemplater {
    /**
     * { @inheritdoc }
     * дополнительные пояснения
     */
    @Override
    public String getText(Customer customer, Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("Sformirovan zakaz ").append(order.getOrderNo()).append("\n");
        builder.append("V zakaze est' posicii: ").append("\n");
        for (Order.OrderItem orderItem : order.getOrderItems()) {
            builder.append(orderItem.getQuantity())
                    .append(": ")
                    .append(orderItem.getItemPrice())
                    .append(" = ")
                    .append(orderItem.getQuantity() * orderItem.getItemPrice()).append("\n");
        }
        builder.append("Summa zakaza: ")
                .append(order.getOrderItems().stream().mapToDouble(i -> i.getQuantity() * i.getItemPrice()).sum())
                .append("\n");

        builder.append("Zakaz sformiroval ").append(customer.getName()).append(": ").append(customer.getPhone())
                .append("\n");

        return builder.toString();
    }
}
