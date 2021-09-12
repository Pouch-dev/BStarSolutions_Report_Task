package com.example.demo.CallRestTemplate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Book;


@RestController
@RequestMapping("/consume-api")
public class ApiController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static String url="http://localhost:9090/rest/";
	
	@GetMapping("/book")
	public List<Object> getBook(){
		Object[] book = restTemplate.getForObject(url + "book", Object[].class);
		return Arrays.asList(book);
	}
}
