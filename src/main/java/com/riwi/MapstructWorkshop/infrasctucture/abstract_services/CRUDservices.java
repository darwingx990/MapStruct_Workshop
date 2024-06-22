package com.riwi.MapstructWorkshop.infrasctucture.abstract_services;

import com.riwi.MapstructWorkshop.utils.enaums.SortType;
import org.springframework.data.domain.Page;

public interface CRUDservices  <RQ,RS,ID>{

    public RS create(RQ request);

    public RS get(ID id);

    public RS update(RQ request, ID id);

    public void delete(ID id);

    public Page<RS> getAll(int page, int size, SortType sort);


}
