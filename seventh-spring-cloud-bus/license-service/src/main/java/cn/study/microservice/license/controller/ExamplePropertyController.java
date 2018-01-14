package cn.study.microservice.license.controller;

import cn.study.microservice.license.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamplePropertyController {
    @Autowired
    private ServiceConfig serviceConfig;

    @GetMapping("/example/property")
    public String example() {
        return serviceConfig.getExampleProperty();
    }

}
