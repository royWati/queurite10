package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "audit_trail", schema = "queuerite", catalog = "")
public class AuditTrail {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String auditGroup;
    private String auditStatus;
    private String auditType;
    private String entityClass;
    private Long entityId;
    private String valueAfter;
    private String valueBefore;
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
    @Column(name = "audit_group")
    public String getAuditGroup() {
        return auditGroup;
    }

    public void setAuditGroup(String auditGroup) {
        this.auditGroup = auditGroup;
    }

    @Basic
    @Column(name = "audit_status")
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Basic
    @Column(name = "audit_type")
    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    @Basic
    @Column(name = "entity_class")
    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Basic
    @Column(name = "entity_id")
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "value_after")
    public String getValueAfter() {
        return valueAfter;
    }

    public void setValueAfter(String valueAfter) {
        this.valueAfter = valueAfter;
    }

    @Basic
    @Column(name = "value_before")
    public String getValueBefore() {
        return valueBefore;
    }

    public void setValueBefore(String valueBefore) {
        this.valueBefore = valueBefore;
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

        AuditTrail that = (AuditTrail) o;

        if (id != that.id) return false;
        if (valid != that.valid) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (auditGroup != null ? !auditGroup.equals(that.auditGroup) : that.auditGroup != null) return false;
        if (auditStatus != null ? !auditStatus.equals(that.auditStatus) : that.auditStatus != null) return false;
        if (auditType != null ? !auditType.equals(that.auditType) : that.auditType != null) return false;
        if (entityClass != null ? !entityClass.equals(that.entityClass) : that.entityClass != null) return false;
        if (entityId != null ? !entityId.equals(that.entityId) : that.entityId != null) return false;
        if (valueAfter != null ? !valueAfter.equals(that.valueAfter) : that.valueAfter != null) return false;
        if (valueBefore != null ? !valueBefore.equals(that.valueBefore) : that.valueBefore != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (auditGroup != null ? auditGroup.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (auditType != null ? auditType.hashCode() : 0);
        result = 31 * result + (entityClass != null ? entityClass.hashCode() : 0);
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        result = 31 * result + (valueAfter != null ? valueAfter.hashCode() : 0);
        result = 31 * result + (valueBefore != null ? valueBefore.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
