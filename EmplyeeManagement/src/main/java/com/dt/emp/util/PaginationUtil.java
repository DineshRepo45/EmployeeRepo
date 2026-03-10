package com.dt.emp.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PaginationUtil {

    public static Pageable createPageable(
            int page,int size,String sortBy
    ){
        return PageRequest.of(page,size, Sort.by(sortBy).ascending());
    }
}
