package com.cst8277.mss;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    //Get all messages by a specific producer
    @Query("FROM Message WHERE producer_id = ?1")
    List<Message> getProducerMessages(int producer_id);
}
