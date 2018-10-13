package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Service {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String code;
    private String description;
    private Integer endNumber;
    private Boolean hidden;
    private String name;
    private String prefix;
    private Integer startNumber;
    private Boolean canQueueFromSms;
    private Integer defProcTime;
    private Boolean hasAppointment;
    private Integer queueSmsId;
    private Long serviceGroup;

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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "end_number")
    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    @Basic
    @Column(name = "hidden")
    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "prefix")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "start_number")
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    @Basic
    @Column(name = "can_queue_from_sms")
    public Boolean getCanQueueFromSms() {
        return canQueueFromSms;
    }

    public void setCanQueueFromSms(Boolean canQueueFromSms) {
        this.canQueueFromSms = canQueueFromSms;
    }

    @Basic
    @Column(name = "def_proc_time")
    public Integer getDefProcTime() {
        return defProcTime;
    }

    public void setDefProcTime(Integer defProcTime) {
        this.defProcTime = defProcTime;
    }

    @Basic
    @Column(name = "has_appointment")
    public Boolean getHasAppointment() {
        return hasAppointment;
    }

    public void setHasAppointment(Boolean hasAppointment) {
        this.hasAppointment = hasAppointment;
    }

    @Basic
    @Column(name = "queue_sms_id")
    public Integer getQueueSmsId() {
        return queueSmsId;
    }

    public void setQueueSmsId(Integer queueSmsId) {
        this.queueSmsId = queueSmsId;
    }

    @Basic
    @Column(name = "service_group")
    public Long getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(Long serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (id != service.id) return false;
        if (valid != service.valid) return false;
        if (createdOn != null ? !createdOn.equals(service.createdOn) : service.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(service.updatedOn) : service.updatedOn != null) return false;
        if (code != null ? !code.equals(service.code) : service.code != null) return false;
        if (description != null ? !description.equals(service.description) : service.description != null) return false;
        if (endNumber != null ? !endNumber.equals(service.endNumber) : service.endNumber != null) return false;
        if (hidden != null ? !hidden.equals(service.hidden) : service.hidden != null) return false;
        if (name != null ? !name.equals(service.name) : service.name != null) return false;
        if (prefix != null ? !prefix.equals(service.prefix) : service.prefix != null) return false;
        if (startNumber != null ? !startNumber.equals(service.startNumber) : service.startNumber != null) return false;
        if (canQueueFromSms != null ? !canQueueFromSms.equals(service.canQueueFromSms) : service.canQueueFromSms != null)
            return false;
        if (defProcTime != null ? !defProcTime.equals(service.defProcTime) : service.defProcTime != null) return false;
        if (hasAppointment != null ? !hasAppointment.equals(service.hasAppointment) : service.hasAppointment != null)
            return false;
        if (queueSmsId != null ? !queueSmsId.equals(service.queueSmsId) : service.queueSmsId != null) return false;
        if (serviceGroup != null ? !serviceGroup.equals(service.serviceGroup) : service.serviceGroup != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (endNumber != null ? endNumber.hashCode() : 0);
        result = 31 * result + (hidden != null ? hidden.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (startNumber != null ? startNumber.hashCode() : 0);
        result = 31 * result + (canQueueFromSms != null ? canQueueFromSms.hashCode() : 0);
        result = 31 * result + (defProcTime != null ? defProcTime.hashCode() : 0);
        result = 31 * result + (hasAppointment != null ? hasAppointment.hashCode() : 0);
        result = 31 * result + (queueSmsId != null ? queueSmsId.hashCode() : 0);
        result = 31 * result + (serviceGroup != null ? serviceGroup.hashCode() : 0);
        return result;
    }
}
