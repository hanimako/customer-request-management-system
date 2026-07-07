package com.example.internaladmin;

import java.time.LocalDateTime;

public class Request {
    private int applicationId;
    private LocalDateTime applicationDatetime;
    private Boolean approved;
    private String applicantName;
    private String applicantAddress;
    private String applicationDetails;

    public Request(int applicationId, LocalDateTime applicationDatetime, Boolean approved, String applicantName, String applicantAddress, String applicationDetails) {
        this.applicationId = applicationId;
        this.applicationDatetime = applicationDatetime;
        this.approved = approved;
        this.applicantName = applicantName;
        this.applicantAddress = applicantAddress;
        this.applicationDetails = applicationDetails;
    }

    public int getApplicationId() {
        return applicationId;
    }
    public LocalDateTime getApplicationDatetime() {
        return applicationDatetime;
    }
    public Boolean isApproved() {
        return approved;
    }
    public String getApplicantName() {
        return applicantName;
    }
    public String getApplicantAddress() {
        return applicantAddress;
    }
    public String getApplicationDetails() {
        return applicationDetails;
    }
}
