package com.hamitmizrak.business.services;

import com.hamitmizrak.business.dto.AdminDto;
import com.hamitmizrak.data.entity.AdminEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface AdminServices {

    //ModelMapper
    public AdminDto EntityToDto(AdminEntity adminEntity);
    public AdminEntity DtoToEntity(AdminDto adminDto);

    //save
    public AdminDto createAdmin(AdminDto adminDto);

    //list
    public List<AdminDto>  getAllAdmin();

    //find
    public ResponseEntity<AdminDto> getAdminById(Long id);

    //update
    public ResponseEntity<AdminDto>  updateAdmin(Long id,AdminDto adminDto);

    //delete
    public  ResponseEntity<Map<String,Boolean>> deleteAdmin(Long id);

}
