package com.queuerite1.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "queue_data", schema = "queuerite", catalog = "")
public class QueueData {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String agentCode;
    private String agentName;
    private String authorizedRep;
    private String branchName;
    private String branchSecretary;
    private String employeeIdNumber;
    private String employeeName;
    private String policyNumber;
    private String policyOwnerName;
    private String data1;
    private String data10;
    private String data11;
    private String data2;
    private String data3;
    private String data4;
    private String data5;
    private String data6;
    private String data7;
    private String data8;
    private String data9;
    private String imageFile;

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
    @Column(name = "agent_code")
    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    @Basic
    @Column(name = "agent_name")
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    @Basic
    @Column(name = "authorized_rep")
    public String getAuthorizedRep() {
        return authorizedRep;
    }

    public void setAuthorizedRep(String authorizedRep) {
        this.authorizedRep = authorizedRep;
    }

    @Basic
    @Column(name = "branch_name")
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Basic
    @Column(name = "branch_secretary")
    public String getBranchSecretary() {
        return branchSecretary;
    }

    public void setBranchSecretary(String branchSecretary) {
        this.branchSecretary = branchSecretary;
    }

    @Basic
    @Column(name = "employee_id_number")
    public String getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(String employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    @Basic
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "policy_number")
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Basic
    @Column(name = "policy_owner_name")
    public String getPolicyOwnerName() {
        return policyOwnerName;
    }

    public void setPolicyOwnerName(String policyOwnerName) {
        this.policyOwnerName = policyOwnerName;
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
    @Column(name = "data_10")
    public String getData10() {
        return data10;
    }

    public void setData10(String data10) {
        this.data10 = data10;
    }

    @Basic
    @Column(name = "data_11")
    public String getData11() {
        return data11;
    }

    public void setData11(String data11) {
        this.data11 = data11;
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
    @Column(name = "data_5")
    public String getData5() {
        return data5;
    }

    public void setData5(String data5) {
        this.data5 = data5;
    }

    @Basic
    @Column(name = "data_6")
    public String getData6() {
        return data6;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    @Basic
    @Column(name = "data_7")
    public String getData7() {
        return data7;
    }

    public void setData7(String data7) {
        this.data7 = data7;
    }

    @Basic
    @Column(name = "data_8")
    public String getData8() {
        return data8;
    }

    public void setData8(String data8) {
        this.data8 = data8;
    }

    @Basic
    @Column(name = "data_9")
    public String getData9() {
        return data9;
    }

    public void setData9(String data9) {
        this.data9 = data9;
    }

    @Basic
    @Column(name = "image_file")
    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QueueData queueData = (QueueData) o;

        if (id != queueData.id) return false;
        if (valid != queueData.valid) return false;
        if (createdOn != null ? !createdOn.equals(queueData.createdOn) : queueData.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(queueData.updatedOn) : queueData.updatedOn != null) return false;
        if (agentCode != null ? !agentCode.equals(queueData.agentCode) : queueData.agentCode != null) return false;
        if (agentName != null ? !agentName.equals(queueData.agentName) : queueData.agentName != null) return false;
        if (authorizedRep != null ? !authorizedRep.equals(queueData.authorizedRep) : queueData.authorizedRep != null)
            return false;
        if (branchName != null ? !branchName.equals(queueData.branchName) : queueData.branchName != null) return false;
        if (branchSecretary != null ? !branchSecretary.equals(queueData.branchSecretary) : queueData.branchSecretary != null)
            return false;
        if (employeeIdNumber != null ? !employeeIdNumber.equals(queueData.employeeIdNumber) : queueData.employeeIdNumber != null)
            return false;
        if (employeeName != null ? !employeeName.equals(queueData.employeeName) : queueData.employeeName != null)
            return false;
        if (policyNumber != null ? !policyNumber.equals(queueData.policyNumber) : queueData.policyNumber != null)
            return false;
        if (policyOwnerName != null ? !policyOwnerName.equals(queueData.policyOwnerName) : queueData.policyOwnerName != null)
            return false;
        if (data1 != null ? !data1.equals(queueData.data1) : queueData.data1 != null) return false;
        if (data10 != null ? !data10.equals(queueData.data10) : queueData.data10 != null) return false;
        if (data11 != null ? !data11.equals(queueData.data11) : queueData.data11 != null) return false;
        if (data2 != null ? !data2.equals(queueData.data2) : queueData.data2 != null) return false;
        if (data3 != null ? !data3.equals(queueData.data3) : queueData.data3 != null) return false;
        if (data4 != null ? !data4.equals(queueData.data4) : queueData.data4 != null) return false;
        if (data5 != null ? !data5.equals(queueData.data5) : queueData.data5 != null) return false;
        if (data6 != null ? !data6.equals(queueData.data6) : queueData.data6 != null) return false;
        if (data7 != null ? !data7.equals(queueData.data7) : queueData.data7 != null) return false;
        if (data8 != null ? !data8.equals(queueData.data8) : queueData.data8 != null) return false;
        if (data9 != null ? !data9.equals(queueData.data9) : queueData.data9 != null) return false;
        if (imageFile != null ? !imageFile.equals(queueData.imageFile) : queueData.imageFile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (agentCode != null ? agentCode.hashCode() : 0);
        result = 31 * result + (agentName != null ? agentName.hashCode() : 0);
        result = 31 * result + (authorizedRep != null ? authorizedRep.hashCode() : 0);
        result = 31 * result + (branchName != null ? branchName.hashCode() : 0);
        result = 31 * result + (branchSecretary != null ? branchSecretary.hashCode() : 0);
        result = 31 * result + (employeeIdNumber != null ? employeeIdNumber.hashCode() : 0);
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (policyNumber != null ? policyNumber.hashCode() : 0);
        result = 31 * result + (policyOwnerName != null ? policyOwnerName.hashCode() : 0);
        result = 31 * result + (data1 != null ? data1.hashCode() : 0);
        result = 31 * result + (data10 != null ? data10.hashCode() : 0);
        result = 31 * result + (data11 != null ? data11.hashCode() : 0);
        result = 31 * result + (data2 != null ? data2.hashCode() : 0);
        result = 31 * result + (data3 != null ? data3.hashCode() : 0);
        result = 31 * result + (data4 != null ? data4.hashCode() : 0);
        result = 31 * result + (data5 != null ? data5.hashCode() : 0);
        result = 31 * result + (data6 != null ? data6.hashCode() : 0);
        result = 31 * result + (data7 != null ? data7.hashCode() : 0);
        result = 31 * result + (data8 != null ? data8.hashCode() : 0);
        result = 31 * result + (data9 != null ? data9.hashCode() : 0);
        result = 31 * result + (imageFile != null ? imageFile.hashCode() : 0);
        return result;
    }
}
