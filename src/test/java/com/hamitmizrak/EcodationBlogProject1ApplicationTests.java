package com.hamitmizrak;

import com.hamitmizrak.data.entity.AdminEntity;
import com.hamitmizrak.data.repository.IAdminRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EcodationBlogProject1ApplicationTests implements  ITestData {

    @Autowired
    IAdminRepository adminRepository;


    @Test
    @Override
    public void testCreate() {
        AdminEntity adminEntity=new AdminEntity();
        adminEntity.setAdminEmail("hamitmizrak@gmail.com");
        adminEntity.setAdminName("Hamit");
        adminEntity.setAdminPassword("root");
        adminRepository.save(adminEntity);
        assertNotNull(adminRepository.findById(1L).get());
    }

    @Test
    @Override
    public void testFindById() {
        AdminEntity adminEntity=adminRepository.findById(1L).get();
        assertEquals("Hamit",adminEntity.getAdminName());

    }

    @Override
    @Test
    public void testList() {
       List<AdminEntity>  listem=adminRepository.findAll();
       assertThat(listem).size().isGreaterThan(0);
    }

    @Test
    @Override
    public void testUpdate() {
        AdminEntity adminEntity=adminRepository.findById(1L).get();
        adminEntity.setAdminName("HamitMizrak");
        adminRepository.save(adminEntity);
        assertNotEquals("Hamit",adminRepository.findById(1L).get().getAdminName());
    }


    @Test
    @Override
    public void testDelete() {
        adminRepository.deleteById(1L);
        assertThat(adminRepository.existsById(1L)).isFalse();

    }
}
