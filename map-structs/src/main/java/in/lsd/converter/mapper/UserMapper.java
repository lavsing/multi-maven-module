package in.lsd.converter.mapper;

import in.lsd.domain.UserCommand;
import in.lsd.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserCommand userToUserCommand(User user);

  User userCommandToUser(UserCommand userCommand);
}
