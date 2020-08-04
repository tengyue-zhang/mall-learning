package com.zty.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *  MyBatis配置类
 * @author Administrator
 */
@Configuration
@MapperScan("com.zty.mall.mbg.mapper")
public class MyBatisConfig {
}
