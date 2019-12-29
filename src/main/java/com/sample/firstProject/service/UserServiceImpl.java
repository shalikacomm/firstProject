package com.sample.firstProject.service;


import com.sample.firstProject.EntityToDtoMappers.EntityToDtoMapperUser;
import com.sample.firstProject.dto.UserRoleDto;
import com.sample.firstProject.dtoToEntityMappers.DtoToEntityMapperUser;
import com.sample.firstProject.model.UserRole;
import com.sample.firstProject.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAllUserRole() {
        return userRoleRepository.findAll();
    }

    @Override
    public List<UserRole> saveUserRole(final List<UserRoleDto> userRoles){

      List<UserRole> userRoleList = userRoles.stream().map(x -> DtoToEntityMapperUser.getuserRole(new UserRole(),x)).collect(Collectors.toList());
       return userRoleRepository.saveAll(userRoleList);
    }

    @Override
    public UserRoleDto getUserRole(final long userId){
        return EntityToDtoMapperUser.getUser(userRoleRepository.getOne(userId));
    }

    @Override
    public UserRole updateUserRole(UserRoleDto userRoleDto){
        UserRole userRole = userRoleRepository.findByName(userRoleDto.getName());
        userRole= DtoToEntityMapperUser.getuserRole(userRole,userRoleDto);
      return   userRoleRepository.saveAndFlush(userRole);
    }
}
