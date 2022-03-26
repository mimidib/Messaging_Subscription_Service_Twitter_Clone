package com.cst8277.mss;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionPK implements Serializable { //this class is the creation of Subscription Composite primary key : https://wecancode.live/composite-key-with-jpa-and-hibernate/
    @Column(name = "producer_id")
    private int producer_p_id;
    @Column(name = "subscriber_s_id")
    private int subscriber_s_id;

    public int getProducer_p_id() {
        return producer_p_id;
    }

    public int getSubscriber_s_id() {
        return subscriber_s_id;
    }

    //equals, hashcode definitions will allow identifying the same object at different sessions
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscriptionPK))return false;
        SubscriptionPK that = (SubscriptionPK) o;
        return Objects.equals(getSubscriber_s_id(), that.getSubscriber_s_id()) &&
                Objects.equals(getProducer_p_id(), that.getProducer_p_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubscriber_s_id(), getProducer_p_id());
    }
}
