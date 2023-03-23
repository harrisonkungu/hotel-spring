
package com.hotelmanager.serviceimpl;


import com.hotelmanager.dtomapper.HotelDtoMapper;
import com.hotelmanager.request.HotelRequest;
import com.hotelmanager.response.HotelResponse;
import com.hotelmanager.entity.HotelEntity;
import com.hotelmanager.repository.HotelRepository;
import com.hotelmanager.service.HotelService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;


@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    	
	

	public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
	
	@Override
	public Optional<HotelEntity> findHotelById(Long id) {
		return hotelRepository.findById(id);
	}
	
	@Override
	public List<HotelEntity> findAllHotels() {
		 return hotelRepository.findAll();
	}

	@Override
	public HotelEntity saveHotel(HotelEntity hotelEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelEntity updateHotel(HotelEntity hotelEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHotel(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HotelResponse saveHotelReq(HotelRequest hotelRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelResponse updateHotelReq(HotelRequest hotelRequest, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<HotelEntity> findHotelDetailsReq(Long hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelEntity> findAllHotelsReq() {
		// TODO Auto-generated method stub
		return null;
	}

}
