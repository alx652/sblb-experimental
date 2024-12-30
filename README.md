

In this project, I set basic elements of a spring-boot network including a discovery service and a gateway that works with load balancing (lb).

Except for the gateway we use the context = name of service as a convention. This makes routing easier. 

Here are some example urls (9999 is the gateway port)

## discovery service 

- http://localhost:8761

# gateway service

- http://localhost:9099/actuator/gateway/routes
- http://localhost:9099/gateway/actuator/env


## hello1 service

- http://localhost:9099/hello1/greet
- http://localhost:9099/hello1/actuator/env
- http://localhost:9099/hello1/actuator/info


## hello2 service

- http://localhost:9099/hello2/greet
- http://localhost:9099/hello2/actuator/env
- http://localhost:9099/hello2/actuator/info

