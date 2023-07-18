package com.p2mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableAutoConfiguration 注解表示开启自动化配直 由于项目中 加了 spring-boot-starterweb 依赖
 * 因此在开启了自动化配置之后会自动进行 Spring SpringMVC 的配置
 * Java 项目的 main 方法中，通过 SpringApplication 中的run方法启动项目第一个参数传入
 * App.class ，告诉 Spring 哪个是主要组件。第二个参数是运行时输入的其他参数
 * 代码解释：
 */
@EnableAutoConfiguration
/**
 * 在控制器中提供了 个"/hello”接口，此时需要配置包扫描才能将 Hello Controller 注册到 Spring
 * MVC 中，因此在 App 类上面再添 个注解＠ComponentScan 进行包扫描
 */
@ComponentScan
/**
 * 以上两个注解也可以直接使用组合注解＠Spring BootApplication 来代替＠EnableAutoConfiguration
 * @ComponentScan
 */

public class App {
    public static void main(String[] args){
    SpringApplication.run(App.class,args);
    }
}
