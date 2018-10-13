package com.queuerite1.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Queue {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private Double averageWaitingTime;
    private String counterNumber;
    private String data1;
    private String data2;
    private String data3;
    private String data4;
    private Boolean hasWorkFlow;
    private String notes;
    private String patientType;
    private Boolean queueCall;
    private Timestamp queueDate;
    private long queueNumber;
    private String a;
    private String b;
    private String c;
    private String queueStatus;
    private Integer totalQueuesInProcess;
    private Long currentCounterId;
    private Long currentQueueWorkflowId;
    private Long currentWorkflowId;
    private Long serviceId;
    private Long transferQueue;
    private Timestamp appointmentDate;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private Long assignedUser;
    private Long previousCounterId;
    private Long queueDataId;
    private String prefix;
    private Boolean prioritize;
    private Boolean returned;
    private Long appointmentId;

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
    @Column(name = "average_waiting_time")
    public Double getAverageWaitingTime() {
        return averageWaitingTime;
    }

    public void setAverageWaitingTime(Double averageWaitingTime) {
        this.averageWaitingTime = averageWaitingTime;
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
    @Column(name = "data_1")
    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    @Basic
    @Column(name = "data_2")
    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    @Basic
    @Column(name = "data_3")
    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    @Basic
    @Column(name = "data_4")
    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    @Basic
    @Column(name = "has_work_flow")
    public Boolean getHasWorkFlow() {
        return hasWorkFlow;
    }

    public void setHasWorkFlow(Boolean hasWorkFlow) {
        this.hasWorkFlow = hasWorkFlow;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "patient_type")
    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    @Basic
    @Column(name = "queue_call")
    public Boolean getQueueCall() {
        return queueCall;
    }

    public void setQueueCall(Boolean queueCall) {
        this.queueCall = queueCall;
    }

    @Basic
    @Column(name = "queue_date")
    public Timestamp getQueueDate() {
        return queueDate;
    }

    public void setQueueDate(Timestamp queueDate) {
        this.queueDate = queueDate;
    }

    @Basic
    @Column(name = "queue_number")
    public long getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(long queueNumber) {
        this.queueNumber = queueNumber;
    }

    @Basic
    @Column(name = "a")
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Basic
    @Column(name = "b")
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Basic
    @Column(name = "c")
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Basic
    @Column(name = "queue_status")
    public String getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus;
    }

    @Basic
    @Column(name = "total_queues_in_process")
    public Integer getTotalQueuesInProcess() {
        return totalQueuesInProcess;
    }

    public void setTotalQueuesInProcess(Integer totalQueuesInProcess) {
        this.totalQueuesInProcess = totalQueuesInProcess;
    }

    @Basic
    @Column(name = "current_counter_id")
    public Long getCurrentCounterId() {
        return currentCounterId;
    }

    public void setCurrentCounterId(Long currentCounterId) {
        this.currentCounterId = currentCounterId;
    }

    @Basic
    @Column(name = "current_queue_workflow_id")
    public Long getCurrentQueueWorkflowId() {
        return currentQueueWorkflowId;
    }

    public void setCurrentQueueWorkflowId(Long currentQueueWorkflowId) {
        this.currentQueueWorkflowId = currentQueueWorkflowId;
    }

    @Basic
    @Column(name = "current_workflow_id")
    public Long getCurrentWorkflowId() {
        return currentWorkflowId;
    }

    public void setCurrentWorkflowId(Long currentWorkflowId) {
        this.currentWorkflowId = currentWorkflowId;
    }

    @Basic
    @Column(name = "service_id")
    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "transfer_queue")
    public Long getTransferQueue() {
        return transferQueue;
    }

    public void setTransferQueue(Long transferQueue) {
        this.transferQueue = transferQueue;
    }

    @Basic
    @Column(name = "appointment_date")
    public Timestamp getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Timestamp appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "assigned_user")
    public Long getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(Long assignedUser) {
        this.assignedUser = assignedUser;
    }

    @Basic
    @Column(name = "previous_counter_id")
    public Long getPreviousCounterId() {
        return previousCounterId;
    }

    public void setPreviousCounterId(Long previousCounterId) {
        this.previousCounterId = previousCounterId;
    }

    @Basic
    @Column(name = "queue_data_id")
    public Long getQueueDataId() {
        return queueDataId;
    }

    public void setQueueDataId(Long queueDataId) {
        this.queueDataId = queueDataId;
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
    @Column(name = "prioritize")
    public Boolean getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(Boolean prioritize) {
        this.prioritize = prioritize;
    }

    @Basic
    @Column(name = "returned")
    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    @Basic
    @Column(name = "appointment_id")
    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Queue queue = (Queue) o;

        if (id != queue.id) return false;
        if (valid != queue.valid) return false;
        if (queueNumber != queue.queueNumber) return false;
        if (createdOn != null ? !createdOn.equals(queue.createdOn) : queue.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(queue.updatedOn) : queue.updatedOn != null) return false;
        if (averageWaitingTime != null ? !averageWaitingTime.equals(queue.averageWaitingTime) : queue.averageWaitingTime != null)
            return false;
        if (counterNumber != null ? !counterNumber.equals(queue.counterNumber) : queue.counterNumber != null)
            return false;
        if (data1 != null ? !data1.equals(queue.data1) : queue.data1 != null) return false;
        if (data2 != null ? !data2.equals(queue.data2) : queue.data2 != null) return false;
        if (data3 != null ? !data3.equals(queue.data3) : queue.data3 != null) return false;
        if (data4 != null ? !data4.equals(queue.data4) : queue.data4 != null) return false;
        if (hasWorkFlow != null ? !hasWorkFlow.equals(queue.hasWorkFlow) : queue.hasWorkFlow != null) return false;
        if (notes != null ? !notes.equals(queue.notes) : queue.notes != null) return false;
        if (patientType != null ? !patientType.equals(queue.patientType) : queue.patientType != null) return false;
        if (queueCall != null ? !queueCall.equals(queue.queueCall) : queue.queueCall != null) return false;
        if (queueDate != null ? !queueDate.equals(queue.queueDate) : queue.queueDate != null) return false;
        if (a != null ? !a.equals(queue.a) : queue.a != null) return false;
        if (b != null ? !b.equals(queue.b) : queue.b != null) return false;
        if (c != null ? !c.equals(queue.c) : queue.c != null) return false;
        if (queueStatus != null ? !queueStatus.equals(queue.queueStatus) : queue.queueStatus != null) return false;
        if (totalQueuesInProcess != null ? !totalQueuesInProcess.equals(queue.totalQueuesInProcess) : queue.totalQueuesInProcess != null)
            return false;
        if (currentCounterId != null ? !currentCounterId.equals(queue.currentCounterId) : queue.currentCounterId != null)
            return false;
        if (currentQueueWorkflowId != null ? !currentQueueWorkflowId.equals(queue.currentQueueWorkflowId) : queue.currentQueueWorkflowId != null)
            return false;
        if (currentWorkflowId != null ? !currentWorkflowId.equals(queue.currentWorkflowId) : queue.currentWorkflowId != null)
            return false;
        if (serviceId != null ? !serviceId.equals(queue.serviceId) : queue.serviceId != null) return false;
        if (transferQueue != null ? !transferQueue.equals(queue.transferQueue) : queue.transferQueue != null)
            return false;
        if (appointmentDate != null ? !appointmentDate.equals(queue.appointmentDate) : queue.appointmentDate != null)
            return false;
        if (firstName != null ? !firstName.equals(queue.firstName) : queue.firstName != null) return false;
        if (lastName != null ? !lastName.equals(queue.lastName) : queue.lastName != null) return false;
        if (mobileNumber != null ? !mobileNumber.equals(queue.mobileNumber) : queue.mobileNumber != null) return false;
        if (assignedUser != null ? !assignedUser.equals(queue.assignedUser) : queue.assignedUser != null) return false;
        if (previousCounterId != null ? !previousCounterId.equals(queue.previousCounterId) : queue.previousCounterId != null)
            return false;
        if (queueDataId != null ? !queueDataId.equals(queue.queueDataId) : queue.queueDataId != null) return false;
        if (prefix != null ? !prefix.equals(queue.prefix) : queue.prefix != null) return false;
        if (prioritize != null ? !prioritize.equals(queue.prioritize) : queue.prioritize != null) return false;
        if (returned != null ? !returned.equals(queue.returned) : queue.returned != null) return false;
        if (appointmentId != null ? !appointmentId.equals(queue.appointmentId) : queue.appointmentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (averageWaitingTime != null ? averageWaitingTime.hashCode() : 0);
        result = 31 * result + (counterNumber != null ? counterNumber.hashCode() : 0);
        result = 31 * result + (data1 != null ? data1.hashCode() : 0);
        result = 31 * result + (data2 != null ? data2.hashCode() : 0);
        result = 31 * result + (data3 != null ? data3.hashCode() : 0);
        result = 31 * result + (data4 != null ? data4.hashCode() : 0);
        result = 31 * result + (hasWorkFlow != null ? hasWorkFlow.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (patientType != null ? patientType.hashCode() : 0);
        result = 31 * result + (queueCall != null ? queueCall.hashCode() : 0);
        result = 31 * result + (queueDate != null ? queueDate.hashCode() : 0);
        result = 31 * result + (int) (queueNumber ^ (queueNumber >>> 32));
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (b != null ? b.hashCode() : 0);
        result = 31 * result + (c != null ? c.hashCode() : 0);
        result = 31 * result + (queueStatus != null ? queueStatus.hashCode() : 0);
        result = 31 * result + (totalQueuesInProcess != null ? totalQueuesInProcess.hashCode() : 0);
        result = 31 * result + (currentCounterId != null ? currentCounterId.hashCode() : 0);
        result = 31 * result + (currentQueueWorkflowId != null ? currentQueueWorkflowId.hashCode() : 0);
        result = 31 * result + (currentWorkflowId != null ? currentWorkflowId.hashCode() : 0);
        result = 31 * result + (serviceId != null ? serviceId.hashCode() : 0);
        result = 31 * result + (transferQueue != null ? transferQueue.hashCode() : 0);
        result = 31 * result + (appointmentDate != null ? appointmentDate.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (assignedUser != null ? assignedUser.hashCode() : 0);
        result = 31 * result + (previousCounterId != null ? previousCounterId.hashCode() : 0);
        result = 31 * result + (queueDataId != null ? queueDataId.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (prioritize != null ? prioritize.hashCode() : 0);
        result = 31 * result + (returned != null ? returned.hashCode() : 0);
        result = 31 * result + (appointmentId != null ? appointmentId.hashCode() : 0);
        return result;
    }
}
