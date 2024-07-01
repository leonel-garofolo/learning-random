package com.cache.redis.app.spring.infrastructure.repository.client;

import com.cache.redis.app.spring.infrastructure.repository.EntityDao;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "client")
public class ClientDao extends EntityDao {

  @Id
  private String id;

  private String name;

  private Integer yearOld;

}
