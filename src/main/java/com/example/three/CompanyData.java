package com.example.three;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class CompanyData {
    public String domain;
    public String description;
    public String logo;
}
