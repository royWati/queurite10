package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Section {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String code;
    private String name;
    private Long processingBenchmark;
    private Long waitingBenchmark;
    private Long alertTimeStart;
    private Boolean hidden;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "processing_benchmark")
    public Long getProcessingBenchmark() {
        return processingBenchmark;
    }

    public void setProcessingBenchmark(Long processingBenchmark) {
        this.processingBenchmark = processingBenchmark;
    }

    @Basic
    @Column(name = "waiting_benchmark")
    public Long getWaitingBenchmark() {
        return waitingBenchmark;
    }

    public void setWaitingBenchmark(Long waitingBenchmark) {
        this.waitingBenchmark = waitingBenchmark;
    }

    @Basic
    @Column(name = "alert_time_start")
    public Long getAlertTimeStart() {
        return alertTimeStart;
    }

    public void setAlertTimeStart(Long alertTimeStart) {
        this.alertTimeStart = alertTimeStart;
    }

    @Basic
    @Column(name = "hidden")
    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Section section = (Section) o;

        if (id != section.id) return false;
        if (valid != section.valid) return false;
        if (createdOn != null ? !createdOn.equals(section.createdOn) : section.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(section.updatedOn) : section.updatedOn != null) return false;
        if (code != null ? !code.equals(section.code) : section.code != null) return false;
        if (name != null ? !name.equals(section.name) : section.name != null) return false;
        if (processingBenchmark != null ? !processingBenchmark.equals(section.processingBenchmark) : section.processingBenchmark != null)
            return false;
        if (waitingBenchmark != null ? !waitingBenchmark.equals(section.waitingBenchmark) : section.waitingBenchmark != null)
            return false;
        if (alertTimeStart != null ? !alertTimeStart.equals(section.alertTimeStart) : section.alertTimeStart != null)
            return false;
        if (hidden != null ? !hidden.equals(section.hidden) : section.hidden != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (processingBenchmark != null ? processingBenchmark.hashCode() : 0);
        result = 31 * result + (waitingBenchmark != null ? waitingBenchmark.hashCode() : 0);
        result = 31 * result + (alertTimeStart != null ? alertTimeStart.hashCode() : 0);
        result = 31 * result + (hidden != null ? hidden.hashCode() : 0);
        return result;
    }
}
