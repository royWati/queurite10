package com.queuerite1.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_user_rating", schema = "queuerite", catalog = "")
public class SurveyUserRating {
    private long surveyId;

    @Id
    @Column(name = "survey_id")
    public long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(long surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyUserRating that = (SurveyUserRating) o;

        if (surveyId != that.surveyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (surveyId ^ (surveyId >>> 32));
    }
}
