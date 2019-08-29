package com.luzhiqing.bamboo;

import com.luzhiqing.bamboo.annotion.BambooAplication;
import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@BambooAplication
@EnableSwagger2
public class BambooBizServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BambooBizServerApplication.class,args);
    }
}
