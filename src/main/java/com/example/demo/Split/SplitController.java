package com.example.demo.Split;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplitController {

    private Split split;

    @Autowired
    public SplitController(@Qualifier("noSplit") Split split){
        this.split = split;
    }

    @GetMapping("/split")
    public String pickYourSplit(){
        return "Pick Your Split: " + split.toString();
    }

}
