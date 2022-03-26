package com.cst8277.mss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    //Get all messages
    @GetMapping("/messages")
    public @ResponseBody Iterable<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    //Get all messages by a specific producer
    @GetMapping("/producermessages")
    public @ResponseBody Iterable<Message> getProducerMessages(@RequestParam int producer_id){
        return messageRepository.getProducerMessages(producer_id);
    }
}
