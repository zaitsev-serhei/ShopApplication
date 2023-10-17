package Models;

import java.util.Date;

public class Product {

    private long id;
    private String  name;
    private float price;
    private long quantity;
    private Date delivery_date;

    public Product(long id, String name, float price, long quantity, Date delivery_date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.delivery_date = delivery_date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }


}
