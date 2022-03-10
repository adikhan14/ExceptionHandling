package com.exceptionalHandling;

import com.exceptionalHandling.exceptionhandler.ApiRequestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingApplication.class, args);
	}

	@RequestMapping("/check/{id}")
	public String checkException(@PathVariable("id") String id){
		if (id.equalsIgnoreCase("1"))
			throw new ApiRequestException("Exception check");
		else
			return id;
	}

}
