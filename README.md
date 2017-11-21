spring-cloud-demo
======================

spring-cloud-demo 项目致力于搭建一个通用的 spring-cloud 分布式微服务的基底工程，也就是一个基础框架，大家可以以此项目为基底再结合自己的需求来构建自己的Spring-cloud 项目。

## 项目采用的架构

项目采用 Maven + SVN + Spring-cloud-eureka + spring-cloud-config + spring-cloud-zuul + spring-cloud-bus + spring-cloud-hystrix + spring-cloud-ribbon + spring-cloud-feign

## 项目运行环境

* JDK1.8
* SVN服务器，如Visual SVN https://www.visualsvn.com/visualsvn/download/
* SVN客户端，如Tortoise SVN  https://tortoisesvn.net/downloads.html
* Maven 版本管理
* RaibbtMQ http://www.rabbitmq.com/download.html

## 项目启动方法

需要先安装SVN服务并创建config-project库，然后用SVN客户端将创建本项目中config-project文件夹内的内容复提交到config-project库中。
然后，项目中的各个Java工程都由各自工程中主类的main方法启动，启动顺序如下：
* eureka-server 访问地址：http://localhost:8761/
* eureka-config-server 
* eureka-zuul
* eureka-bus
* hystrix-dashboard 访问地址：http://localhost:10001/hystrix
* hystrix-turbine 访问地址：http://localhost:8769/turbine.stream
* eureka-config-client 访问地址：http://localhost:8081/gp
* demo-provider 启动时再控制台输入启动端口号，如8086、8087、8088，这样可以同时启动多个实例以测试负载均衡，访问地址：http://localhost:8086/call/1
* demo-consumer 访问地址：http://localhost:8083/hello

## 项目各个java工程解释

没时间解释了，快上车！