本人也是前段时间才开始接触Spring Boot、Spring Cloud，进而通过Spring Cloud才知道“微服务”这一概念。之后单位的一个项目使用了Spring Cloud来实现，现在想把如何使用Spring Cloud搭建一个简单的微服务框架写下来，方便以后查阅，同时本人也希望本教程能起到抛砖引玉的作用，欢迎各位大神一起讨论学习。

本入门教程会介绍微服务架构，然后使用Spring Boot、Spring Cloud框架搭建基于微服务架构的应用，这些应用能部署到公司的私有云或者诸如Amazon、Google等公有云。

###什么是微服务

在微服务概念出现前，web应用程序大都采用一体化应用架构，即将所有功能模块都集中在一起，包括UI、业务逻辑、数据库操作逻辑等，然后打包成一个庞大的可部署的软件构件，如war包，最后部署到应用服务器上。这种架构有很多弊端。当有新的需求，应用程序就必须做出修改，然后测试、部署；当应用越来越庞大，维护成本越来越高，维护也越来越困难，最后只能重构整个应用，重构后，又是一个恶性循环。

“微服务”这个概念是2014年才逐渐进入开发者的视野。可以用一句话来概括微服务：微服务应用是由多个分布式的、松耦合的小应用聚合在一起，而这些小应用只实现了少量的定义明确的功能。换句话说，就是：搭建一个大型应用时，使用微服务架构能将这个应用分解成多个易于管理的、功能明确的小应用。这些小应用实现的功能都是从大应用中的特定功能抽取出来的，所以它们是完全独立的，不依赖于其它小应用，能够独立运行。而这些小应用之间的“交流”都是通过接口调用（同步）、消息队列（异步）等完成的。所以虽然大应用被拆分成小应用，但它们还是可以很好的协调合作，实现各种功能。

微服务架构有如下特征：

- 应用程序的逻辑被分解成多个功能明确的、具有明确责任边界的细粒度组件——微服务。
- 每个微服务都拥有自己独立的业务domain（可以理解为实体类）；完全独立，不依赖于其它任何组件；能够被多个应用程序重用。
- 微服务之间的交流基于一些基本规则。服务提供者和服务消费者之间的数据交换采用轻量级通信协议，如：HTTP和JSON。
- 微服务底层的实现具有编程语言、平台无关性。因为微服务间的交流是基于“技术无关性协议”（technology-neutral protocol），最常见的是JSON。这意味着微服务应用可以使用多种语言、技术进行搭建。

###为什么使用Spring Cloud搭建微服务应用

一体化应用架构有很多弊端，Spring开发团队发现有很多开发团队逐渐摒弃这种架构，转而向分布式应用方向研究。为应付这种转变，Spring开发团队启动了两个项目：Spring Boot和Spring Cloud。

Spring Boot是一个重新构想的Spring框架。Spring Boot基于Spring，但去掉了很多企业级的特性，并提供了一个基于Java、面向REST风格的微服务框架。使用一些简单的注解，就能搭建一个RESTful微服务应用，然后打包并部署，而且不需要应用程序容器（微服务中内置一个tomcat容器）。

微服务架构已成为目前搭建基于云的应用程序最流行的架构。为方便我们开发基于云的微服务应用，Spring开发社区启动了Spring Cloud项目。Spring Cloud框架使操作和发布微服务应用到私有或公有云变得更简便。Spring Cloud包装了多个主流的云管理方面的微服务框架，开发团队通过简单的注解就能将这些优秀的微服务框架整合到我们自己应用中来。这些微服务框架包括：Netflix Eureka(服务注册与发现)、Netflix Ribbon(客户端负载均衡)、Netflix Hysteria(熔断器)、Netflix Zuul(服务网关)、Spring Cloud Config(分布式配置)等。


**注：**

学习本教程需要一定的Spring Boot基础，若读者未接触或不熟悉，请下载根目录的“Spring Boot实战 ,丁雪丰 (译者).pdf”，然后自行学习。Spring Boot学深一点，搭建基于Spring Cloud的微服务云应用时不会太吃力。

