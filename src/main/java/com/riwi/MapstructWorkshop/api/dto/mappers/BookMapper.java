package com.riwi.MapstructWorkshop.api.dto.mappers;

import com.riwi.MapstructWorkshop.api.dto.request.BookRequest;
import com.riwi.MapstructWorkshop.api.dto.response.BookResponse;
import com.riwi.MapstructWorkshop.domain.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book requestToEntity(BookRequest request);

    BookResponse entityToResponse(Book entity);

}
