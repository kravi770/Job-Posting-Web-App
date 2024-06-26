package com.DBMSProject.JobPostingWebApp.DAO;

import com.DBMSProject.JobPostingWebApp.Models.getApplicationByJobId;
import com.DBMSProject.JobPostingWebApp.Models.getApplicationByUsernameResponse;
import com.DBMSProject.JobPostingWebApp.Models.postJobApplication;

import java.util.List;

public interface ApplicationDAO {
    public String saveApplication(postJobApplication postJobApplicationObj,String username);
    postJobApplication getApplication(int job_id,String username);
    List<getApplicationByJobId> getApplicationByJobId(int job_id);
    void deleteApplication(int application_id);
    List<getApplicationByUsernameResponse> getApplicationByUsername(String username);
    void updateApplicationStatus(int application_id, String application_status);
}
