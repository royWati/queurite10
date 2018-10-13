package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Users {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String email;
    private String firstName;
    private String ipAddress;
    private String lastName;
    private String password;
    private String username;
    private Boolean suspended;
    private String userType;
    private Long counterId;
    private Integer endNumber;
    private String imagePath;
    private String note;
    private Boolean showInMultiLogin;
    private Integer startNumber;
    private String title;

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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "suspended")
    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "counter_id")
    public Long getCounterId() {
        return counterId;
    }

    public void setCounterId(Long counterId) {
        this.counterId = counterId;
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
    @Column(name = "image_path")
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "show_in_multi_login")
    public Boolean getShowInMultiLogin() {
        return showInMultiLogin;
    }

    public void setShowInMultiLogin(Boolean showInMultiLogin) {
        this.showInMultiLogin = showInMultiLogin;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (valid != users.valid) return false;
        if (createdOn != null ? !createdOn.equals(users.createdOn) : users.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(users.updatedOn) : users.updatedOn != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null) return false;
        if (ipAddress != null ? !ipAddress.equals(users.ipAddress) : users.ipAddress != null) return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (suspended != null ? !suspended.equals(users.suspended) : users.suspended != null) return false;
        if (userType != null ? !userType.equals(users.userType) : users.userType != null) return false;
        if (counterId != null ? !counterId.equals(users.counterId) : users.counterId != null) return false;
        if (endNumber != null ? !endNumber.equals(users.endNumber) : users.endNumber != null) return false;
        if (imagePath != null ? !imagePath.equals(users.imagePath) : users.imagePath != null) return false;
        if (note != null ? !note.equals(users.note) : users.note != null) return false;
        if (showInMultiLogin != null ? !showInMultiLogin.equals(users.showInMultiLogin) : users.showInMultiLogin != null)
            return false;
        if (startNumber != null ? !startNumber.equals(users.startNumber) : users.startNumber != null) return false;
        if (title != null ? !title.equals(users.title) : users.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (suspended != null ? suspended.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (counterId != null ? counterId.hashCode() : 0);
        result = 31 * result + (endNumber != null ? endNumber.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (showInMultiLogin != null ? showInMultiLogin.hashCode() : 0);
        result = 31 * result + (startNumber != null ? startNumber.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
