package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    // so this is the data that the service is providing , in many cases it can be the data that the service retrives from the db and then provides it to the controller that 
    // then sends it to the front end
     private List<topic> topics = Arrays.asList(
        new topic("id", "name", "descrition"),
        new topic("id", "name", "descrition")
    );


    public List<topic>  getAllTopics() {
        return topics;
    }

    public topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        
    }
   
}