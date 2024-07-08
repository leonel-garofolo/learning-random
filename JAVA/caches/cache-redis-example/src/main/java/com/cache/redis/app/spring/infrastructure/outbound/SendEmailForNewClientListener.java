package com.cache.redis.app.spring.infrastructure.outbound;

import org.springframework.context.ApplicationListener;

public class SendEmailForNewClientListener implements ApplicationListener<ClientEmailEvent> {

    @Override
    public void onApplicationEvent(ClientEmailEvent event) {
        //TODO send an email
    }
}
