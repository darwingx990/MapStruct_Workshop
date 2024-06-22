package com.riwi.MapstructWorkshop.infrasctucture.abstract_services;

import com.riwi.MapstructWorkshop.api.dto.request.BookRequest;
import com.riwi.MapstructWorkshop.api.dto.response.BookResponse;

public interface IBookService extends CRUDservices<BookRequest,BookResponse,Long>{
    public final String FIELD_BY_SORT = "title";

}
