package org.spring.cloud.ribbon.controller;

import org.spring.cloud.ribbon.service.HostNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejq
 * @date 2019-01-23 13:44
 */
@RestController
public class TestHelloController {

    private final HostNameService nameService;

    @Autowired
    public TestHelloController(HostNameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/ribbon/hi")
    public String getName(String name) {
        return nameService.hostName(name);
    }
}
