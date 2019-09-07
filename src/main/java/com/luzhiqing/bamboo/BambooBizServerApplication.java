package com.luzhiqing.bamboo;

import com.luzhiqing.common.annotion.BambooApplication;
import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@BambooApplication
@EnableSwagger2
public class BambooBizServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BambooBizServerApplication.class,args);
    }
}
