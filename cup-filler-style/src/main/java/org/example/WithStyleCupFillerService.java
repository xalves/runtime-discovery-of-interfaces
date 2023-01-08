package org.example;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service("WithStyle")
public class WithStyleCupFillerService implements CupFillerProvider {
    @Override
    public void fillCup(Map<String, Object> context) {
        System.out.println("Filling the cup with a lot of style!");
    }
}
