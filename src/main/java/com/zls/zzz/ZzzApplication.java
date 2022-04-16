package com.zls.zzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zls.zzz.mapper")
public class ZzzApplication {

    public static void main(String[] args){
        SpringApplication.run(ZzzApplication.class, args);
    }

}
