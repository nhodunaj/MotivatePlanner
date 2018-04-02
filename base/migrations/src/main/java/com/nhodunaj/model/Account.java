package com.nhodunaj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_account")
public class Account {

    @JsonProperty
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonProperty
    @Column
    private String name;

    @JsonProperty
    @Column
    private String surname;

    @JsonProperty
    @Column
    private String email;

    @JsonProperty
    @Column
    private String login;

    @JsonIgnore
    @Column
    private String password;

    @JsonProperty
    @Column
    private String phone;

}
