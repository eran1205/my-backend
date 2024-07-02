package com.my_backend.practice.manageFinance.Transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    private @Id
    @GeneratedValue Long id;

    private float amount;
    private Date date;

    public Transaction() {}

    public Transaction(float amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
