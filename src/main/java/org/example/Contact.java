package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact {
    private Phone phone;
    private Email email;
}
