package com.riwi.MapstructWorkshop.api.controllers;


import com.riwi.MapstructWorkshop.api.dto.request.BookRequest;
import com.riwi.MapstructWorkshop.api.dto.response.BookResponse;
import com.riwi.MapstructWorkshop.infrasctucture.abstract_services.IBookService;
import com.riwi.MapstructWorkshop.infrasctucture.services.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "books")
@AllArgsConstructor
public class BookController {

    private IBookService bookService;


    @PostMapping
    public ResponseEntity<BookResponse> insert(@Validated @RequestBody BookRequest request) {
        BookResponse response = bookService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
