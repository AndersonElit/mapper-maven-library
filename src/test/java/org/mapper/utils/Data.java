package org.mapper.utils;

public class Data {
    public static Person getPerson() {
        return Person.builder()
                .name("John")
                .contact(Contact.builder()
                        .email("john@mail.com")
                        .phone("123456789")
                        .build())
                .build();
    }
}
