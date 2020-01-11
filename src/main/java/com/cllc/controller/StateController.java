package com.cllc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cllc.model.StateVO;
import com.cllc.service.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;

	@RequestMapping(value = "/loadstate", method = RequestMethod.GET)
	public ModelAndView loadstate() {
		return new ModelAndView("admin/addState", "stateVO", new StateVO());
	}

	@RequestMapping(value = "/insertState", method = RequestMethod.POST)
	public ModelAndView insertState(@ModelAttribute StateVO stateVO) {
		
		
		
		stateService.insertState(stateVO);
		return new ModelAndView("admin/addState", "stateVO", new StateVO());
	}

	@RequestMapping(value = "/viewState", method = RequestMethod.GET)
	public ModelAndView viewState() {
		List stateList = stateService.viewState();
		return new ModelAndView("admin/viewState", "stateList", stateList);
	}
	@RequestMapping(value = "/deleteState", method = RequestMethod.GET)
	public ModelAndView deleteState(@ModelAttribute StateVO stateVO,@RequestParam int id) {
	
		stateVO.setStateId(id);
		List stateList = stateService.searchById(stateVO);
		StateVO stateVO2=(StateVO)stateList.get(0);
		stateVO2.setStatus(false);
		this.stateService.insertState(stateVO2);
		return new ModelAndView("redirect:/viewState");
	}
	
	@RequestMapping(value = "/editstate", method = RequestMethod.GET)
	public ModelAndView editState(@ModelAttribute StateVO stateVO,@RequestParam int id) {
		stateVO.setStateId(id);
		List stateList = stateService.searchById(stateVO);
		StateVO stateVO2=(StateVO)stateList.get(0);
		return new ModelAndView("admin/addState", "stateVO", stateVO2);
	}
}
