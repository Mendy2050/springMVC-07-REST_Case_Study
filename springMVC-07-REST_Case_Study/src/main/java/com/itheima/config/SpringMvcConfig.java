package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Mendy
 * @create 2023-06-28 20:19
 */
@Configuration
@ComponentScan("com.itheima")
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}

