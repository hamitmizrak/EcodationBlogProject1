package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//security: inactive
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
//Auditing calismasi icin izin
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EcodationBlogProject1Application {

    public static void main(String[] args) {
        //devtool active-passive
        System.setProperty("spring.devtools.restart.enabled","false");

        //JOptionPanel AWT active passsive
        System.setProperty("java.awt.headless", "false"); //Disables headless

        SpringApplication.run(EcodationBlogProject1Application.class, args);
    }

}
