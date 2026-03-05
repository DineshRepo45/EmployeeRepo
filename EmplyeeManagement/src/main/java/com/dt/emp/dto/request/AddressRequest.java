package com.dt.emp.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {
    private  String street;
    private  String city;
    private  String state;
    private  String zipcode;
    private String country;
}
