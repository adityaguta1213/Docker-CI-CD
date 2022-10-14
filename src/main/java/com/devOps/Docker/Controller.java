/**
 * 
 */
package com.devOps.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LENOVO
 *
 */
@RestController
public class Controller {

	@GetMapping("/healthcheck")
	public String healthcheck() {
		return "My Docker application is up";
	}
	
}
