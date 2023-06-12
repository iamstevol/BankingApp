package com.iamstevol.banking_app.play;

public class Account {

    public String accountName;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountName (String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String displayMessage(String accountName) {
        String message = "Congrats!, you account name is " + getAccountName();
        return message;
    }
}
