package com.cllc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cllc.model.StateVO;

@Repository
@Transactional
public class StateDAOImpl implements StateDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertState(StateVO stateVO) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(stateVO);
	}

	@Override
	public List viewState() {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from StateVO where status = true");
		return q.list();
	}

	@Override
	public List searchById(StateVO stateVO) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from StateVO where status=true and id="+stateVO.getStateId());
		return query.list();
	}
}
