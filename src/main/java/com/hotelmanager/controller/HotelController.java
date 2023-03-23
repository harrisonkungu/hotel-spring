package com.hotelmanager.controller;


import com.hotelmanager.request.HotelRequest;
import com.hotelmanager.response.HotelResponse;
import com.hotelmanager.entity.HotelEntity;
import com.hotelmanager.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/")
    public List<HotelEntity> findAllHotels() {
    	System.out.println("test--->>");
        return hotelService.findAllHotels();
    }
    

    @GetMapping("/{id}")
    public Optional<HotelEntity> findHoteleById(@PathVariable("id") Long id) {
        return hotelService.findHotelById(id);
    }

    @PostMapping("/addhotel")
    public HotelEntity saveHotel(@RequestBody HotelEntity hotelEntity) {
        return hotelService.saveHotel(hotelEntity);
    }

    @PutMapping
    public HotelEntity updateHotel(@RequestBody HotelEntity hotelEntity) {
        return hotelService.updateHotel(hotelEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable("id") Long id) {
        hotelService.deleteHotel(id);
    }

//    Using Request and Response with save and update employee

//    @PostMapping("/res")
//    public EmployeeResponse saveEmpResponse(@RequestBody EmployeeRequest employeeRequest) {
//        return employeeService.saveEmployee(employeeRequest);
//    }
//
//    @PutMapping("/res/{id}")
//    public EmployeeResponse updateEmpResponse(@RequestBody EmployeeRequest employeeRequest, @PathVariable("id") Long id) {
//        return employeeService.updateEmployee(employeeRequest, id);
//    }
//
//    @GetMapping("/{empid}")
//    public Optional<EmployeeEntity> findEmployeeDetails(@PathVariable("empid") Long empid) {
//        return employeeService.findEmployeeDetails(empid);
//    }
// 
 
}
