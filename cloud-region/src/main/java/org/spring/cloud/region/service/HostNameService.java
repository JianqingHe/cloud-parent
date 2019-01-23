package org.spring.cloud.region.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hejq
 * @date 2019-01-23 16:08
 */
@FeignClient(value = "cloud-client")
public interface HostNameService {

    /**
     * 查询服务host 与 port
     *
     * @param name 手动输入名称
     * @return 访问结果
     */
    @GetMapping("/hi")
    String testGetHostName(@RequestParam("name") String name);
}
