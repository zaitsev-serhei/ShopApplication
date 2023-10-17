package Models;

import java.util.Date;

public class Order {

    private long id;
    private Date date;
    private long total_price;
    private long client_id;
    private long product_id;

    public Order(long id, Date date, long total_price, long client_id, long product_id) {
        this.id = id;
        this.date = date;
        this.total_price = total_price;
        this.client_id = client_id;
        this.product_id = product_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(long total_price) {
        this.total_price = total_price;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }
}