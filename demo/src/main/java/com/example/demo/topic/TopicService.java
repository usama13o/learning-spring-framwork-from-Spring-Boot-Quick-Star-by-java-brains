package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    // so this is the data that the service is providing , in many cases it can be the data that the service retrives from the db and then provides it to the controller that 
    // then sends it to the front end

    @Autowired
    private TopicRepository topicrepo;
    
     private List<topic> topics = new ArrayList <>(Arrays.asList(
        new topic("1", "java", "java descrition"),
        new topic("2", "python ", " python descrition")
    ));


    public List<topic>  getAllTopics() {
        //old way : return the array we created above 
       

        List<topic> topics = new ArrayList<>();

        //Returns all instances of the type.
        topicrepo.findAll().forEach(topics :: add);
        return topics;
    }

    public topic getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        
        return  topicrepo.findById(id).get();
    }

	public void addTopic(topic top) {
        // topics.add(top); 

        //using the CrudRepo
        topicrepo.save(top);
	}

	public void updateTopic(topic top,String id) {
        // topics.forEach((el) -> if (el.getId().equals(id) ){el = top})

        //should be a more elegant way to do this but for now : (old way)
        // for(int i =0;i<topics.size();i++){
        //     topic t = topics.get(i);
        //     if (t.getId().equals(id)){
        //         topics.set(i, top);
        //         return;
        //     }
        // }

        topicrepo.save(top);
        return;
    }
    
    public void delTopic(String id) {
        // topics.removeIf(t -> t.getId().equals(id));


        topicrepo.deleteById(id);
        return;

    }
   
}