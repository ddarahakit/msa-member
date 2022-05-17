package com.ddarahakit.msamember.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Member {
    @Id
    private String email;
}
