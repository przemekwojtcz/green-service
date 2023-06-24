package com.pwoj.service_green.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StandardRedServiceClient implements RedServiceClient{

    @Value(value = "${redService.baseUrl}")
    private String baseUrl;
    @Override
    public RedServiceResponse test() {
        RestTemplate restTemplate = new RestTemplate();
        String url
                = baseUrl +"/test";
        var response
                = restTemplate.getForEntity(url, RedServiceResponse.class);
        return response.getBody();
    }
}
