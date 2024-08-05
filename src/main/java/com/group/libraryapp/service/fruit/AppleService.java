package com.group.libraryapp.service.fruit;

import org.springframework.stereotype.Service;

@Service
public class AppleService implements FruitService {
    @Override
    public void interfaceTest() {
        System.out.println("AppleService");
    }
}
