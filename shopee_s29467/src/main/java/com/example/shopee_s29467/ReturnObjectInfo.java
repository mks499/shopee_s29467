package com.example.shopee_s29467;

public class ReturnObjectInfo {
    private double newBalance;
    private int statusCode;
    public ReturnObjectInfo(int code, double balance)
    {
        newBalance = balance;
        statusCode = code;  // 0 = brak błędów
    }
    public double getNewBalance() { return newBalance; }
    public int getStatusCode() { return statusCode; }

}

