package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactDto {
    private PhoneDto phone;
    private EmailDto email;
}
