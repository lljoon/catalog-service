package com.polarbookshop.catalog_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST/HTTP 엔드포인트를 위한 핸들러를 정의하는 클래스로 인식
@RestController
public class HomeController {

    // 루트 엔드포인트로 GET 요청을 처리
    @GetMapping("/")
    public String getGreeting() {
        return "도서 카탈로그에 오신 것을 환영합니다.";
    }
}
