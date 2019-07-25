package com.hls.beans;

import java.io.Serializable;

public class Girl implements Serializable {


    private String name;

    private Integer ago;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgo() {
        return ago;
    }

    public void setAgo(Integer ago) {
        this.ago = ago;
    }
}
