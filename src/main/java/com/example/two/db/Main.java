package com.example.two.db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.auth(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
