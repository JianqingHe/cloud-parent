package org.spring.cloud.region.controller;

import org.spring.cloud.region.service.HostNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejq
 * @date 2019-01-23 16:11
 */
@RestController
public class TestHostNameController {

    private final HostNameService nameService;

    @Autowired
    public TestHostNameController(HostNameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/hi")
    public String getHostName(@RequestParam String name) {
        return nameService.testGetHostName(name);
    }
}
