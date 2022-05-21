package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AdminDto {
    private long adminId;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
}
