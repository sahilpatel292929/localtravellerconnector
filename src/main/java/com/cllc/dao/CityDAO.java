package com.cllc.dao;

import java.util.List;

import com.cllc.model.CityVO;

public interface CityDAO {

	void insertCity(CityVO cityvo);

	List viewCity();

	List searchById(CityVO cityvo);

}
