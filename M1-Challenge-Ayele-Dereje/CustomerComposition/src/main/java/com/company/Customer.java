package com.company;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean rewardsMember;

    private String billingAddress;
    private String shippingAddress;

    public Customer(String firstName, String lastName, String email, String phoneNumber, String shippingAddress, String billingAddress, boolean rewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardsMember = rewardsMember;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardMember() {
        return rewardsMember;
    }

    public void setRewardMember(boolean rewardMember) {
        this.rewardsMember = rewardMember;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = String.valueOf(billingAddress);
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = String.valueOf(shippingAddress);
    }
}
