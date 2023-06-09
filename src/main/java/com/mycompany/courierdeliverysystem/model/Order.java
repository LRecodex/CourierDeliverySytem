/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courierdeliverysystem.model;


/**
 *
 * @author Azrul Hafizam
 */

public class Order {
    private String ParcelId;
    private String CustId;
    private String recipientName;
    private String recipientAddress;
    private double weight;
    private String description;
    private String parcelType;

    public Order() {
    }

    public Order(String CustId, String recipientName, String recipientAddress, double weight, String description, String parcelType) {
        this.CustId = CustId;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.description = description;
        this.parcelType = parcelType;
    }

    public Order(String ParcelId, String CustId, String recipientName, String recipientAddress, double weight, String description, String parcelType) {
        this.ParcelId = ParcelId;
        this.CustId = CustId;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.description = description;
        this.parcelType = parcelType;
    }

    public String getParcelId() {
        return ParcelId;
    }

    public void setParcelId(String orderId) {
        this.ParcelId = orderId;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String custId) {
        this.CustId = custId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParcelType() {
        return parcelType;
    }

    public void setParcelType(String parcelType) {
        this.parcelType = parcelType;
    }

}
