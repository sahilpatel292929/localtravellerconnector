package com.cllc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AreaDAOImp implements AreaDAO {
   @Autowired
   private SessionFactory sessionFactory;
}
