package com.cllc.service;

import java.util.List;

import com.cllc.model.CityVO;

public interface CityService {

	void insertCity(CityVO cityvo);

	List viewCity();

	List searchById(CityVO cityvo);

}
