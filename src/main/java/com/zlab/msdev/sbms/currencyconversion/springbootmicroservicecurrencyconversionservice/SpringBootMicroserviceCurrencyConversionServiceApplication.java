package com.zlab.msdev.sbms.currencyconversion.springbootmicroservicecurrencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.zlab.msdev.sbms.currencyconversion.springbootmicroservicecurrencyconversionservice")
@EnableDiscoveryClient
public class SpringBootMicroserviceCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversionServiceApplication.class, args);
	}
}
