package com.rendon.factories;

import com.rendon.models.Stone;
import lombok.extern.java.Log;

import java.util.Optional;

@Log
public abstract class ConfigurableStoneFactory {

    public abstract Stone createStone();

    protected boolean isSingleton(){
        final var scopeOpt= Optional.ofNullable(System.getProperty("scope"));

        final var scope= scopeOpt.orElse("singleton");
        log.info("Scope: "+scope);
        return "singleton".equals(scope);
    }
}
