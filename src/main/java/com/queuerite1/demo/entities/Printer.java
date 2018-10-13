package com.queuerite1.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Printer {
    private long id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean valid;
    private String computerName;
    private String ipAddress;
    private String printService;
    private Boolean is56MmPrinter;
    private Double margin;

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
    @Column(name = "computer_name")
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
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
    @Column(name = "print_service")
    public String getPrintService() {
        return printService;
    }

    public void setPrintService(String printService) {
        this.printService = printService;
    }

    @Basic
    @Column(name = "is_56mm_printer")
    public Boolean getIs56MmPrinter() {
        return is56MmPrinter;
    }

    public void setIs56MmPrinter(Boolean is56MmPrinter) {
        this.is56MmPrinter = is56MmPrinter;
    }

    @Basic
    @Column(name = "margin")
    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Printer printer = (Printer) o;

        if (id != printer.id) return false;
        if (valid != printer.valid) return false;
        if (createdOn != null ? !createdOn.equals(printer.createdOn) : printer.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(printer.updatedOn) : printer.updatedOn != null) return false;
        if (computerName != null ? !computerName.equals(printer.computerName) : printer.computerName != null)
            return false;
        if (ipAddress != null ? !ipAddress.equals(printer.ipAddress) : printer.ipAddress != null) return false;
        if (printService != null ? !printService.equals(printer.printService) : printer.printService != null)
            return false;
        if (is56MmPrinter != null ? !is56MmPrinter.equals(printer.is56MmPrinter) : printer.is56MmPrinter != null)
            return false;
        if (margin != null ? !margin.equals(printer.margin) : printer.margin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (valid ? 1 : 0);
        result = 31 * result + (computerName != null ? computerName.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (printService != null ? printService.hashCode() : 0);
        result = 31 * result + (is56MmPrinter != null ? is56MmPrinter.hashCode() : 0);
        result = 31 * result + (margin != null ? margin.hashCode() : 0);
        return result;
    }
}
