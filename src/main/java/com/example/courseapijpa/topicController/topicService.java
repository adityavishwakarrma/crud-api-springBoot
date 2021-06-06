package com.example.courseapijpa.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class topicService{

    @Autowired
    private topicRepository TopicRepository;

    public List<topics> getAlltopics(){           // get everything
        ArrayList<topics> Topics=new ArrayList<>();
        TopicRepository.findAll()
          .forEach(Topics::add);
        return Topics;
    }
                                                   //get single entity
    public Optional<topics> getTopic(String id){
       return TopicRepository.findById(id);
    }
                                                  // to insert an entity
    public void addtopic(topics topic) {
        TopicRepository.save(topic);
    }
                                                  // to update an entity
    public void updatetopic(String id,topics topic) {
        TopicRepository.save(topic);
            }
                                                 // to delete an entity
    public void deletetopics(String id){
           TopicRepository.deleteById(id);
}



}
