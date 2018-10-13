package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Counter {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private Boolean allowToEditWorkflow;
    private String audiofile;
    private Boolean canEndQueue;
    private Boolean canTransferQueue;
    private String computerName;
    private String counterNumber;
    private Boolean finishTransferQueue;
    private String ipAddress;
    private Boolean mergeSection;
    private String printService;
    private Boolean queueClickable;
    private Long sectionId;
    private Boolean canAssignUser;
    private Boolean canAssignUserToTransferQueue;
    private Boolean canCallMultipleQueue;
    private Boolean canPrioritizeTransferQueue;
    private String counterName;
    private Boolean disableCallAgain;
    private Boolean disableCancel;
    private Boolean disableFinish;
    private Boolean disableNoShow;
    private Boolean disableStandBy;
    private Boolean callSubSecByTime;

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
    @Column(name = "allow_to_edit_workflow")
    public Boolean getAllowToEditWorkflow() {
        return allowToEditWorkflow;
    }

    public void setAllowToEditWorkflow(Boolean allowToEditWorkflow) {
        this.allowToEditWorkflow = allowToEditWorkflow;
    }

    @Basic
    @Column(name = "audiofile")
    public String getAudiofile() {
        return audiofile;
    }

    public void setAudiofile(String audiofile) {
        this.audiofile = audiofile;
    }

    @Basic
    @Column(name = "can_end_queue")
    public Boolean getCanEndQueue() {
        return canEndQueue;
    }

    public void setCanEndQueue(Boolean canEndQueue) {
        this.canEndQueue = canEndQueue;
    }

    @Basic
    @Column(name = "can_transfer_queue")
    public Boolean getCanTransferQueue() {
        return canTransferQueue;
    }

    public void setCanTransferQueue(Boolean canTransferQueue) {
        this.canTransferQueue = canTransferQueue;
    }

    @Basic
    @Column(name = "computer_name")
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Basic
    @Column(name = "counter_number")
    public String getCounterNumber() {
        return counterNumber;
    }

    public void setCounterNumber(String counterNumber) {
        this.counterNumber = counterNumber;
    }

    @Basic
    @Column(name = "finish_transfer_queue")
    public Boolean getFinishTransferQueue() {
        return finishTransferQueue;
    }

    public void setFinishTransferQueue(Boolean finishTransferQueue) {
        this.finishTransferQueue = finishTransferQueue;
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
    @Column(name = "merge_section")
    public Boolean getMergeSection() {
        return mergeSection;
    }

    public void setMergeSection(Boolean mergeSection) {
        this.mergeSection = mergeSection;
    }

    @Basic
    @Column(name = "print_service")
    public String getPrintService() {
        return printService;
    }

    public void setPrintService(String printService) {
        this.printService = printService;
    }

    @Basic
    @Column(name = "queue_clickable")
    public Boolean getQueueClickable() {
        return queueClickable;
    }

    public void setQueueClickable(Boolean queueClickable) {
        this.queueClickable = queueClickable;
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
    @Column(name = "can_assign_user")
    public Boolean getCanAssignUser() {
        return canAssignUser;
    }

    public void setCanAssignUser(Boolean canAssignUser) {
        this.canAssignUser = canAssignUser;
    }

    @Basic
    @Column(name = "can_assign_user_to_transfer_queue")
    public Boolean getCanAssignUserToTransferQueue() {
        return canAssignUserToTransferQueue;
    }

    public void setCanAssignUserToTransferQueue(Boolean canAssignUserToTransferQueue) {
        this.canAssignUserToTransferQueue = canAssignUserToTransferQueue;
    }

    @Basic
    @Column(name = "can_call_multiple_queue")
    public Boolean getCanCallMultipleQueue() {
        return canCallMultipleQueue;
    }

    public void setCanCallMultipleQueue(Boolean canCallMultipleQueue) {
        this.canCallMultipleQueue = canCallMultipleQueue;
    }

    @Basic
    @Column(name = "can_prioritize_transfer_queue")
    public Boolean getCanPrioritizeTransferQueue() {
        return canPrioritizeTransferQueue;
    }

    public void setCanPrioritizeTransferQueue(Boolean canPrioritizeTransferQueue) {
        this.canPrioritizeTransferQueue = canPrioritizeTransferQueue;
    }

    @Basic
    @Column(name = "counter_name")
    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    @Basic
    @Column(name = "disable_call_again")
    public Boolean getDisableCallAgain() {
        return disableCallAgain;
    }

    public void setDisableCallAgain(Boolean disableCallAgain) {
        this.disableCallAgain = disableCallAgain;
    }

    @Basic
    @Column(name = "disable_cancel")
    public Boolean getDisableCancel() {
        return disableCancel;
    }

    public void setDisableCancel(Boolean disableCancel) {
        this.disableCancel = disableCancel;
    }

    @Basic
    @Column(name = "disable_finish")
    public Boolean getDisableFinish() {
        return disableFinish;
    }

    public void setDisableFinish(Boolean disableFinish) {
        this.disableFinish = disableFinish;
    }

    @Basic
    @Column(name = "disable_no_show")
    public Boolean getDisableNoShow() {
        return disableNoShow;
    }

    public void setDisableNoShow(Boolean disableNoShow) {
        this.disableNoShow = disableNoShow;
    }

    @Basic
    @Column(name = "disable_stand_by")
    public Boolean getDisableStandBy() {
        return disableStandBy;
    }

    public void setDisableStandBy(Boolean disableStandBy) {
        this.disableStandBy = disableStandBy;
    }

    @Basic
    @Column(name = "call_sub_sec_by_time")
    public Boolean getCallSubSecByTime() {
        return callSubSecByTime;
    }

    public void setCallSubSecByTime(Boolean callSubSecByTime) {
        this.callSubSecByTime = callSubSecByTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Counter counter = (Counter) o;

        if (id != counter.id) return false;
        if (valid != counter.valid) return false;
        if (createdOn != null ? !createdOn.equals(counter.createdOn) : counter.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(counter.updatedOn) : counter.updatedOn != null) return false;
        if (allowToEditWorkflow != null ? !allowToEditWorkflow.equals(counter.allowToEditWorkflow) : counter.allowToEditWorkflow != null)
            return false;
        if (audiofile != null ? !audiofile.equals(counter.audiofile) : counter.audiofile != null) return false;
        if (canEndQueue != null ? !canEndQueue.equals(counter.canEndQueue) : counter.canEndQueue != null) return false;
        if (canTransferQueue != null ? !canTransferQueue.equals(counter.canTransferQueue) : counter.canTransferQueue != null)
            return false;
        if (computerName != null ? !computerName.equals(counter.computerName) : counter.computerName != null)
            return false;
        if (counterNumber != null ? !counterNumber.equals(counter.counterNumber) : counter.counterNumber != null)
            return false;
        if (finishTransferQueue != null ? !finishTransferQueue.equals(counter.finishTransferQueue) : counter.finishTransferQueue != null)
            return false;
        if (ipAddress != null ? !ipAddress.equals(counter.ipAddress) : counter.ipAddress != null) return false;
        if (mergeSection != null ? !mergeSection.equals(counter.mergeSection) : counter.mergeSection != null)
            return false;
        if (printService != null ? !printService.equals(counter.printService) : counter.printService != null)
            return false;
        if (queueClickable != null ? !queueClickable.equals(counter.queueClickable) : counter.queueClickable != null)
            return false;
        if (sectionId != null ? !sectionId.equals(counter.sectionId) : counter.sectionId != null) return false;
        if (canAssignUser != null ? !canAssignUser.equals(counter.canAssignUser) : counter.canAssignUser != null)
            return false;
        if (canAssignUserToTransferQueue != null ? !canAssignUserToTransferQueue.equals(counter.canAssignUserToTransferQueue) : counter.canAssignUserToTransferQueue != null)
            return false;
        if (canCallMultipleQueue != null ? !canCallMultipleQueue.equals(counter.canCallMultipleQueue) : counter.canCallMultipleQueue != null)
            return false;
        if (canPrioritizeTransferQueue != null ? !canPrioritizeTransferQueue.equals(counter.canPrioritizeTransferQueue) : counter.canPrioritizeTransferQueue != null)
            return false;
        if (counterName != null ? !counterName.equals(counter.counterName) : counter.counterName != null) return false;
        if (disableCallAgain != null ? !disableCallAgain.equals(counter.disableCallAgain) : counter.disableCallAgain != null)
            return false;
        if (disableCancel != null ? !disableCancel.equals(counter.disableCancel) : counter.disableCancel != null)
            return false;
        if (disableFinish != null ? !disableFinish.equals(counter.disableFinish) : counter.disableFinish != null)
            return false;
        if (disableNoShow != null ? !disableNoShow.equals(counter.disableNoShow) : counter.disableNoShow != null)
            return false;
        if (disableStandBy != null ? !disableStandBy.equals(counter.disableStandBy) : counter.disableStandBy != null)
            return false;
        if (callSubSecByTime != null ? !callSubSecByTime.equals(counter.callSubSecByTime) : counter.callSubSecByTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (allowToEditWorkflow != null ? allowToEditWorkflow.hashCode() : 0);
        result = 31 * result + (audiofile != null ? audiofile.hashCode() : 0);
        result = 31 * result + (canEndQueue != null ? canEndQueue.hashCode() : 0);
        result = 31 * result + (canTransferQueue != null ? canTransferQueue.hashCode() : 0);
        result = 31 * result + (computerName != null ? computerName.hashCode() : 0);
        result = 31 * result + (counterNumber != null ? counterNumber.hashCode() : 0);
        result = 31 * result + (finishTransferQueue != null ? finishTransferQueue.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (mergeSection != null ? mergeSection.hashCode() : 0);
        result = 31 * result + (printService != null ? printService.hashCode() : 0);
        result = 31 * result + (queueClickable != null ? queueClickable.hashCode() : 0);
        result = 31 * result + (sectionId != null ? sectionId.hashCode() : 0);
        result = 31 * result + (canAssignUser != null ? canAssignUser.hashCode() : 0);
        result = 31 * result + (canAssignUserToTransferQueue != null ? canAssignUserToTransferQueue.hashCode() : 0);
        result = 31 * result + (canCallMultipleQueue != null ? canCallMultipleQueue.hashCode() : 0);
        result = 31 * result + (canPrioritizeTransferQueue != null ? canPrioritizeTransferQueue.hashCode() : 0);
        result = 31 * result + (counterName != null ? counterName.hashCode() : 0);
        result = 31 * result + (disableCallAgain != null ? disableCallAgain.hashCode() : 0);
        result = 31 * result + (disableCancel != null ? disableCancel.hashCode() : 0);
        result = 31 * result + (disableFinish != null ? disableFinish.hashCode() : 0);
        result = 31 * result + (disableNoShow != null ? disableNoShow.hashCode() : 0);
        result = 31 * result + (disableStandBy != null ? disableStandBy.hashCode() : 0);
        result = 31 * result + (callSubSecByTime != null ? callSubSecByTime.hashCode() : 0);
        return result;
    }
}
