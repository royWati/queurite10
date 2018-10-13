package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "system_configuration", schema = "queuerite", catalog = "")
public class SystemConfiguration {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String counterLimit;
    private String isDemo;
    private String licenseKey;
    private String mapUserToCounterKey;

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
    @Column(name = "counter_limit")
    public String getCounterLimit() {
        return counterLimit;
    }

    public void setCounterLimit(String counterLimit) {
        this.counterLimit = counterLimit;
    }

    @Basic
    @Column(name = "is_demo")
    public String getIsDemo() {
        return isDemo;
    }

    public void setIsDemo(String isDemo) {
        this.isDemo = isDemo;
    }

    @Basic
    @Column(name = "license_key")
    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    @Basic
    @Column(name = "map_user_to_counter_key")
    public String getMapUserToCounterKey() {
        return mapUserToCounterKey;
    }

    public void setMapUserToCounterKey(String mapUserToCounterKey) {
        this.mapUserToCounterKey = mapUserToCounterKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemConfiguration that = (SystemConfiguration) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (counterLimit != null ? !counterLimit.equals(that.counterLimit) : that.counterLimit != null) return false;
        if (isDemo != null ? !isDemo.equals(that.isDemo) : that.isDemo != null) return false;
        if (licenseKey != null ? !licenseKey.equals(that.licenseKey) : that.licenseKey != null) return false;
        if (mapUserToCounterKey != null ? !mapUserToCounterKey.equals(that.mapUserToCounterKey) : that.mapUserToCounterKey != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (counterLimit != null ? counterLimit.hashCode() : 0);
        result = 31 * result + (isDemo != null ? isDemo.hashCode() : 0);
        result = 31 * result + (licenseKey != null ? licenseKey.hashCode() : 0);
        result = 31 * result + (mapUserToCounterKey != null ? mapUserToCounterKey.hashCode() : 0);
        return result;
    }
}
