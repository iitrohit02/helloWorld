package org.rohit.helloworld.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.rohit.helloworld.entities.SaveHelloEntity;
import org.rohit.helloworld.model.SaveHelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SaveHelloDao {

	@Autowired
	@Qualifier("hibernateSessionFactory")
	private SessionFactory factory;

	@Transactional
	public SaveHelloResponse saveHello(SaveHelloEntity request) {

		Serializable serializable = factory.getCurrentSession().save(request);
		
		SaveHelloResponse response = new SaveHelloResponse();
		response.setResponse("World");
		response.setPrimary_key(request.getId());

		return response;
	}

}
