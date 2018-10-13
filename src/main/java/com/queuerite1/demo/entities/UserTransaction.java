package com.queuerite1.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_transaction", schema = "queuerite", catalog = "")
public class UserTransaction {
    private long userId;
    private long transactionTypeId;

    @Id
    @Column(name = "id")
    public Long id;
    @Basic
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "transaction_type_id")
    public long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTransaction that = (UserTransaction) o;

        if (userId != that.userId) return false;
        if (transactionTypeId != that.transactionTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (transactionTypeId ^ (transactionTypeId >>> 32));
        return result;
    }
}
