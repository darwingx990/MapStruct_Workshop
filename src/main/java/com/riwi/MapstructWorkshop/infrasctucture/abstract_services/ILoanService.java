package com.riwi.MapstructWorkshop.infrasctucture.abstract_services;

import com.riwi.MapstructWorkshop.api.dto.request.BookRequest;
import com.riwi.MapstructWorkshop.api.dto.response.BookResponse;

public interface ILoanService extends CRUDservices<BookRequest,BookResponse,Long>{
}
