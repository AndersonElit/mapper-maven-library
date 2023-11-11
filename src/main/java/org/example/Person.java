package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private Contact contact;
}
