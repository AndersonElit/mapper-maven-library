package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto {
    private String name;
    private String lastName;
    private ContactDto contact;
}
