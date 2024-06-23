package com.cache.redis.app.spring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Persona")
public class Persona {
    @Id
    private String id;
    private String nombre;
    private int edad;
}
