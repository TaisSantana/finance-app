package com.finances.pocketsaverapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "app_user")
@Getter
@Setter
@Builder
public class User {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(nullable = false)
    public String name;
    @Column(nullable = false,unique = true)
    public String email;
    @Column(nullable = false,unique = true)
    public String nickname;
    @Column(unique = true,nullable = false)
    public String password;
    public Date birthDate;
    public String cpf;
    public String token;
}
