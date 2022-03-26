package com.cst8277.mss;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable { //Reference SubscriptionPK for creation of composite primary key class

    @EmbeddedId
    private SubscriptionPK subscriptionPK; //Composite PK

    //getters and setters
    public SubscriptionPK getSubscriptionPK() {
        return subscriptionPK;
    }

    public void setSubscriptionPK(SubscriptionPK subscriptionPK) {
        this.subscriptionPK = subscriptionPK;
    }
}
