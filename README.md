一起学习打卡

01、Java av47103781
02、Spring av47103781
03、Spring Mvc av47176832
04、MyBatis av47228830
05、Hibernate av47382482
06、Spring Boot av47230137
07、Spring Cloud av47228830
08、Dubbo av47009143
09、MySQL av47702905
10、Redis av47423174
11、MongoDB av47425352
12、Elasticsearch av48279989
13、Zookeeper av47773419
14、Kafka av47773990
15、Linux av47701443
16、Docker av47715282
17、Maven av47382482
18、Git av47701443
19、Jenkins av47714706
20、IDEA av47382482
21、Shiro av47382482
22、React av48033695
23、Vue av48034319
24、电商项目实战 av48308453
25、RBAC 权限系统 av48305719


IOC 控制反转：
    IOC(Inversion Of Controll,控制反转)是一种设计思想，将原本在程序中手动创建对象的控制权交给Spring框架来管理。IOC容器是Spring用来实现IOC的载       体，IOC容器实际就是一个Map(key,value)，Map中存放各种对象。
    这样可以很大程度上简化应用的开发，把应用从复杂的依赖关系中解放出来。IOC容器就像是一个工厂，当需要创建一个对象时，只需要配置好配置文件/注解即可，不用考虑对象是怎么创建出来的，大大提升了项目的可维护性，降低了开发难度。
    
AOP 面向切片编程：
    AOP（Aspect-Oriented Programming，面向切面编程）能够将那些与业务无关，却为业务模块所共同调用的逻辑或责任(例如事务处理、日志管理、权限控制等)封装起来，便于减少系统的重复代码，降低模块之间的耦合度，利于以后项目的拓展与维护。使用AOP我们可以把一些通用功能抽取出来，在需要调用的地方直接调用即，这样大大简化了代码量，提高了系统的扩展性。
    Spring AOP是基于动态代理的，如果要代理的对象实现了某个接口，那么Spring AOP就会使用jdk动态代理去创建代理对象；而对于没有实现接口的对象，就无法使用jdk动态代理，转而使用CGlib动态代理生成一个被代理对象的子类作为代理。

Spring AOP和AspectJ AOP的区别：
       Spring AOP是属于运行时增强，AspectJ AOP是编译时增强。
       Spring AOP是基于代理， AspectJ AOP是基于字节码操作。
       AspectJ AOP相比于Spring AOP更强大，Spring AOP相对来说更简单。如果切面比较少，两者性能差异不大。否则最好选择AspectJ 它比Spring AOP快很多。

