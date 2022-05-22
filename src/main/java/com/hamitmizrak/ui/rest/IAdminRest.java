package com.hamitmizrak.ui.rest;

import com.hamitmizrak.business.dto.AdminDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IAdminRest {

    //SAVE
    AdminDto createAdmin(AdminDto adminDto);

    //LIST
    List<AdminDto> getAdminList();

    //FIND
    ResponseEntity<AdminDto> getAdminById(Long id);

    //UPDATE
    ResponseEntity<AdminDto> updateAdminDto(Long id, AdminDto AdminDto);

    //DELETE
    ResponseEntity<Map<String,Boolean>> deleteAdmin(Long id);
}
