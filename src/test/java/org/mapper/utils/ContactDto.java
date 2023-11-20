package org.mapper.utils;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactDto {
    private String email;
    private String phone;
}
