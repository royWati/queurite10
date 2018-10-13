package com.queuerite1.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "service_transaction", schema = "queuerite", catalog = "")
public class ServiceTransaction {
    private long serviceId;
    private long transactionTypeId;

    @Id
    @Column(name = "id")
    public Long id;
    @Basic
    @Column(name = "service_id")
    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
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

        ServiceTransaction that = (ServiceTransaction) o;

        if (serviceId != that.serviceId) return false;
        if (transactionTypeId != that.transactionTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (serviceId ^ (serviceId >>> 32));
        result = 31 * result + (int) (transactionTypeId ^ (transactionTypeId >>> 32));
        return result;
    }
}
