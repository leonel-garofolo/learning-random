package com.cache.redis.app.spring.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Client {
    private String id;
    private String name;
    private Integer yearOld;
}
