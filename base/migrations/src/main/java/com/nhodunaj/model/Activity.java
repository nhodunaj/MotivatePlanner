package com.nhodunaj.model;


import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id", referencedColumnName = "id")
    private Account accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_type_id", referencedColumnName = "id")
    private ActivityType activityTypeId;

    @Column
    private String name;

    @Column
    private Long time;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @Column
    private String start;

    @Column
    private String finish;

    @Column
    private DateTime date;

}
