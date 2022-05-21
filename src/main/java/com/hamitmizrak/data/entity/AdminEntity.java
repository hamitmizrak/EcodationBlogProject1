package com.hamitmizrak.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//lombok
@Data
@NoArgsConstructor
@Builder

//Entity
@Entity
@Table(name="admin")
public class AdminEntity extends  BaseEntity {
    //serileştirme
    public static final long serialVersionUID=1L;

    @Column(name="admin_name")
    private String adminName;

    @Column(name="admin_email")
    private String adminEmail;

    @Column(name="admin_password")
    private String adminPassword;

    //parametreli constructır
    public AdminEntity(String adminName, String adminEmail, String adminPassword) {
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }
}
