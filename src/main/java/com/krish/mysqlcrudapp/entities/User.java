package com.krish.mysqlcrudapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "thesisdb")
public class User {

    @Id
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String address;
}
