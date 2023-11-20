package io.mapper.utils;

import java.util.List;

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

    public static List<Person> getPersonList() {
        return List.of(
                Person.builder()
                        .name("John")
                        .contact(Contact.builder()
                                .email("john@mail.com")
                                .phone("123456789")
                                .build())
                        .build(),
                Person.builder()
                        .name("Peter")
                        .contact(Contact.builder()
                                .email("peter@mail.com")
                                .phone("987654321")
                                .build())
                        .build()
        );
    }

}
