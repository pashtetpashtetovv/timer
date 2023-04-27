package pashtetpashtetovv.entity.mapper;

import org.mapstruct.Mapper;
import pashtetpashtetovv.entity.User;
import pashtetpashtetovv.entity.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);

}
