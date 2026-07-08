package com.example.internaladmin;

import java.time.LocalDateTime;

public class Request {
    private int id;
    private LocalDateTime requestDatetime;
    private Boolean approved;
    private String requesterName;
    private String requesterAddress;
    private String content;

    public Request(int id, LocalDateTime requestDatetime, Boolean approved, String requesterName, String requesterAddress, String content) {
        this.id = id;
        this.requestDatetime = requestDatetime;
        this.approved = approved;
        this.requesterName = requesterName;
        this.requesterAddress = requesterAddress;
        this.content = content;
    }

    public int getId() {
        return id;
    }
    public LocalDateTime getRequestDatetime() {
        return requestDatetime;
    }
    public Boolean isApproved() {
        return approved;
    }
    public String getRequesterName() {
        return requesterName;
    }
    public String getRequesterAddress() {
        return requesterAddress;
    }
    public String getContent() {
        return content;
    }
}
