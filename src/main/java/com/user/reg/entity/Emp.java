package com.user.reg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emp_reg")
public class Emp {

    private String name;
    @Id
    private String Username;
    private String email;
    private String phone;
    private String gender;
}
