package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.conditional.IfAction;

@Service
public class TopicService {
    // so this is the data that the service is providing , in many cases it can be the data that the service retrives from the db and then provides it to the controller that 
    // then sends it to the front end
     private List<topic> topics = new ArrayList <>(Arrays.asList(
        new topic("id", "name", "descrition"),
        new topic("id", "name", "descrition")
    ));


    public List<topic>  getAllTopics() {
        return topics;
    }

    public topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        
    }

	public void addTopic(topic top) {
        topics.add(top);
	}

	public void updateTopic(topic top,String id) {
        // topics.forEach((el) -> if (el.getId().equals(id) ){el = top})

        //should be a more elegant way to do this but for now :
        for(int i =0;i<topics.size();i++){
            topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i, top);
                return;
            }
        }
    }
    
    public void delTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
        return;
    }
   
}