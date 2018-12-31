package com.example.demo.model;

public class Thing {

    private int id;
    private String foo;
    private String bar;

    public Thing(int id, String foo, String bar) {
        this.id = id;
        this.foo = foo;
        this.bar = bar;
    }

    public int getId() {
        return this.id;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }
}
