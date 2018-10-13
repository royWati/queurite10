package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "service_schedule_time", schema = "queuerite", catalog = "")
public class ServiceScheduleTime {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String availableTimeEnd;
    private String availableTimeStart;
    private Integer capacity;
    private Long holidayId;
    private Long serviceScheduleId;
    private Long serviceHolidayId;

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
    @Column(name = "available_time_end")
    public String getAvailableTimeEnd() {
        return availableTimeEnd;
    }

    public void setAvailableTimeEnd(String availableTimeEnd) {
        this.availableTimeEnd = availableTimeEnd;
    }

    @Basic
    @Column(name = "available_time_start")
    public String getAvailableTimeStart() {
        return availableTimeStart;
    }

    public void setAvailableTimeStart(String availableTimeStart) {
        this.availableTimeStart = availableTimeStart;
    }

    @Basic
    @Column(name = "capacity")
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "holiday_id")
    public Long getHolidayId() {
        return holidayId;
    }

    public void setHolidayId(Long holidayId) {
        this.holidayId = holidayId;
    }

    @Basic
    @Column(name = "service_schedule_id")
    public Long getServiceScheduleId() {
        return serviceScheduleId;
    }

    public void setServiceScheduleId(Long serviceScheduleId) {
        this.serviceScheduleId = serviceScheduleId;
    }

    @Basic
    @Column(name = "service_holiday_id")
    public Long getServiceHolidayId() {
        return serviceHolidayId;
    }

    public void setServiceHolidayId(Long serviceHolidayId) {
        this.serviceHolidayId = serviceHolidayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceScheduleTime that = (ServiceScheduleTime) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (availableTimeEnd != null ? !availableTimeEnd.equals(that.availableTimeEnd) : that.availableTimeEnd != null)
            return false;
        if (availableTimeStart != null ? !availableTimeStart.equals(that.availableTimeStart) : that.availableTimeStart != null)
            return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (holidayId != null ? !holidayId.equals(that.holidayId) : that.holidayId != null) return false;
        if (serviceScheduleId != null ? !serviceScheduleId.equals(that.serviceScheduleId) : that.serviceScheduleId != null)
            return false;
        if (serviceHolidayId != null ? !serviceHolidayId.equals(that.serviceHolidayId) : that.serviceHolidayId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (availableTimeEnd != null ? availableTimeEnd.hashCode() : 0);
        result = 31 * result + (availableTimeStart != null ? availableTimeStart.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (holidayId != null ? holidayId.hashCode() : 0);
        result = 31 * result + (serviceScheduleId != null ? serviceScheduleId.hashCode() : 0);
        result = 31 * result + (serviceHolidayId != null ? serviceHolidayId.hashCode() : 0);
        return result;
    }
}
