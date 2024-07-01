package com.cache.redis.app.spring.infrastructure.repository;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@NoArgsConstructor
public class EntityDao {

  @CreatedDate
  @JsonFormat(
      shape = Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS",
      timezone = "UTC"
  )
  private Date created;

  @LastModifiedDate
  @JsonFormat(
      shape = Shape.STRING,
      pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS",
      timezone = "UTC"
  )
  private Date updated;

}
