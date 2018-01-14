package cn.study.microservice.organization.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ServiceConfig {

    @Value("${sample.property}")
    private String sampleProperty;

    public String getSampleProperty() {
        return sampleProperty;
    }
}
