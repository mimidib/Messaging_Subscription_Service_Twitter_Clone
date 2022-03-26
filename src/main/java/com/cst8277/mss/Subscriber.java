package com.cst8277.mss;

import javax.persistence.*;

@Entity
@Table(name="subscriber")
public class Subscriber {
    //id is not auto incremented, it references the user id from ums tables
    @Id
    private int s_id;
    private String comment;

    //getters and setters
    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
