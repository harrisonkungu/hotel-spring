package com.hotelmanager.dtomapper;

import com.hotelmanager.request.HotelRequest;
import com.hotelmanager.response.HotelResponse;
import com.hotelmanager.entity.HotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelDtoMapper {
	HotelDtoMapper MAPPER = Mappers.getMapper(HotelDtoMapper.class);
    HotelEntity fromRequestToEntity(HotelRequest hotelRequest);
    HotelResponse fromEntityToResponse(HotelEntity hotelEntity);
}
