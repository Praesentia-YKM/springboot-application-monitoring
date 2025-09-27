package com.praesentia.monitoring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ApiController {

    @GetMapping("/1")
    fun test1() : String{
        return "test API 1"
    }

    @GetMapping("/2")
    fun test2() : String{
        return "test API 2"
    }

}