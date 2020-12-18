### My Spring Study Demo!



# spring 配置文件 文件头
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd
       http://www.springframework.org/schema/tx
       http://www.springframework.org/schema/tx/spring-tx.xsd">
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

# spring 配置声明式事务配置
* 1.事务管理器JDBC事务
```xml
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource" />
</bean>
  ```
* 2.配置事务的通知
```xml
<!--配置事务通知-->
<tx:advice id="txAdvice" transaction-manager="transactionManager">
   <tx:attributes>
       <!--配置哪些方法使用什么样的事务,配置事务的传播特性-->
       <tx:method name="*" propagation="REQUIRED"/>
   </tx:attributes>
</tx:advice>
```
* 3.导入aop的头文件
```xml
<!--配置aop织入事务-->
<aop:config>
   <aop:pointcut id="txPointcut" expression="execution(* com.kuang.dao.*.*(..))"/>
   <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointcut"/>
</aop:config>
```
