package com.cache.redis.app.spring.infrastructure.outbound;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Builder
@Getter
@Setter
public class ClientEmailEvent extends ApplicationEvent {

    private String name;
    private String email;

}
