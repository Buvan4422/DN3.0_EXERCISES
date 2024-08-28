package com.example.bookstore.EntityMapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstore.DTO.BookDTO;
import com.example.bookstore.DTO.CustomerDTO;
import com.example.bookstore.Entity.Book;
import com.example.bookstore.Entity.Customer;

@Mapper(componentModel = "spring")
public interface EntityMapper {
    EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    // Book mappings
    BookDTO book2DTO(Book book);

    Book DTO2book(BookDTO bookDTO);

    // Customer mappings
    CustomerDTO cst2DTO(Customer customer);

    Customer DTO2cst(CustomerDTO customerDTO);
}
