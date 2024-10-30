package com.mit.genesis.casbase.casbase.web.mapper;

import com.mit.genesis.casbase.casbase.domain.model.User;
import com.mit.genesis.casbase.casbase.web.dto.UserDTO;

public class UserMapper {

	public static UserDTO toDto(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    public static User toEntity(UserDTO userDto) {
        return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
    }
	
}
