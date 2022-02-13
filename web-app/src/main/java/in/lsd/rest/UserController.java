package in.lsd.rest;

import in.lsd.converter.mapper.UserMapper;
import in.lsd.domain.UserCommand;
import in.lsd.entities.User;

public class UserController {

  User saveUser(UserCommand command){

    return UserMapper.INSTANCE.userCommandToUser(command);
  }
}
