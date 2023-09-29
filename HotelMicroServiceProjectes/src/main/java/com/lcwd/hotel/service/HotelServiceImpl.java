package com.lcwd.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService {
    
	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !!!"));
	}

}
