package com.cache.redis.app.spring.infrastructure.repository.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ClientDTO {

  private String id;

  private String name;

  private Integer yearOld;

}
