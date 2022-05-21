package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.business.dto.AdminDto;
import com.hamitmizrak.business.services.AdminServices;
import com.hamitmizrak.data.entity.AdminEntity;
import com.hamitmizrak.data.repository.AdminRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class AdminServicesImpl implements AdminServices {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public AdminDto EntityToDto(AdminEntity adminEntity) {
        AdminDto adminDto=modelMapper.map(adminEntity,AdminDto.class);
        return adminDto;
    }

    @Override
    public AdminEntity DtoToEntity(AdminDto adminDto) {
        AdminEntity adminEntity=modelMapper.map(adminDto,AdminEntity.class);
        return adminEntity;
    }

    //SAVE
    //http://localhost:8080/save/admins
    @Override
    @PostMapping("/save/admins")
    public AdminDto createAdmin( @RequestBody AdminDto adminDto) {
        AdminEntity adminEntity=DtoToEntity(adminDto);
        adminRepository.save(adminEntity);
        return adminDto;
    }

    //LIST
    //http://localhost:8080/list/admins
    @GetMapping("/list/admins")
    @Override
    public List<AdminDto> getAllAdmin() {
        List<AdminDto> list=new ArrayList<>();
        Iterable<AdminEntity> listem=adminRepository.findAll();
        for( AdminEntity entity :listem){
            AdminDto adminDto=EntityToDto(entity);
            list.add(adminDto);
        }
        return list;
    }

    @Override
    public ResponseEntity<AdminDto> getAdminById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<AdminDto> updateAdmin(Long id, AdminDto adminDto) {
        return null;
    }

    @Override
    public ResponseEntity<AdminDto> deleteAdmin(Long id) {
        return null;
    }
}
