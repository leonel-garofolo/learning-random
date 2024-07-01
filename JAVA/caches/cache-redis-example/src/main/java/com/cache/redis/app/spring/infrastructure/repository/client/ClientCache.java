package com.cache.redis.app.spring.infrastructure.repository.client;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@Getter
@RedisHash("Client")
public class ClientCache {
    @Id
    private String id;
    private String name;
    private Integer yearOld;
}
