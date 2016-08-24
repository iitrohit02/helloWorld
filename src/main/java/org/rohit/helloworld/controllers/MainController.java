package org.rohit.helloworld.controllers;

import org.rohit.helloworld.model.SaveHelloRequest;
import org.rohit.helloworld.model.SaveHelloResponse;
import org.rohit.helloworld.service.SaveHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	SaveHelloService saveHelloService;

	@RequestMapping(value = "/saveHello")
	public SaveHelloResponse run(@RequestBody SaveHelloRequest request) {

		return saveHelloService.saveHello(request);
	}

}
