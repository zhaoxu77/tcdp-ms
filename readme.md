1.普通服务
http://localhost:8763/api/device/queryByParam?param=111

2.feign

http://localhost:8764/device/queryByParam?param=133

3.熔断dashboard
http://localhost:8765/hystrix

4.zuul
http://localhost:9000/api-provider/api/device/queryByParam?param=10&token=2121

http://localhost:9000/api-consumer/device/queryByParam?param=15&token=2121

5.zikpin

http://localhost:9411/zipkin/

6.swagger
http://localhost:8763/swagger-ui.html#/