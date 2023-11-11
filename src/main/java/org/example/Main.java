package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Anderson")
                .lastName("Arrieta")
                .contact(Contact.builder()
                        .email(Email.builder().email("anderson@Gmail.com").build())
                        .phone(Phone.builder().phone("3503375422").build())
                        .build())
                .build();
        PersonDto personDto = Mapper.map(person, PersonDto.class);
        System.out.println(personDto);
    }
}
