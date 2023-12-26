package com.example.two.db;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStaticData() {
        return отриматиСтатистичніДані();
    }
}
