package com.sample.firstProject.EntityToDtoMappers;

import com.sample.firstProject.dto.UserRoleDto;
import com.sample.firstProject.model.UserRole;

public class EntityToDtoMapperUser {



    public static UserRoleDto getUser(UserRole userRole){
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setName(userRole.getName());
        userRoleDto.setStatus(userRole.getStatus());
        return userRoleDto;
    }
}
