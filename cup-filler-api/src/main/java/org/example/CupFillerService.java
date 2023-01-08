package org.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CupFillerService {

    @Autowired
    private FillerService fillerService;

    public void fillCup(Map<String, Object> context) throws Exception {
        fillerService.fillCup(context);
    }

}
