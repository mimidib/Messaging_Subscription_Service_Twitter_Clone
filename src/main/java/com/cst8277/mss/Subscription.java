package com.cst8277.mss;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {
    @EmbeddedId
    private SubscriptionPK subscriptionPK; //Composite PK -Reference SubscriptionPK for the composite primary key class

    //getters and setters
    public SubscriptionPK getSubscriptionPK() {
        return subscriptionPK;
    }

    public void setSubscriptionPK(SubscriptionPK subscriptionPK) {
        this.subscriptionPK = subscriptionPK;
    }
}
