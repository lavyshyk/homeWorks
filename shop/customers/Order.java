package shop.customers;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderNo;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(double itemPrice, int quantity){
        this.orderItems.add(new OrderItem(itemPrice, quantity));
    }

    public class OrderItem {

        private double itemPrice;
        private int quantity;

        public OrderItem(double itemPrice, int quantity) {
            this.itemPrice = itemPrice;
            this.quantity = quantity;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}