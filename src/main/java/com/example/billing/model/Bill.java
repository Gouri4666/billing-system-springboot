package com.example.billing.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double total;

    private LocalDateTime billDate;

    public Bill() {}

    public Bill(double total) {
        this.total = total;
        this.billDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }
}