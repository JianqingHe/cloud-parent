#笔记
1. RestTemplate 引入时使用 @LoadBalanced注解，可以让restTemplate直接访问服务中心的应用名称，
如：http://CLOUD-CLIENT/ 可以直接用cloud-client的application name访问，服务中心会自动去访问
各个集群下的服务