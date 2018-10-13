package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "queue_log", schema = "queuerite", catalog = "")
public class QueueLog {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private Timestamp logDateTime;
    private String logType;
    private String queueType;
    private Long queueId;
    private Long sectionId;
    private Long userId;
    private Boolean fromSms;

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
    @Column(name = "log_date_time")
    public Timestamp getLogDateTime() {
        return logDateTime;
    }

    public void setLogDateTime(Timestamp logDateTime) {
        this.logDateTime = logDateTime;
    }

    @Basic
    @Column(name = "log_type")
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Basic
    @Column(name = "queue_type")
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    @Basic
    @Column(name = "queue_id")
    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    @Basic
    @Column(name = "section_id")
    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "from_sms")
    public Boolean getFromSms() {
        return fromSms;
    }

    public void setFromSms(Boolean fromSms) {
        this.fromSms = fromSms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueueLog queueLog = (QueueLog) o;

        if (id != queueLog.id) return false;
        if (valid != queueLog.valid) return false;
        if (createdOn != null ? !createdOn.equals(queueLog.createdOn) : queueLog.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(queueLog.updatedOn) : queueLog.updatedOn != null) return false;
        if (logDateTime != null ? !logDateTime.equals(queueLog.logDateTime) : queueLog.logDateTime != null)
            return false;
        if (logType != null ? !logType.equals(queueLog.logType) : queueLog.logType != null) return false;
        if (queueType != null ? !queueType.equals(queueLog.queueType) : queueLog.queueType != null) return false;
        if (queueId != null ? !queueId.equals(queueLog.queueId) : queueLog.queueId != null) return false;
        if (sectionId != null ? !sectionId.equals(queueLog.sectionId) : queueLog.sectionId != null) return false;
        if (userId != null ? !userId.equals(queueLog.userId) : queueLog.userId != null) return false;
        if (fromSms != null ? !fromSms.equals(queueLog.fromSms) : queueLog.fromSms != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (logDateTime != null ? logDateTime.hashCode() : 0);
        result = 31 * result + (logType != null ? logType.hashCode() : 0);
        result = 31 * result + (queueType != null ? queueType.hashCode() : 0);
        result = 31 * result + (queueId != null ? queueId.hashCode() : 0);
        result = 31 * result + (sectionId != null ? sectionId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (fromSms != null ? fromSms.hashCode() : 0);
        return result;
    }
}
