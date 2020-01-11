package com.cllc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cllc.dao.StateDAO;
import com.cllc.model.StateVO;

@Service
@Transactional
public class StateServiceImpl implements StateService {
	@Autowired
	private StateDAO stateDAO;

	
	@Override
	public void insertState(StateVO stateVO) {
		stateDAO.insertState(stateVO);
	}

	@Override
	public List viewState() {
		return stateDAO.viewState();
	}

	@Override
	public List searchById(StateVO stateVO) {
		// TODO Auto-generated method stub
		return stateDAO.searchById(stateVO);
	}
}
