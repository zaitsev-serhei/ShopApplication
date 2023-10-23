package model;

import java.util.Date;
import java.util.List;
//import java.util.Objects;

public class Client {

    private long id;
    private String firstName;
    private String lastName;
    private Date lastActivityDate;
    private List<Order> orders;
    private String telephoneNumber;
    private long bonuses;
    private String email;
    private Date birthday;
    private boolean isDeleted;

    public Client(long id, String firstName, String lastName, Date lastActivityDate, List<Order> orders,
                  String telephoneNumber, long bonuses, String email, Date birthday, boolean isDeleted) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastActivityDate = lastActivityDate;
        this.orders = orders;
        this.telephoneNumber = telephoneNumber;
        this.bonuses = bonuses;
        this.email = email;
        this.birthday = birthday;
        this.isDeleted = isDeleted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getBonuses() {
        return bonuses;
    }

    public void setBonuses(long bonuses) {
        this.bonuses = bonuses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
