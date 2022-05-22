package com.hamitmizrak.ui.rest.impl;

import com.hamitmizrak.business.dto.AdminDto;
import com.hamitmizrak.business.services.AdminServices;
import com.hamitmizrak.ui.rest.IAdminRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminRest implements IAdminRest {

    @Autowired
    AdminServices adminServices;


    //ROOT
    //http://localhost:8080/api/v1
    //http://localhost:8080/api/v1/index
    @GetMapping({"/", "/index"})
    public String getRoot() {
        return "index";
    }

    //SAVE
    //http://localhost:8080/api/v1/admins
    @Override
    @PostMapping("/admins")
    public AdminDto createAdmin(@RequestBody  AdminDto adminDto) {
        adminServices.createAdmin(adminDto);
        return adminDto;
    }


    //LIST
    //http://localhost:8080/api/v1/admins
    @Override
    @GetMapping("/admins")
    public List<AdminDto> getAdminList() {
        return adminServices.getAllAdmin();
    }


    //FIND
    //http://localhost:8080/api/v1/admins/1
    @Override
    @GetMapping("/admins/{id}")
    public ResponseEntity<AdminDto> getAdminById(@PathVariable(name="id")   Long id) {
        ResponseEntity<AdminDto> entity=adminServices.getAdminById(id);
        return entity;
    }


    //UPDATE
    //http://localhost:8080/api/v1/admins/1
    @Override
    @PutMapping("/admins/{id}")
    public ResponseEntity<AdminDto> updateAdminDto(@PathVariable(name="id")    Long id, @RequestBody  AdminDto adminDto) {
        adminServices.updateAdmin(id,adminDto);
        return ResponseEntity.ok(adminDto);
    }


    //DELETE
    //http://localhost:8080/api/v1/admins/1
    @Override
    @DeleteMapping("/admins/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAdmin(@PathVariable(name="id") Long id) {
        adminServices.deleteAdmin(id);
        Map<String,Boolean> response=new HashMap<>();
        response.put("silindi",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
