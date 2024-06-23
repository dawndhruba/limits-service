package djd.learn.springcloud.microservices.limits_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import djd.learn.springcloud.microservices.limits_service.beans.Limits;
import djd.learn.springcloud.microservices.limits_service.configuration.LimitsServiceConfiguration;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsServiceConfiguration configuration;
	
	@GetMapping(path = "/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
