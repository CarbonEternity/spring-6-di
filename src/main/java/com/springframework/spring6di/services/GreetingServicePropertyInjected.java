package com.springframework.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("propertyGreetingService")
@Service
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Property Injected Service!!!";
    }
}
