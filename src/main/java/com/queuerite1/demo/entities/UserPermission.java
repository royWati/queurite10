package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_permission", schema = "queuerite", catalog = "")
public class UserPermission {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private Boolean disabledActivityMonitoring;
    private Boolean disabledAds;
    private Boolean disabledConfiguration;
    private Boolean disabledManage;
    private Boolean disabledReports;
    private Boolean disabledUsers;
    private long userId;
    private Boolean disabledServiceGroup;
    private Boolean disabledServiceSurvey;

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
    @Column(name = "disabled_activity_monitoring")
    public Boolean getDisabledActivityMonitoring() {
        return disabledActivityMonitoring;
    }

    public void setDisabledActivityMonitoring(Boolean disabledActivityMonitoring) {
        this.disabledActivityMonitoring = disabledActivityMonitoring;
    }

    @Basic
    @Column(name = "disabled_ads")
    public Boolean getDisabledAds() {
        return disabledAds;
    }

    public void setDisabledAds(Boolean disabledAds) {
        this.disabledAds = disabledAds;
    }

    @Basic
    @Column(name = "disabled_configuration")
    public Boolean getDisabledConfiguration() {
        return disabledConfiguration;
    }

    public void setDisabledConfiguration(Boolean disabledConfiguration) {
        this.disabledConfiguration = disabledConfiguration;
    }

    @Basic
    @Column(name = "disabled_manage")
    public Boolean getDisabledManage() {
        return disabledManage;
    }

    public void setDisabledManage(Boolean disabledManage) {
        this.disabledManage = disabledManage;
    }

    @Basic
    @Column(name = "disabled_reports")
    public Boolean getDisabledReports() {
        return disabledReports;
    }

    public void setDisabledReports(Boolean disabledReports) {
        this.disabledReports = disabledReports;
    }

    @Basic
    @Column(name = "disabled_users")
    public Boolean getDisabledUsers() {
        return disabledUsers;
    }

    public void setDisabledUsers(Boolean disabledUsers) {
        this.disabledUsers = disabledUsers;
    }

    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "disabled_service_group")
    public Boolean getDisabledServiceGroup() {
        return disabledServiceGroup;
    }

    public void setDisabledServiceGroup(Boolean disabledServiceGroup) {
        this.disabledServiceGroup = disabledServiceGroup;
    }

    @Basic
    @Column(name = "disabled_service_survey")
    public Boolean getDisabledServiceSurvey() {
        return disabledServiceSurvey;
    }

    public void setDisabledServiceSurvey(Boolean disabledServiceSurvey) {
        this.disabledServiceSurvey = disabledServiceSurvey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPermission that = (UserPermission) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (userId != that.userId) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (disabledActivityMonitoring != null ? !disabledActivityMonitoring.equals(that.disabledActivityMonitoring) : that.disabledActivityMonitoring != null)
            return false;
        if (disabledAds != null ? !disabledAds.equals(that.disabledAds) : that.disabledAds != null) return false;
        if (disabledConfiguration != null ? !disabledConfiguration.equals(that.disabledConfiguration) : that.disabledConfiguration != null)
            return false;
        if (disabledManage != null ? !disabledManage.equals(that.disabledManage) : that.disabledManage != null)
            return false;
        if (disabledReports != null ? !disabledReports.equals(that.disabledReports) : that.disabledReports != null)
            return false;
        if (disabledUsers != null ? !disabledUsers.equals(that.disabledUsers) : that.disabledUsers != null)
            return false;
        if (disabledServiceGroup != null ? !disabledServiceGroup.equals(that.disabledServiceGroup) : that.disabledServiceGroup != null)
            return false;
        if (disabledServiceSurvey != null ? !disabledServiceSurvey.equals(that.disabledServiceSurvey) : that.disabledServiceSurvey != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (disabledActivityMonitoring != null ? disabledActivityMonitoring.hashCode() : 0);
        result = 31 * result + (disabledAds != null ? disabledAds.hashCode() : 0);
        result = 31 * result + (disabledConfiguration != null ? disabledConfiguration.hashCode() : 0);
        result = 31 * result + (disabledManage != null ? disabledManage.hashCode() : 0);
        result = 31 * result + (disabledReports != null ? disabledReports.hashCode() : 0);
        result = 31 * result + (disabledUsers != null ? disabledUsers.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (disabledServiceGroup != null ? disabledServiceGroup.hashCode() : 0);
        result = 31 * result + (disabledServiceSurvey != null ? disabledServiceSurvey.hashCode() : 0);
        return result;
    }
}
