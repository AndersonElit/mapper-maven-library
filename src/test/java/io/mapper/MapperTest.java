package io.mapper;

import io.mapper.utils.Person;
import org.junit.Test;
import io.mapper.utils.Data;
import io.mapper.utils.PersonDto;
import java.util.List;
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

    @Test
    public void mapAll() {

        List<Person> personList = Data.getPersonList();
        List<PersonDto> personDtoList = Mapper.mapAll(personList, PersonDto.class);
        assertEquals(personList.size(), personDtoList.size());

        Person person = personList.get(1);
        PersonDto personDto = personDtoList.get(1);

        assertEquals(person.getName(), personDto.getName());
        assertEquals(person.getContact().getEmail(), personDto.getContact().getEmail());
        assertEquals(person.getContact().getPhone(), personDto.getContact().getPhone());

        assertNotNull(personDto.getContact());

    }
}