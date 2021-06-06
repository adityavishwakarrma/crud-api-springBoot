package com.example.courseapijpa.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class topicController {

    @Autowired
    private topicService TopicService;

    @RequestMapping("/topics")       // get-all
    public List<topics> topic_list(){

        return TopicService.getAlltopics();
    }
    @RequestMapping("/topics/{id}")    //get method - read
    public Optional<topics> getTopic(@PathVariable String id){
        return TopicService.getTopic(id);
    }
                                              // post method - create
    @RequestMapping(method=RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody topics topic){
          TopicService.addtopic(topic);
    }
                                                //put method -update
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}" )
    public void updateTopic(@PathVariable String id,@RequestBody topics topic ){
        TopicService.updatetopic(id,topic);
    }

                                     //delete method involving post - delete
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
    TopicService.deletetopics(id);
    }

}
