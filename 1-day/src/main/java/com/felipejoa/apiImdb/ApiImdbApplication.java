package com.felipejoa.apiImdb;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Redirect;
import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiImdbApplication {

	static final Duration TIMEOUT = Duration.ofSeconds(5);
	private HttpRequest request;

	public static void main(String[] args) {
		SpringApplication.run(ApiImdbApplication.class, args);

		
		
	}
	
	
	public void apiGetImdb(String route){
		
		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(TIMEOUT).followRedirects(Redirect.NORMAL).build();


		request = HttpRequest
						.newBuilder()
						.GET()
						.uri(URI.create(route))
						.timeout(TIMEOUT)
						.build();
	}






}
