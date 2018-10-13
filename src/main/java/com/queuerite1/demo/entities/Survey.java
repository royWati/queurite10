package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Survey {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String comments;
    private String surveyType;
    private long queueId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "updated_on")
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Basic
    @Column(name = "valid")
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "survey_type")
    public String getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    @Basic
    @Column(name = "queue_id")
    public long getQueueId() {
        return queueId;
    }

    public void setQueueId(long queueId) {
        this.queueId = queueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Survey survey = (Survey) o;

        if (id != survey.id) return false;
        if (valid != survey.valid) return false;
        if (queueId != survey.queueId) return false;
        if (createdOn != null ? !createdOn.equals(survey.createdOn) : survey.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(survey.updatedOn) : survey.updatedOn != null) return false;
        if (comments != null ? !comments.equals(survey.comments) : survey.comments != null) return false;
        if (surveyType != null ? !surveyType.equals(survey.surveyType) : survey.surveyType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (surveyType != null ? surveyType.hashCode() : 0);
        result = 31 * result + (int) (queueId ^ (queueId >>> 32));
        return result;
    }
}
