package com.hamitmizrak.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

//lombok
@Data
@NoArgsConstructor

//extends
@MappedSuperclass

//Audit tanımlama
@EntityListeners((AuditingEntityListener.class))

//Json
@JsonIgnoreProperties(value="{}",allowGetters = true)

abstract public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false)
    private Long id;


    //kim ekledi
    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    //kim ne zaman ekledi
    @Column(name="created_date")
    @CreatedDate
    private java.util.Date createdDate;


    //kim güncelledi
    @LastModifiedBy
    @Column(name="update_by")
    private String updateBy;

    //kim ne zaman güncelledi
    @LastModifiedBy
    @Column(name="update_date")
    private java.util.Date updatedDate;


}
