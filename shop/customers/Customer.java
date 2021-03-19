package shop.customers;

import shop.paymants.api.Payment;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final List<Address> addresses = new ArrayList<>();
    private final List<Payment> payments = new ArrayList<>();
    private String name;
    private String phone;

    public Customer() {
        this.name = "name";
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addPayment(Payment payment){
        this.payments.add(payment);
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
