package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "survey_user_rating_item", schema = "queuerite", catalog = "")
public class SurveyUserRatingItem {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String comments;
    private String starRating;
    private Long surveyUserRatingId;
    private long userId;

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
    @Column(name = "star_rating")
    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    @Basic
    @Column(name = "survey_user_rating_id")
    public Long getSurveyUserRatingId() {
        return surveyUserRatingId;
    }

    public void setSurveyUserRatingId(Long surveyUserRatingId) {
        this.surveyUserRatingId = surveyUserRatingId;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyUserRatingItem that = (SurveyUserRatingItem) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (userId != that.userId) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (starRating != null ? !starRating.equals(that.starRating) : that.starRating != null) return false;
        if (surveyUserRatingId != null ? !surveyUserRatingId.equals(that.surveyUserRatingId) : that.surveyUserRatingId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (starRating != null ? starRating.hashCode() : 0);
        result = 31 * result + (surveyUserRatingId != null ? surveyUserRatingId.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
}
