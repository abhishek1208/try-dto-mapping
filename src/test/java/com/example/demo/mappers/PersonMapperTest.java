package com.example.demo.mappers;

import com.example.demo.models.DbModel;
import com.example.demo.models.PersonAddress;
import com.example.demo.models.PersonResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonMapperTest {

    @Test
    void convertToDbModel() {
        PersonAddress personAddress = PersonAddress.builder()
                .city("Delhi")
                .build();

        PersonResponse personResponse = PersonResponse.builder().name("Abhishek").hobby("music").build();

        DbModel dbModel = PersonMapper.INSTANCE.convertToDbModel(personAddress, personResponse);
        assertEquals(personAddress, dbModel.getPerson().getAddress());
        assertEquals(personResponse.getName(), dbModel.getPerson().getName());
        assertEquals(personResponse.getHobby(), dbModel.getPerson().getHobby());

    }
}