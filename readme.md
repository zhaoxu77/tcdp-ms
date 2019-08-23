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

7 oauth2
http://localhost:8080/oauth/authorize?client_id=client&response_type=code


http://client:secret@localhost:8080/oauth/token

grant_type = authorization_code

code = xxxx

http://localhost:8081/contents?access_token=34ad82b2-1e1a-4802-8236-2a2dacb233c3

http://localhost:8763/api/device/queryByParam?param=111&access_token=34ad82b2-1e1a-4802-8236-2a2dacb233c3