package com.example.Task2.db;

public class DataBase extends БазаДаних{
    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStaticData(){
        return отриматиСтатистичніДані();
    }
}
