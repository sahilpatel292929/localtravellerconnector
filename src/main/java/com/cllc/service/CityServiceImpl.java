package com.cllc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cllc.dao.CityDAO;
import com.cllc.model.CityVO;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDAO citydao;
	
	@Override
	public void insertCity(CityVO cityvo) {
		citydao.insertCity(cityvo);
		
	}

	@Override
	public List viewCity() {
		// TODO Auto-generated method stub
		return citydao.viewCity();
	}

	@Override
	public List searchById(CityVO cityvo) {
		// TODO Auto-generated method stub
		return citydao.searchById(cityvo);
	}

}
