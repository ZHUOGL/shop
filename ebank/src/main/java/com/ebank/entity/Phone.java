package com.ebank.entity;

public class Phone {
    private Long id;
    private String phoneNumber;
    private Double cost;
    private byte status;

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getCost() {
        return cost;
    }

    public byte getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phone='" + phoneNumber + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }

    public Phone() {
    }

    public Phone(Long id, String phone, Double cost, byte status) {
        this.id = id;
        this.phoneNumber = phone;
        this.cost = cost;
        this.status = status;
    }

    public Phone(String phone, Double cost, byte status) {
        this.phoneNumber = phone;
        this.cost = cost;
        this.status = status;
    }
}
