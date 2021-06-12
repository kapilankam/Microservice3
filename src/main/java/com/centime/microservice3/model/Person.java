package com.centime.microservice3.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Person {
    private String name;
    private String surname;
}
