package com.cllc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cllc.model.CityVO;
import com.cllc.model.StateVO;
import com.cllc.service.CityService;
import com.cllc.service.StateService;


@Controller
public class CityController {

	@Autowired
	private CityService cityservice;
	
	@Autowired
	private StateService StateService;

	@RequestMapping(value = "/loadcity", method = RequestMethod.GET)
	public ModelAndView loadcity() {
		List ls=StateService.viewState();
		return new ModelAndView("admin/addCity", "CityVO", new CityVO()).addObject("state",ls);
	}

	@RequestMapping(value = "/insertCity", method = RequestMethod.POST)
	public ModelAndView insertCity(@ModelAttribute CityVO cityvo) {
		
		
		List ls=StateService.viewState();
		cityservice.insertCity(cityvo);
		return new ModelAndView("admin/addCity", "CityVO", new CityVO()).addObject("state",ls);
	}
	
	@RequestMapping(value = "/viewCity", method = RequestMethod.GET)
	public ModelAndView viewCity() {
		List cityList = cityservice.viewCity();
		return new ModelAndView("admin/viewCity", "cityList", cityList);
	}
	
	@RequestMapping(value = "/deleteCity", method = RequestMethod.GET)
	public ModelAndView deleteCity(@ModelAttribute CityVO cityvo,@RequestParam int id) {
	
		cityvo.setCityId(id);
		List cityList = cityservice.searchById(cityvo);
		CityVO cityVO2=(CityVO)cityList.get(0);
		cityVO2.setStatus(false);
		this.cityservice.insertCity(cityVO2);
		return new ModelAndView("redirect:/viewCity");
	}
	@RequestMapping(value = "/editCity", method = RequestMethod.GET)
	public ModelAndView editState(@ModelAttribute CityVO cityvo,@RequestParam int id) {
		cityvo.setCityId(id);
		List cityList = cityservice.searchById(cityvo);
		CityVO cityVO2=(CityVO)cityList.get(0);
		return new ModelAndView("admin/addCity", "CityVO", cityVO2);
	}
}
