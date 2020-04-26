package controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestConnectionController
{
	@GetMapping(value = "/")
	public String serverStatus()
	{
		return "Server OK.";
	}
}
