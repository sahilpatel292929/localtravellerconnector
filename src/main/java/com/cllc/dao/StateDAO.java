package com.cllc.dao;

import java.util.List;

import com.cllc.model.StateVO;

public interface StateDAO {

	

	void insertState(StateVO stateVO);

	List viewState();

	List searchById(StateVO stateVO);

}
