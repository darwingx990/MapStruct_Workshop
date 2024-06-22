package com.riwi.MapstructWorkshop.api.controllers;


import lombok.AllArgsConstructor;
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

//    private final IbookService BookService;
//
//
//
//    @PostMapping
//    public ResponseEntity<com.riwi.LibrosYa.Api.dto.response.BookResponse> insert(@Validated @RequestBody bookRequest request) {
//        com.riwi.LibrosYa.Api.dto.response.BookResponse response = BookService.create(request);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//    }


}
