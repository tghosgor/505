package org.cse505.project1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * System log class. This class has many responsibilities like logging, reporting, managing the orders.
 *
 * TODO(hosgor): usual way is one class does one thing. maybe seperate the order management from here.
 */
public class SystemLog {
    /**
     * Constructor.
     */
    public SystemLog() {
        this.filename = "system-log";
        try {
            this.logWriter = new BufferedWriter(new FileWriter(this.filename));
        } catch (IOException e) {
            // TODO(hosgor): handle this? maybe print error and abort.
        }

        /**
          * A helper class that orders 'Orders' by their priority.
          * Orders with lower priority-values have higher priority.
          */
        class OrderPriorityComparator implements Comparator<Order> {
            public int compare(Order lhs, Order rhs) {
                return lhs.priority() - rhs.priority();
            }

            public boolean equals(Object obj) {
                return (obj instanceof OrderPriorityComparator);
            }
        }

        this.waitingOrders = new PriorityQueue<>(20, new OrderPriorityComparator());
    }

    /**
     * Adds an order to the waiting orders queue and logs the operation.
     * @param order The order to add.
     */
    public void addOrder(Order order) {
        waitingOrders.add(order);

        try {
            logWriter.write(order.toString());
            logWriter.newLine();
        } catch (IOException e) {
            // TODO(hosgor): handle this? maybe print error and abort.
        }
    }

    /**
     * Pop an order from the waiting orders queue and return it.
     * @return The first of the waiting orders.
     */
    public Order consumeOrder() {
        if (waitingOrders.peek() != null) {
            return waitingOrders.poll();
        } else {
            return null;
        }
    }

    /**
     * Get the first 'n' orders from the orders.
     * @param n The number of orders to get.
     * @return An array containing at most 'n' first orders.
     */
    public Order[] showOrders(int n) {
        n = (n <= waitingOrders.size() ? n : waitingOrders.size());

        Order[] orders = new Order[n];

        Iterator<Order> it = waitingOrders.iterator();
        int i = 0;
        while (n-- > 0) {
            assert it.hasNext();
            orders[i++] = it.next();
        }

        return orders;
    }

    /// TODO(hosgor): needs more clarification
    Map<Integer, Item> getAsTree() {
        return null;
    }

    private String filename;
    private BufferedWriter logWriter;
    private PriorityQueue<Order> waitingOrders;
}
