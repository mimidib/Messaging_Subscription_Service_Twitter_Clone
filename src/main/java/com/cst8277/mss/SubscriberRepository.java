package com.cst8277.mss;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubscriberRepository extends CrudRepository<Message, Integer> {
    //CrudRepository<T,ID> T is the repository ID is the specific type

    //Get all messages for a specific subscriber subscribed to multiple producers
        @Query(value = "Select mssdb.message.id, mssdb.message.content, mssdb.message.created, mssdb.message.producer_id, mssdb.subscriber.s_id " +
                "FROM mssdb.message " +
                "JOIN mssdb.producer " +
                "ON mssdb.message.producer_id = mssdb.producer.p_id " +
                "JOIN mssdb.subscription " +
                "ON mssdb.message.producer_id = mssdb.subscription.producer_p_id " +
                "AND mssdb.producer.p_id = mssdb.subscription.producer_p_id " +
                "JOIN mssdb.subscriber " +
                "ON mssdb.subscription.subscriber_s_id = mssdb.subscriber.s_id " +
                "WHERE mssdb.subscriber.s_id = ?1", nativeQuery = true)
        List<Message> getAllSubscriberMessages(int s_id); //Referencing subscriber.s_id here for where clause RequestParam
    }
