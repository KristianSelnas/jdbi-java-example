package com.example.demo.api;

import com.example.demo.model.Thing;
import com.example.demo.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThingController {

    private ThingRepository thingRepository;

    @Autowired
    public ThingController(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @GetMapping("/things")
    public List<Thing> things() {
        return thingRepository.getThings();
    }
}
