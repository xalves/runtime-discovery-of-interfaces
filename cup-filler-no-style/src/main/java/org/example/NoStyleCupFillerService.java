package org.example;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("WithNoStyle")
public class NoStyleCupFillerService implements CupFillerProvider{
    @Override
    public void fillCup(Map<String, Object> context) {
        System.out.println("Filling the cup with no style!");
    }
}
