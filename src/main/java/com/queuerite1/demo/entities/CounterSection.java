package com.queuerite1.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "counter_section", schema = "queuerite", catalog = "")
public class CounterSection {
    private long counterId;
    private long sectionId;

    @Id
    @Basic
    @Column(name = "counter_id")
    public long getCounterId() {
        return counterId;
    }

    public void setCounterId(long counterId) {
        this.counterId = counterId;
    }

    @Basic
    @Column(name = "section_id")
    public long getSectionId() {
        return sectionId;
    }

    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CounterSection that = (CounterSection) o;

        if (counterId != that.counterId) return false;
        if (sectionId != that.sectionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (counterId ^ (counterId >>> 32));
        result = 31 * result + (int) (sectionId ^ (sectionId >>> 32));
        return result;
    }
}
