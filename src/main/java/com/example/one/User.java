package com.example.one;

import java.time.LocalDate;

public interface User {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveDate();
}
