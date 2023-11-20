package org.mapper.utils;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact {
    private String email;
    private String phone;
}
