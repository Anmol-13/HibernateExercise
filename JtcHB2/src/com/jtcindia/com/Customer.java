package com.jtcindia.com;
import javax.persistence.*;


@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private int cid;

    @Column(name = "cname")
    private String cname;

    @Column(name ="email")
    private String  email;

    @Column(name = "phone")
    private Long phone;

    @Column(name ="city")
    private String  city;

    @Column(name = "bal")
    private Double bal;

public Customer() {
}

public Customer(String cname, String email, Long phone, String city, Double bal) {
    this.cname = cname;
    this.email = email;
    this.phone = phone;
    this.city = city;
    this.bal = bal;
}

public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getBal() {
        return bal;
    }

    public void setBal(Double bal) {
        this.bal = bal;
    }
}
