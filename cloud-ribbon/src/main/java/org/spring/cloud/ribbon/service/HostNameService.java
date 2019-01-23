package org.spring.cloud.ribbon.service;

/**
 * @author hejq
 * @date 2019-01-23 13:40
 */
public interface HostNameService {

    /**
     * 获取hostName
     *
     * @param name 传入的名称
     *
     * @return client机器的hostName
     */
    String hostName(String name);
}
