package com.learn.shoppingcartui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ShoppingcartUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartUiApplication.class, args);
	}
	
	/*@Bean
    AuthHeaderFilter authHeaderFilter() {
        return new AuthHeaderFilter();
    }*/

}

