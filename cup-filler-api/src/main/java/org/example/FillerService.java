package org.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class FillerService {

    @Autowired
    ApplicationContextProvider applicationContextProvider;
    public void fillCup(Map<String, Object> context) throws Exception {
        System.out.println("Looking for the type of filling needed...");

        final String type = (String) context.get("type");
        if(type == null || type.equals("")){
            throw new Exception("Type needs to be provided.");
        }
        switch (type) {
        case "WithNoStyle" -> getTypeImplementation("WithNoStyle").fillCup(context);
        case "WithStyle" -> getTypeImplementation("WithStyle").fillCup(context);
        default -> throw new Exception("this type is not correctly configured. The type provided was " + type);
        }
    }

    private CupFillerProvider getTypeImplementation(String type){
        ApplicationContext applicationContext = applicationContextProvider.getApplicationContext();
        return (CupFillerProvider) applicationContext.getBean(type);

    }
}
