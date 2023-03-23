
package com.hotelmanager.service;

import com.hotelmanager.request.HotelRequest;
import com.hotelmanager.response.HotelResponse;
import com.hotelmanager.entity.HotelEntity;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    List<HotelEntity> findAllHotels();
    
    Optional<HotelEntity> findHotelById(Long id);
    
    HotelEntity saveHotel(HotelEntity hotelEntity);
    
    HotelEntity updateHotel(HotelEntity hotelEntity);
    
    void deleteHotel(Long id);

//    Using Request for Save and Update Employee
    HotelResponse saveHotelReq(HotelRequest hotelRequest);
    
    HotelResponse updateHotelReq(HotelRequest hotelRequest, Long id);
    
	Optional<HotelEntity> findHotelDetailsReq(Long hotelid);

	List<HotelEntity> findAllHotelsReq();

}
