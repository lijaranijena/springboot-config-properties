# springboot-config-properties

## configProperties
~~~
1. this project contains the implemetation of reading the confiration file using configPropeties annotation using differnt environment.
2.we are using this to avoid multiline reading from confgi file, with this project we can acehive to read the config file using a single annotation called:@ConfigurationProperties(prefix = "person-details"), along with this we have to use @Configuration then only it will work.
~~~
## lombok
~~~
1.Used lombok to avoid generating the gett setter manuaaly, it improves readability.

@Getter
@Setter
@Slf4j
@Builder
~~~

## spring profile
~~~

1.using spring profilr we can configure environment related properties

syntax

---
spring.profiles: dev

dev env. related properties

---
spring.profiles: test

test env. related properties

pass the below in env. variable
-Dspring.profiles.active=dev

~~~
