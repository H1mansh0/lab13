package com.example.three;


public class Main {
    public static void main(String[] args) {
        PDLReader reader = new PDLReader();
        CompanyData data = reader.parse("https://google.com/");
        System.out.println(data);
    }
}