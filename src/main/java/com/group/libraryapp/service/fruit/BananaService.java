package com.group.libraryapp.service.fruit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("QualifierTest")
public class BananaService implements FruitService {
    @Override
    public void interfaceTest() {
        System.out.println("BananaService");
    }
}
