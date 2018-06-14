package com.example.demo;

import com.sun.org.apache.xpath.internal.operations.Quo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Quote resp = restTemplate.getForObject("https://hack.kunderlabs.com/exam/insurance/api/insurance", Quote.class);
        log.info(resp.insuranceQty()+"");

    }

}