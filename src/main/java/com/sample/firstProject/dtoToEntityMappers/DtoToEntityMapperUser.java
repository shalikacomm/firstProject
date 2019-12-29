package com.sample.firstProject.dtoToEntityMappers;

import com.sample.firstProject.dto.UserRoleDto;
import com.sample.firstProject.enums.TransactionStatus;
import com.sample.firstProject.model.UserRole;

public class DtoToEntityMapperUser {


    public static UserRole getuserRole(UserRole userRole, UserRoleDto userRoleDto) {

        userRole.setName(userRoleDto.getName());
        userRole.setStatus(TransactionStatus.valueOf(userRoleDto.getStatus()).getCode());
        return userRole;
    }
}
