package com.example.one;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class FacebookUser {
    public String country;
    public String mail;
    public LocalDateTime lastActiveTime;
}
