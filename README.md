### My Spring Study Demo!



# spring 配置文件 文件头
```xml
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:aop="http://www.springframework.org/schema/aop"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/aop
http://www.springframework.org/schema/aop/spring-aop.xsd">
```
# spring整合mybatis的核心配置
```xml
<!-- sqlSessionFactory   -->
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource"/>
    <property name="configLocation" value="mybatis-config.xml"/>
    <property name="mapperLocations" value="classpath:com/chy/Mapper/*.xml"/>
</bean>
<!-- SqlSessionTemplate   -->
<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
    <constructor-arg index="0" ref="sqlSessionFactory"/>
</bean>
<bean id="CityServiceImpl" class="com.chy.service.impl.CityServiceImpl">
    <property name="sqlSession" ref="sqlSession"/>
</bean>
```
* 1. 继承mapper接口实现 sqlsession的调用 
* 2. 继承里面调用SqlSessionTemplate
