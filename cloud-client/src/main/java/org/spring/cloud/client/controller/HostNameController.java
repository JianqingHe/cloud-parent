package org.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author hejq
 * @date 2019-01-23 11:55
 */
@RestController
public class HostNameController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String host(String name) {
        return "hi: " + name + ": " + port;
    }
}
