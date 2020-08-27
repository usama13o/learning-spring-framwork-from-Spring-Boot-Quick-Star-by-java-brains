package com.example.demo.topic;

import org.springframework.data.repository.CrudRepository;


// building my own repo using the spring one , to use the methods that we need 
// Interface for generic CRUD operations on a repository for a specific type.
   
public interface TopicRepository extends CrudRepository<topic, String>{
// to extend Crud Repo weneed the type/name of entity and the type of the ID of that entity 

// no matter what your entitiy is they share the same operations done on them 
// such as : 

    //getAllTopics()
    //getTopic(String id)
    //updateTopic(String id)
    //deleteTopic(String id)

 



}