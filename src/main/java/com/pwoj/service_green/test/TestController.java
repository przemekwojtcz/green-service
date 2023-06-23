package com.pwoj.service_green.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);

    private final RedServiceClient redServiceClient;

    public TestController(RedServiceClient redServiceClient) {
        this.redServiceClient = redServiceClient;
    }


    @GetMapping("/test")
    TestResponse test() {
        logger.info("Receive request to service green");
        var result = redServiceClient.test();
        logger.info("Retrieve result from service red");
        return new TestResponse("Service green and "+result.value());
    }
}
