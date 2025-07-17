package com.appsdeveloperblog.photoapp.api.users.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.photoapp.api.users.data.UserEntity;
import com.appsdeveloperblog.photoapp.api.users.data.UsersRepo;
import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

@Service
public class UsersServiceImplementation implements UsersService {

	UsersRepo usersRepo;
	
	@Autowired
	public UsersServiceImplementation(UsersRepo usersRepo) 
	{
		this.usersRepo = usersRepo;
	}
	
	@Override
	public UserDto createUser(UserDto userDetails) {
		
		// TODO Auto-generated method stub
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserEntity userEntity = modelMapper.map(userDetails,UserEntity.class);
		userEntity.setEncryptedPassword("test");
		
		usersRepo.save(userEntity);
		
		return null;
	}

}
