package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Video {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String description;
    private String filename;
    private String path;
    private String title;
    private Boolean playFriday;
    private Boolean playMonday;
    private Boolean playSaturday;
    private Boolean playSunday;
    private Boolean playThursday;
    private Boolean playTuesday;
    private Boolean playWednesday;

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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "play_friday")
    public Boolean getPlayFriday() {
        return playFriday;
    }

    public void setPlayFriday(Boolean playFriday) {
        this.playFriday = playFriday;
    }

    @Basic
    @Column(name = "play_monday")
    public Boolean getPlayMonday() {
        return playMonday;
    }

    public void setPlayMonday(Boolean playMonday) {
        this.playMonday = playMonday;
    }

    @Basic
    @Column(name = "play_saturday")
    public Boolean getPlaySaturday() {
        return playSaturday;
    }

    public void setPlaySaturday(Boolean playSaturday) {
        this.playSaturday = playSaturday;
    }

    @Basic
    @Column(name = "play_sunday")
    public Boolean getPlaySunday() {
        return playSunday;
    }

    public void setPlaySunday(Boolean playSunday) {
        this.playSunday = playSunday;
    }

    @Basic
    @Column(name = "play_thursday")
    public Boolean getPlayThursday() {
        return playThursday;
    }

    public void setPlayThursday(Boolean playThursday) {
        this.playThursday = playThursday;
    }

    @Basic
    @Column(name = "play_tuesday")
    public Boolean getPlayTuesday() {
        return playTuesday;
    }

    public void setPlayTuesday(Boolean playTuesday) {
        this.playTuesday = playTuesday;
    }

    @Basic
    @Column(name = "play_wednesday")
    public Boolean getPlayWednesday() {
        return playWednesday;
    }

    public void setPlayWednesday(Boolean playWednesday) {
        this.playWednesday = playWednesday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        if (id != video.id) return false;
        if (valid != video.valid) return false;
        if (createdOn != null ? !createdOn.equals(video.createdOn) : video.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(video.updatedOn) : video.updatedOn != null) return false;
        if (description != null ? !description.equals(video.description) : video.description != null) return false;
        if (filename != null ? !filename.equals(video.filename) : video.filename != null) return false;
        if (path != null ? !path.equals(video.path) : video.path != null) return false;
        if (title != null ? !title.equals(video.title) : video.title != null) return false;
        if (playFriday != null ? !playFriday.equals(video.playFriday) : video.playFriday != null) return false;
        if (playMonday != null ? !playMonday.equals(video.playMonday) : video.playMonday != null) return false;
        if (playSaturday != null ? !playSaturday.equals(video.playSaturday) : video.playSaturday != null) return false;
        if (playSunday != null ? !playSunday.equals(video.playSunday) : video.playSunday != null) return false;
        if (playThursday != null ? !playThursday.equals(video.playThursday) : video.playThursday != null) return false;
        if (playTuesday != null ? !playTuesday.equals(video.playTuesday) : video.playTuesday != null) return false;
        if (playWednesday != null ? !playWednesday.equals(video.playWednesday) : video.playWednesday != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (playFriday != null ? playFriday.hashCode() : 0);
        result = 31 * result + (playMonday != null ? playMonday.hashCode() : 0);
        result = 31 * result + (playSaturday != null ? playSaturday.hashCode() : 0);
        result = 31 * result + (playSunday != null ? playSunday.hashCode() : 0);
        result = 31 * result + (playThursday != null ? playThursday.hashCode() : 0);
        result = 31 * result + (playTuesday != null ? playTuesday.hashCode() : 0);
        result = 31 * result + (playWednesday != null ? playWednesday.hashCode() : 0);
        return result;
    }
}
