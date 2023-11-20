package io.mapper.utils;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto {
    private String name;
    private ContactDto contact;
}
