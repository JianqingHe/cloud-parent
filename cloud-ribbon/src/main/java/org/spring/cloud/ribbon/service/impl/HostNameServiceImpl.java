package org.spring.cloud.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.spring.cloud.ribbon.service.HostNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author hejq
 * @date 2019-01-23 13:41
 */
@Service
public class HostNameServiceImpl implements HostNameService {

   @Autowired
   private RestTemplate restTemplate;

    /**
     * 获取hostName
     *
     * @return client机器的hostName
     */
    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hostName(String name) {
        return restTemplate.getForObject("http://CLOUD-CLIENT/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi,"+ name + ", sorry, error!";
    }
}
