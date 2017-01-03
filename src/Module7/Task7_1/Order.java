package Module7.Task7_1;

import Module4.Task4_2.Currency;

public class Order implements Comparable<Order>{
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIndicator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIndicator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIndicator = shopIndicator;
        this.user = user;
    }

    @Override
    public int compareTo(Order o) {
        return user.getLastName().compareTo(o.getUser().getLastName());
    }

    @Override
    public String toString() {
        return "Order{" +
                "id = " + id +
                ", price = " + price +
                ", currency = " + currency +
                ", itemName = '" + itemName + '\'' +
                ", shopIndicator = '" + shopIndicator + '\'' +
                ", user = " + user.toString() +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIndicator() {
        return shopIndicator;
    }

    public User getUser() {
        return user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setShopIndicator(String shopIndicator) {
        this.shopIndicator = shopIndicator;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

