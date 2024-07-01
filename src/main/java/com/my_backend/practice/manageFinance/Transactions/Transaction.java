package com.my_backend.practice.manageFinance.Transactions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Transaction {
    private @Id
    @GeneratedValue Long id;

    public Transaction() {}

    private float amount;
    private Date date;

    public float getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }
}
