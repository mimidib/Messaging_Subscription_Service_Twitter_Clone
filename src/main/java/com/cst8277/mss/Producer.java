package com.cst8277.mss;

import javax.persistence.*;

@Entity
@Table(name="producer")
public class Producer {
    //id is not auto incremented, it references the user id from ums tables
    @Id
    private int p_id;
    private String comment;

    //getters and setters
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
