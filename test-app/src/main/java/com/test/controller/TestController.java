package com.test.controller;

import com.test.model.TestDto;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	Logger log = LoggerFactory.getLogger(TestController.class);

	@ApiOperation("To ping the server")
	@GetMapping("/ping")
	public String ping() {
		log.info("ping successfully");
		return "i am on web!!!";
	}
	
	@PostMapping("/calculate")
	public Double calculator(@RequestBody TestDto dto) {
		Double result = null;
		switch(dto.getOperation()) {
		case "*":
			result = dto.getNum1() * dto.getNum2();
			log.info("result :"+result);
			break;
		case "+":
			result = dto.getNum1() + dto.getNum2();
			log.info("result :"+result);
			break;
		case "/":
			result = dto.getNum1() / dto.getNum2();
			log.info("result :"+result);
			break;
		case "-":
			result = dto.getNum1() - dto.getNum2();
			log.info("result :"+result);
			break;
		default:
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not such operation");
		}
		return result;
	}
}
