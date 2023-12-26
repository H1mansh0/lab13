package com.example.Task1;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class TwitterUser {
    public String country;
    public String mail;
    public LocalDateTime lastActiveTime;
}
