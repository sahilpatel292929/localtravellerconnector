package com.cllc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cllc.model.AreaVO;
import com.cllc.service.AreaService;
import com.cllc.service.CityService;
import com.cllc.service.StateService;

@Controller
public class AreaController {

	@Autowired
	private AreaService areaservice;
	
	
	@Autowired
	private CityService cityservice;
	
	@Autowired
	private StateService StateService;

	@RequestMapping(value = "/loadarea", method = RequestMethod.GET)
	public ModelAndView loadarea() {
		
		List ls=cityservice.viewCity(); 
		List ls1=StateService.viewState();
		return new ModelAndView("admin/addArea", "AreaVO", new AreaVO()).addObject("city",ls).addObject("state",ls1);
	}

}
