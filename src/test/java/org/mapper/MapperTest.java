package org.mapper;

import org.junit.Test;
import org.mapper.utils.Contact;
import org.mapper.utils.Data;
import org.mapper.utils.Person;
import org.mapper.utils.PersonDto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MapperTest {

    @Test
    public void map() {

        Person person = Data.getPerson();

        PersonDto personDto = Mapper.map(person, PersonDto.class);

        assertEquals(person.getName(), personDto.getName());
        assertEquals(person.getContact().getEmail(), personDto.getContact().getEmail());
        assertEquals(person.getContact().getPhone(), personDto.getContact().getPhone());

        assertNotNull(personDto.getContact());

    }
}