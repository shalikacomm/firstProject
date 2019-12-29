package com.sample.firstProject.service;

import com.sample.firstProject.dto.UserRoleDto;
import com.sample.firstProject.model.UserRole;

import java.util.List;

public interface UserService {
    List<UserRole> findAllUserRole();

    List<UserRole> saveUserRole(List<UserRoleDto> userRoles);

    UserRoleDto getUserRole(long userId);

    UserRole updateUserRole(UserRoleDto userRoleDto);
}
