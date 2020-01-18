package com.cllc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cllc.model.CityVO;

@Repository
@Transactional
public class CityDAOImp implements CityDAO{

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public void insertCity(CityVO cityvo) {
		Session session = SessionFactory.getCurrentSession();
		session.saveOrUpdate(cityvo);
		
	}

	@Override
	public List viewCity() {
		Session session = SessionFactory.getCurrentSession();
		Query q = session.createQuery("from CityVO where status = true");
		return q.list();
		
	}

	@Override
	public List searchById(CityVO cityvo) {
		Session session=SessionFactory.getCurrentSession();
		Query query=session.createQuery("from CityVO where status=true and id="+cityvo.getCityId());
		return query.list();
		
	}

	
	
}
