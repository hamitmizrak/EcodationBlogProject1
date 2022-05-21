package com.hamitmizrak.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    //Java 8 Optional
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Hamit Mızrak");
    }
}
