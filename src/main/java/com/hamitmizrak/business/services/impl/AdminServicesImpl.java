package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.business.dto.AdminDto;
import com.hamitmizrak.business.services.AdminServices;
import com.hamitmizrak.data.entity.AdminEntity;
import com.hamitmizrak.data.repository.AdminRepository;
import com.hamitmizrak.exception.ResourceNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class AdminServicesImpl implements AdminServices {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public AdminDto EntityToDto(AdminEntity adminEntity) {
        AdminDto adminDto = modelMapper.map(adminEntity, AdminDto.class);
        return adminDto;
    }

    @Override
    public AdminEntity DtoToEntity(AdminDto adminDto) {
        AdminEntity adminEntity = modelMapper.map(adminDto, AdminEntity.class);
        return adminEntity;
    }

    //SAVE
    //http://localhost:8080/save/admins
    @Override
    @PostMapping("/save/admins")
    public AdminDto createAdmin(@RequestBody AdminDto adminDto) {
        AdminEntity adminEntity = DtoToEntity(adminDto);
        adminRepository.save(adminEntity);
        return adminDto;
    }

    //LIST
    //http://localhost:8080/list/admins
    @GetMapping("/list/admins")
    @Override
    public List<AdminDto> getAllAdmin() {
        List<AdminDto> list = new ArrayList<>();
        Iterable<AdminEntity> listem = adminRepository.findAll();
        for (AdminEntity entity : listem) {
            AdminDto adminDto = EntityToDto(entity);
            list.add(adminDto);
        }
        return list;
    }

    //FIND
    //http://localhost:8080/find/admins/1
    @GetMapping("/find/admins/{id}")
    @Override
    public ResponseEntity<AdminDto> getAdminById(@PathVariable(name = "id") Long id) {
        AdminEntity adminEntity = adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin " + id + " id bulamadı!!!"));
        AdminDto adminDto = EntityToDto(adminEntity);
        return ResponseEntity.ok(adminDto);
    }

    //UPDATE
    //http://localhost:8080/update/admins/1
    @Override
    @PutMapping("/update/admins/{id}")
    public ResponseEntity<AdminDto> updateAdmin(@PathVariable(name = "id") Long id, @RequestBody AdminDto adminDto) {
        AdminEntity adminEntity1 = DtoToEntity(adminDto);
        AdminEntity entityFind = adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin " + id + " id bulamadı!!!"));

        entityFind.setAdminName(adminEntity1.getAdminName());
        entityFind.setAdminEmail(adminEntity1.getAdminEmail());
        entityFind.setAdminPassword(adminEntity1.getAdminPassword());

        AdminEntity adminEntity2 = adminRepository.save(entityFind);
        AdminDto adminDto1 = EntityToDto(adminEntity2);
        return ResponseEntity.ok(adminDto1);
    }

    @Override
    ////http://localhost:8080/delete/admins/1
    @DeleteMapping("/delete/admins/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAdmin(@PathVariable(name = "id") Long id) {
        AdminEntity entityFind = adminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin " + id + " id bulamadı!!!"));
        adminRepository.delete(entityFind);

        Map<String,Boolean> response=new HashMap<>();
        response.put("Silindi",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
