package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        printBanner();
        printDetails(name, orders);
    }

    private void printDetails(String name, List<Order> orders) {
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding(orders.iterator()));
    }

    private double getOutstanding(Iterator<Order> elements) {
        double outstanding = 0.0;
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printBanner() {
        // print banner
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
