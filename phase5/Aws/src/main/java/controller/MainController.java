package controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@GetMapping("/")
	public String index()
	{
		return "Hellooo from AWS";
	}
}