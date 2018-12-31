package com.example.demo.repository;

import com.example.demo.model.Thing;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThingRepository {

    private Jdbi jdbi;

    @Autowired
    public ThingRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public List<Thing> getThings() {
        return this.jdbi.withExtension(ThingDao.class, ThingDao::getThings);
    }
}
