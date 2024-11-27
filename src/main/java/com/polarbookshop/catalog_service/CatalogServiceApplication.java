package com.polarbookshop.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration은 해당 클래스가 빈을 정의하는 클래스임을 나타낸다.
// @ComponentScan을 사용하면 컴포넌트 검색을 통해 빈을 찾아 스프링 컨텍스트에 자동으로 등록한다.
// @EnableAutoConfiguration은 스프링 부트에서 제공하는 자동 설정 기능을 활성화한다.
@SpringBootApplication
public class CatalogServiceApplication {
	// 애플리케이션을 시작하는 메서드. 현재 클래스를 애플리케이션의 부트스트랩 단계에서 실행하도록 설정한다.
	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}
