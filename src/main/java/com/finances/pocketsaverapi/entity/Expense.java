package com.finances.pocketsaverapi.entity;

import com.finances.pocketsaverapi.entity.enums.ExpenseCategory;
import com.finances.pocketsaverapi.entity.enums.ExpenseClassification;
import com.finances.pocketsaverapi.entity.enums.TypePayment;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String description;
    @Column(nullable = false, precision = 19, scale = 2)
    public BigDecimal price;
    public String place;
    public Date expenseDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public TypePayment typePayment;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public ExpenseCategory category;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public ExpenseClassification classification;

    @ManyToOne
    @JoinColumn(name = "card_id")
    public Card card;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    public User user;

}
