package com.example.demo.mappers;

import com.example.demo.models.DbModel;
import com.example.demo.models.Person;
import com.example.demo.models.PersonAddress;
import com.example.demo.models.PersonResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mapping(target="person", expression = "java(convertToPerson(personAddress, personResponse))")
    DbModel convertToDbModel(PersonAddress personAddress, PersonResponse personResponse);

    @Mapping(target="address", source="personAddress")
    Person convertToPerson(PersonAddress personAddress, PersonResponse personResponse);
}
