package com.example.bookstoreapi.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstoreapi.DTO.BookDTO;
import com.example.bookstoreapi.DTO.CustomerDTO;
import com.example.bookstoreapi.Entity.Book;
import com.example.bookstoreapi.Entity.Customer;

@Mapper(componentModel = "spring")
public interface EntityMap {
    EntityMap INSTANCE = Mappers.getMapper(EntityMap.class);

    // Book mappings
    BookDTO bookDTOmap(Book book);
    Book DTObookmap(BookDTO bookDTO);

    // Customer mappings
    CustomerDTO custDTOmap(Customer customer);
    Customer DTOcustmap(CustomerDTO customerDTO);
}