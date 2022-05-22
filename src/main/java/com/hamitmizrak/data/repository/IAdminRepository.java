package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<AdminEntity,Long> {
}
