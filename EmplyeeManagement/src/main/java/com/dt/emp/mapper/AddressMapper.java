package com.dt.emp.mapper;

import com.dt.emp.dto.request.AddressRequest;
import com.dt.emp.dto.response.AddressResponse;
import com.dt.emp.entity.Address;

public class AddressMapper {
    public static Address toEntity(AddressRequest request){
        if(request==null){
            return null;
        }
        Address address=new Address();
        address.setStrect(request.getStreet());
        address.setCity(request.getCity());
        address.setZipcode(request.getZipcode());
        address.setCountry(request.getCountry());
        address.setState(request.getState());
        return address;
    }
    public static AddressResponse toDto(Address address){
        if(address==null){
            return null;
        }
        AddressResponse dto=new AddressResponse();
        dto.setStreet(address.getStrect());
        dto.setId(address.getId());
        dto.setCity(address.getCity());
        dto.setState(address.getState());
        dto.setZipcode(address.getZipcode());
        dto.setCountry(address.getCountry());
        return dto;
    }
}
