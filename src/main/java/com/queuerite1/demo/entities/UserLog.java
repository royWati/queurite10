package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_log", schema = "queuerite", catalog = "")
public class UserLog {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String ipAddress;
    private Timestamp time;
    private String userLogType;
    private Long userId;

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
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "user_log_type")
    public String getUserLogType() {
        return userLogType;
    }

    public void setUserLogType(String userLogType) {
        this.userLogType = userLogType;
    }

    @Basic
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLog userLog = (UserLog) o;

        if (id != userLog.id) return false;
        if (valid != userLog.valid) return false;
        if (createdOn != null ? !createdOn.equals(userLog.createdOn) : userLog.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(userLog.updatedOn) : userLog.updatedOn != null) return false;
        if (ipAddress != null ? !ipAddress.equals(userLog.ipAddress) : userLog.ipAddress != null) return false;
        if (time != null ? !time.equals(userLog.time) : userLog.time != null) return false;
        if (userLogType != null ? !userLogType.equals(userLog.userLogType) : userLog.userLogType != null) return false;
        if (userId != null ? !userId.equals(userLog.userId) : userLog.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (userLogType != null ? userLogType.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
