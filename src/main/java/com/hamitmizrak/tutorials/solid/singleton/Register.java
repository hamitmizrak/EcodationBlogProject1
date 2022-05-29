package com.hamitmizrak.tutorials.solid.singleton;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Tek sorumluluk: Tek metot tek classs
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Register {

    private String name;
    private String surname;
    private String password;



}
