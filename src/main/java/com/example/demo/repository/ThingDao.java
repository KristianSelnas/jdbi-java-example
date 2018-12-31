package com.example.demo.repository;

import com.example.demo.model.Thing;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface ThingDao {

    @RegisterConstructorMapper(Thing.class)
    @SqlQuery("SELECT * FROM thing")
    List<Thing> getThings();
}
