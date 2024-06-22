package com.riwi.MapstructWorkshop.infrasctucture.services;

import com.riwi.MapstructWorkshop.api.dto.mappers.BookMapper;
import com.riwi.MapstructWorkshop.api.dto.request.BookRequest;
import com.riwi.MapstructWorkshop.api.dto.response.BookResponse;
import com.riwi.MapstructWorkshop.domain.entities.Book;
import com.riwi.MapstructWorkshop.domain.repository.BookRepository;
import com.riwi.MapstructWorkshop.infrasctucture.abstract_services.IBookService;
import com.riwi.MapstructWorkshop.utils.enaums.SortType;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    @Override
    public BookResponse create(BookRequest request) {
        Book entity = this.bookMapper.requestToEntity(request);
        return null;
//        return bookMapper.entityToResponse(bookRepository.save(entity));
    }

    @Override
    public BookResponse get(Long id) {
        return null;
    }

    @Override
    public BookResponse update(BookRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<BookResponse> getAll(int page, int size, SortType sort) {
        return null;
    }


}
