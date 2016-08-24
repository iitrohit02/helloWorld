package org.rohit.helloworld.service;

import org.rohit.helloworld.dao.SaveHelloDao;
import org.rohit.helloworld.entities.SaveHelloEntity;
import org.rohit.helloworld.model.SaveHelloRequest;
import org.rohit.helloworld.model.SaveHelloResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveHelloService {

	@Autowired
	private SaveHelloDao saveHelloDao;

	public SaveHelloResponse saveHello(SaveHelloRequest request) {

		SaveHelloEntity saveHelloEntity = new SaveHelloEntity();
		
		BeanUtils.copyProperties(request, saveHelloEntity);
		
		return saveHelloDao.saveHello(saveHelloEntity);
	}

}
