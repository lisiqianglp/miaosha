package com.miaoshaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//springboot的自动化配置
@EnableAutoConfiguration
@RestController
public class App 
{
    @RequestMapping("/")
    public String home()
    {
        return  "lisiqiang";
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);

        return  "455555";
    }
}
