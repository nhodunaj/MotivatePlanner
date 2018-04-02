package com.nhodunaj.model;

import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cost")
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id", referencedColumnName = "id")
    private Account accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_type_id", referencedColumnName = "id")
    private CostType costTypeId;

    @Column
    private Double value;

    @Column
    private DateTime date;

    @Column
    private String name;

}
