package cn.study.microservice.organization.controller;

import cn.study.microservice.organization.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamplePropertyController {
    @Autowired
    private ServiceConfig serviceConfig;

    @GetMapping("sample/property")
    public String sampleProperty() {
        return serviceConfig.getSampleProperty();
    }
}
