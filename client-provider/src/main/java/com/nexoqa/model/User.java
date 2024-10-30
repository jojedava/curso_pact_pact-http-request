package com.nexoqa.model;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private String lastName;
    private String address;
    private String age;
    private Integer phoneNumber;

}
