package com.example.simplesoapservices

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/soap-endpoint")
class SoapEndpoint {
    @GetMapping
    @ResponseBody
    fun handleGetRequest(): String {
        return "This is a GET request from Nistha ."
    }

    @PostMapping
    @ResponseBody
    fun handleSoapRequest(@RequestBody soapRequest: String): String {
        return "Response to SOAP request: $soapRequest"
    }
}