package com.example.demo.topic;



public class topic {

    private String id;
    private String name;
    private String description;

    public  topic() {
        
    }

    public   topic(final String id, final String name, final String descrition) {
        super();
        this.description=descrition;
        this.name=name;
        this.id=id;

    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}