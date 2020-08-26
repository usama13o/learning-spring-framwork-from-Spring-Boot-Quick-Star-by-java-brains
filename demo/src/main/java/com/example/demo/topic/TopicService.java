package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
     private List<topic> topics = Arrays.asList(
        new topic("id", "name", "descrition"),
        new topic("id", "name", "descrition")
    );


    public List<topic>  getAllTopics() {
        return topics;
    }
}