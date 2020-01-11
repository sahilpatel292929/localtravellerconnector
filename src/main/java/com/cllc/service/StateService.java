package com.cllc.service;

import java.util.List;

import com.cllc.model.StateVO;

public interface StateService {

	void insertState(StateVO stateVO);

	List viewState();

	List searchById(StateVO stateVO);

}
