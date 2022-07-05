package com.company;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String shippingAddress;
    private String shippingStreet1;
    private String shippingStreet2;
    private String shippingCity;
    private String shippingState;
    private Integer shippingZip;
    private String billingAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingStreet1() {
        return shippingStreet1;
    }

    public void setShippingStreet1(String shippingStreet1) {
        this.shippingStreet1 = shippingStreet1;
    }

    public String getShippingStreet2() {
        return shippingStreet2;
    }

    public void setShippingStreet2(String shippingStreet2) {
        this.shippingStreet2 = shippingStreet2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public Integer getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(Integer shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingStreet1() {
        return billingStreet1;
    }

    public void setBillingStreet1(String billingStreet1) {
        this.billingStreet1 = billingStreet1;
    }

    public String getBillingStreet2() {
        return billingStreet2;
    }

    public void setBillingStreet2(String billingStreet2) {
        this.billingStreet2 = billingStreet2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastName(), customer.getLastName()) && Objects.equals(getEmail(), customer.getEmail()) && Objects.equals(getPhoneNumber(), customer.getPhoneNumber()) && Objects.equals(getShippingAddress(), customer.getShippingAddress()) && Objects.equals(getShippingStreet1(), customer.getShippingStreet1()) && Objects.equals(getShippingStreet2(), customer.getShippingStreet2()) && Objects.equals(getShippingCity(), customer.getShippingCity()) && Objects.equals(getShippingState(), customer.getShippingState()) && Objects.equals(getShippingZip(), customer.getShippingZip()) && Objects.equals(getBillingAddress(), customer.getBillingAddress()) && Objects.equals(getBillingStreet1(), customer.getBillingStreet1()) && Objects.equals(getBillingStreet2(), customer.getBillingStreet2()) && Objects.equals(getBillingCity(), customer.getBillingCity()) && Objects.equals(getBillingState(), customer.getBillingState()) && Objects.equals(getBillingZip(), customer.getBillingZip()) && Objects.equals(isRewardsMember, customer.isRewardsMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getShippingAddress(), getShippingStreet1(), getShippingStreet2(), getShippingCity(), getShippingState(), getShippingZip(), getBillingAddress(), getBillingStreet1(), getBillingStreet2(), getBillingCity(), getBillingState(), getBillingZip(), isRewardsMember);
    }

    public String getBillingCity() {
        return billingCity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", shippingStreet1='" + shippingStreet1 + '\'' +
                ", shippingStreet2='" + shippingStreet2 + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZip=" + shippingZip +
                ", billingAddress='" + billingAddress + '\'' +
                ", billingStreet1='" + billingStreet1 + '\'' +
                ", billingStreet2='" + billingStreet2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip=" + billingZip +
                ", isRewardsMember=" + isRewardsMember +
                '}';
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public Integer getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(Integer billingZip) {
        this.billingZip = billingZip;
    }

    public Boolean getRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(Boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }

    private String billingStreet1;
    private String billingStreet2;
    private String billingCity;
    private String billingState;
    private Integer billingZip;
    private Boolean isRewardsMember;



}
