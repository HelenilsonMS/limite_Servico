package com.hms.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.microservice.bean.LimitesConfiguracao;

@RestController
public class LimitesCofigController {

	@GetMapping("/limites")
	public LimitesConfiguracao retornoDeLimitesDeConfiguracao() {
		
		return new LimitesConfiguracao(1000,1);
	}
	
	
}
