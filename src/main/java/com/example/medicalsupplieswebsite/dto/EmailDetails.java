package com.example.medicalsupplieswebsite.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private String recipient;
    private String subject;
    private String body;
}
