package cn.study.microservice.license.event.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface OrgChangeSink {

    @Input("orgChangeInput")
    SubscribableChannel input();
}
