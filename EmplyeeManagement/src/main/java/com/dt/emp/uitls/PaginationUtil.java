package com.dt.emp.uitls;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;

public class PaginationUtil {
private PaginationUtil(){
}
public static org.springframework.data.domain.Pageable createPageRequest(int page, int size, String sortBy, String direction){
    Sort sort=direction.equalsIgnoreCase("DESC")
            ? Sort.by(sortBy).descending()
            :Sort.by(sortBy).ascending();
    return  PageRequest.of(page,size,sort);
}
}
