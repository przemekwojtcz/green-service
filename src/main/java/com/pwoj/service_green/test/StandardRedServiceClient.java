package com.pwoj.service_green.test;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StandardRedServiceClient implements RedServiceClient{
    @Override
    public RedServiceResponse test() {
        RestTemplate restTemplate = new RestTemplate();
        String url
                = "http://localhost:8082/test";
        var response
                = restTemplate.getForEntity(url, RedServiceResponse.class);
        return response.getBody();
    }
}
