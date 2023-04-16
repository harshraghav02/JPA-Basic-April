package com.example.jpabasicsapril;

import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    private Date expiry;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn
    private User user;

    public Card() {
    }

    public Card(int cardNo, Date expiry, Status status, User user) {
        this.cardNo = cardNo;
        this.expiry = expiry;
        this.status = status;
        this.user = user;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
