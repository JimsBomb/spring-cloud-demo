package org.chingo.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("demo")
@RefreshScope
public class DemoController {
    @Value("${demoProp:}")
    private String demoProp;

    @RequestMapping("test")
    public Map test(@RequestParam(required = false) String input) {
        Map<String, Object> resp = new HashMap<>();
        resp.put("method", "test");
        resp.put("input", input);
        resp.put("demoProp", this.demoProp);
        return resp;
    }
}
