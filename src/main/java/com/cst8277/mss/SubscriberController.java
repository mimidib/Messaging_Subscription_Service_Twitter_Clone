package com.cst8277.mss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {
    @Autowired
    SubscriberRepository subscriberRepository;
    //Get all messages for a specific subscriber
    @GetMapping("/subscribermessages")
    public @ResponseBody Iterable<Message> getAllSubscriberMessages(@RequestParam int s_id){ //ref subscriber id here
        return subscriberRepository.getAllSubscriberMessages(s_id); //ref subscriber id here
    }
}
