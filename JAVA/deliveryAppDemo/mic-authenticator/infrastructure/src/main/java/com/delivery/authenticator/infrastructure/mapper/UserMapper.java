package com.delivery.authenticator.infrastructure.mapper;

import com.delivery.authenticator.domain.User;
import com.delivery.authenticator.infrastructure.dao.UserDao;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserDao fromUserToUserDao(User user);

}
