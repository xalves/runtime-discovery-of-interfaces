package org.example;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App
{
    @Autowired
    public CupFillerService cupFillerService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void setupBeans() throws Exception {
        cupFillerService.fillCup(Map.of("type", "WithStyle"));
        cupFillerService.fillCup(Map.of("type", "WithNoStyle"));
    }
}
